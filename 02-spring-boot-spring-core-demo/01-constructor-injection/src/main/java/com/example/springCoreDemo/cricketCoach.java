package com.example.springCoreDemo;


import org.springframework.stereotype.Component;

@Component
public class cricketCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "practice fast bowling for 15 minutes." ;
    }
}
