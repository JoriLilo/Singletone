package org.Sda.config;


import org.Sda.components.GenericComponents;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public GenericComponents create(){
        return new GenericComponents();
    }






}
