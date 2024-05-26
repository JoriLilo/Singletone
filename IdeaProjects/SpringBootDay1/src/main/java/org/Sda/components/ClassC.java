package org.Sda.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassC {
   // @Autowired
    private   ClassA a;

    public ClassC(ClassA a) {
        this.a = a;
    }
}
