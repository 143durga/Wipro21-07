package com.Aopvac.Aopvacdemo;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AirTravelProcess atp = context.getBean(AirTravelProcess.class);

        try {
            atp.checkIn(true); 
            atp.collectBoardingPass();
            atp.doSecurityCheck();
            atp.doBoarding();
        } catch (Exception ex) {
            System.out.println(" Exception caught in main: " + ex.getMessage());
        }
    }
}
