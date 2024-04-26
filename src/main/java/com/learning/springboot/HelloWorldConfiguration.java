package com.learning.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/*
* Eliminate verbosity in creating Java beans
* public accessor methods (getters), constructor,
* equal, hashCode, and toString are automatically created.
* Released in JDK16
* */
record Person(String name, int age, Address address) {};
record Address(String firstLine, String city) {};
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Aman";
    }

    @Bean
    public int age() {
        return 20;
    }

    @Bean
    public Person person() {
        return new Person("Tony Stark", 24, new Address("New York", "US"));
    }

    // creating bean using existing beans via method call
    @Bean
    public Person person2usingMethodCall() {
        return new Person(name(), age(), address());
    }

    // creating bean using existing beans via autowiring
    @Bean
    public Person person3Parameters(String name, int age, Address userAddress) {
        // name, age, userAddress (bean name)
        return new Person(name, age, userAddress);
    }

    @Bean(name="userAddress")
    public Address address() {
        return new Address("Chandni Chawk", "Delhi");
    }
}
