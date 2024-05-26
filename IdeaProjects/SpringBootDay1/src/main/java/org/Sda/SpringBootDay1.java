package org.Sda;

import org.Sda.lazy.LazyComponent;
import org.Sda.scope.PrototypeClass;
import org.Sda.scope.SingletonClass;
import org.Sda.value.Host;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScans(value = {
        @ComponentScan("org.Sda"),
        @ComponentScan("out.sda")
})
public class SpringBootDay1 {
    public static void main(String[] args) {
       var contex=SpringApplication.run(SpringBootDay1.class);

        Host h= contex.getBean(Host.class);
        System.out.println("URL: " + h.getUrl() );
        System.out.println("user: "+ h.getU());
        System.out.println("password: "+h.getPassword());

        SingletonClass s1=contex.getBean(SingletonClass.class);
        SingletonClass s2=contex.getBean(SingletonClass.class);
        SingletonClass s3=contex.getBean(SingletonClass.class);
        SingletonClass s4=contex.getBean(SingletonClass.class);


        //fetch lazily
        LazyComponent lz=contex.getBean(LazyComponent.class);



//      get bean
//        GenericComponents gc = contex.getBean(GenericComponents.class);
//        System.out.println(gc.getValue());

        //used for dependency injection
//        ServiceComponent sc= contex.getBean(ServiceComponent.class);
//        System.out.println(sc);
    }


}
