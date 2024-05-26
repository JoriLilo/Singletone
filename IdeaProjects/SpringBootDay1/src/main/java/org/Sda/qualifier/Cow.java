package org.Sda.qualifier;


import org.springframework.stereotype.Component;

@Component
public class Cow implements Animal{

    @Override
    public String sound() {
        return "Mmmuuuuuu";
    }

}
