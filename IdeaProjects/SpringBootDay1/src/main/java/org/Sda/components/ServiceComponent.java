package org.Sda.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceComponent {


    //@Autowired//inject by field


    private RepositoryComponent repository;

    //Constructor injection
//    public ServiceComponent(RepositoryComponent repository) {
//        this.repository=new RepositoryComponent();
//
//    }

    public RepositoryComponent getRepository() {
        return repository;
    }


    @Autowired
    public void setRepository(RepositoryComponent repository) {
        this.repository = repository;
    }
}
