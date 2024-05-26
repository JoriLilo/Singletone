package out.sda;

import org.springframework.stereotype.Component;

@Component
public class OutSide {

    public OutSide() {
        System.out.println("this is outside the context");
    }
}
