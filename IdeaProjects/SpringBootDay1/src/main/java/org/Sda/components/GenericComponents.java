package org.Sda.components;

import org.springframework.stereotype.Component;


public class GenericComponents {
    public GenericComponents(){
        System.out.println("generic component");

    }

    public String getValue(){
        return "hello from method";
    }
}
