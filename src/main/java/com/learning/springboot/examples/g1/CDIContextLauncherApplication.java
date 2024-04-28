package com.learning.springboot.examples.g1;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component
@Named
class BusinessClass {
    private DataService dataService;

//    @Autowired
    @Inject
    public void setDataService(DataService dataService) {
        System.out.println("Using Setter Injection");
        this.dataService = dataService;
    }

    public DataService getDataService() {
        return dataService;
    }
}

//@Component
@Named
class DataService {

}

@Configuration
@ComponentScan // now spring will do component scan in current file's package by default (com.learning.springboot.examples.a1)
public class CDIContextLauncherApplication {
    public static void main(String[] args) {

        try(var context =
                    new AnnotationConfigApplicationContext(
                            CDIContextLauncherApplication.class)) {

            System.out.println(context.getBean(BusinessClass.class).getDataService());
        }
    }
}
