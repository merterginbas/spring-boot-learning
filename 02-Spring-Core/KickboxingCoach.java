package com.baboli.springcoredemo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class KickboxingCoach implements Coach {

    public KickboxingCoach() {
        System.out.println("In constructor: " + getClass().getName());
    }
    /*
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMyStartupStuff: " + getClass().getName());
    }
    @PreDestroy
    public void doMyCleanUpStuff(){
        System.out.println("In doMyCleanUpStuff: " + getClass().getName());
    }
    */
    @Override
    public String getDailyWorkout() {
        return  "Boks boks boks";
    }
}
