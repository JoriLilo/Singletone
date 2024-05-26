package org.Sda.qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dog implements Animal{
    @Override
    public String sound() {
        return "hum hum hum";
    }
}
