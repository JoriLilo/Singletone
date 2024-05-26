package org.Sda.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassB {
   // @Autowired
    private   ClassC c;

    public ClassB(ClassC c) {
        this.c = c;
    }
}
