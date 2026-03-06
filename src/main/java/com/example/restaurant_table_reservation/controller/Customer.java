package com.example.restaurant_table_reservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Customer {
    @GetMapping("/customer")
    @ResponseBody
    public String customer(){
        return "Hello Welcome Customer"
    }
}
