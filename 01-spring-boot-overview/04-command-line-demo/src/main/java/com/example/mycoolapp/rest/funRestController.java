package com.example.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestController {

    // expose "/" tht return "hello world"
    @GetMapping("/")
    public String sayHello(){
        return "hello world";
    }

    // expose a new endpoint for "workout"

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k";
    }

    @GetMapping("/prayer")
    public String getDailyPrayer(){
        return "pray the lord, then break the law!";
    }


    @GetMapping("/motivation")
    public String getQuote(){
        return "Success seems to be largely a matter of hanging on after others have let go.";
    }
}
