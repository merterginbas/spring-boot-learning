package com.baboli.springcoredemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// @Scope("prototype")
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run 10 s";
    }
}
