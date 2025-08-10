package com.Aopvac.Aopvacdemo;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AirTravelAspect {

    @Before("execution(* com.Aopvac.Aopvacdemo.AirTravelProcess.checkIn(..))")
    public void showPhotoId() {
        System.out.println(" Show your photo ID before check-in.");
    }

    @Before("execution(* com.Aopvac.Aopvacdemo.AirTravelProcess.doSecurityCheck(..)) || execution(* com.Aopvac.Aopvacdemo.AirTravelProcess.doBoarding(..))")
    public void showBoardingPass() {
        System.out.println(" Show your boarding pass.");
    }

    @AfterThrowing(pointcut = "execution(* com.Aopvac.Aopvacdemo.AirTravelProcess.checkIn(..))", throwing = "ex")
    public void handleNoSeatException(NoSeatAvailableException ex) {
        System.out.println(" Please Contact Your Airline Manager: " + ex.getMessage());
    }
}
