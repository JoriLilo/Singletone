package org.Sda.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//used for demos of circular dependencies.
@Component
public class ClassA {
    //@Autowired
    private  ClassB b;

//    public ClassA(ClassB b) {
//        this.b = b;
//      }
}
