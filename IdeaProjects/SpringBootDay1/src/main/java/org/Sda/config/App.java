package org.Sda.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class App implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        System.out.println("inside command line runner");

    }
}
