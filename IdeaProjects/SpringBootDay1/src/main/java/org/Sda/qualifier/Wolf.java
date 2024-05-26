package org.Sda.qualifier;

import org.springframework.stereotype.Component;

@Component
public class Wolf implements Animal{
    @Override
    public String sound() {
        return "uuu";
    }
}
