package com.baboli.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Basketball çalış!";
    }

}
