package org.Sda.lazy;

import org.springframework.stereotype.Component;

@Component
public class LazyComponent {

    public LazyComponent() {
        System.out.println("this is built lazily");
    }
}
