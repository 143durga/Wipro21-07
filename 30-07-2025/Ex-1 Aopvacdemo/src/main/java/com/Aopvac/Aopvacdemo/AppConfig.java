package com.Aopvac.Aopvacdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.Aopvac.Aopvacdemo")
@EnableAspectJAutoProxy
public class AppConfig {
}
