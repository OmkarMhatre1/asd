package com.gateway.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/userServiceFallback")
    public String userServiceFallback(){

    return "User service is down at the moment please try again in some time !!";
    }

    @GetMapping("/hotelServiceFallback")
    public String hotelServiceFallback(){
        return "Hotel service is down at the moment please try again in some time !!";
    }

    @GetMapping("/ratingServiceFallback")
    public String ratingServiceFallback(){
        return "Rating service is down at the moment please try again in some time !!";
    }
}
