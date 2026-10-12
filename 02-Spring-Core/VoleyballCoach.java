package com.baboli.springcoredemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class VoleyballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Voleybol çalışın kardeş";
    }

}
