package com.baboli.springcoredemo;

public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim Coach 1000 metre yüz";
    }
}
