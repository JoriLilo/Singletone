package org.Sda.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("app.properties")

public class Host {

    //@Value("sdaal")
    @Value("${sda.url}" )
    private String url;

    @Value("${u}")
    private String u;  //user

    @Value("${password}")
    private String password;


//    public Host( String url) {
//        this.url = url;
//        System.out.println("URL: " + url);
//    }


    public String getUrl() {
        return url;
    }
    public String getU() {
        return u;
    }
    public String getPassword() {
        return password;
    }
}
