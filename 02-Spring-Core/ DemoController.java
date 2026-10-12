package com.baboli.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    @Autowired
    public DemoController(@Qualifier("kickboxingCoach") Coach theCoach)
    // @Qualifier("tennisCoach") Coach theAnotherCoach )
    {
        myCoach = theCoach;
    }
    /*
    @Autowired
    public DemoController(@Qualifier("tennisCoach") Coach theCoach,
    @Qualifier("tennisCoach") Coach theAnotherCoach ){
        myCoach = theCoach;
    } */


    /*@Autowired
    public void setCouch(Coach theCoach) {
        myCoach = theCoach;
    } */

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
