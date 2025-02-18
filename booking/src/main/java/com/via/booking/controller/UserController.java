package com.via.booking.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.via.booking.model.User;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping()
    public User getUser() {
        return new User("Valentin Alberto", "valalberto@email.com", "091223424", "ADMIN", LocalDateTime.now(), LocalDateTime.now());
    }
}
