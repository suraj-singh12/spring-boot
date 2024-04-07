package com.learning.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/*
* Eliminate verbosity in creating Java beans
* public accessor methods (getters), constructor,
* equal, hashCode, and toString are automatically created.
* Released in JDK16
* */
record Person(String name, int age) {};
record Address(String firstLine, String city) {};
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Suraj";
    }

    @Bean
    public int age() {
        return 20;
    }

    @Bean
    public Person person() {
        return new Person("Suraj", 21);
    }

    @Bean(name="userAddress")
    public Address address() {
        return new Address("Chandni Chawk", "Delhi");
    }
}
