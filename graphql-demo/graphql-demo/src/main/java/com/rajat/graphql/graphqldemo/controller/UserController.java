package com.rajat.graphql.graphqldemo.controller;

import com.rajat.graphql.graphqldemo.model.Users;
import com.rajat.graphql.graphqldemo.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Controller
@Slf4j
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @QueryMapping
    public List<Users> fetchRecentUsers(@Argument int count, @Argument int offset) {
        log.info("Entered fetchAllUsers() with args :: {} & {}", count, offset);
        return userRepository.findAll();
    }

    @QueryMapping
    public List<Users> postUser(@Argument Users user) {
        log.info("Entered postUser() with args :: {}", user);
        userRepository.save(user);
        return userRepository.findAll();
    }
}
