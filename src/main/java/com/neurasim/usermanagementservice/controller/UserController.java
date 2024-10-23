package com.neurasim.usermanagementservice.controller;

import com.neurasim.usermanagementservice.model.Status;
import com.neurasim.usermanagementservice.model.UserDetails;
import com.neurasim.usermanagementservice.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@Validated
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<Status> createUser(@Valid @RequestBody UserDetails userDetails) {
        try {
            Boolean isSuccess = userService.createUser(userDetails);
            return new ResponseEntity<>(new Status(isSuccess), HttpStatus.CREATED);
        } catch (Exception ex) {
            Status status = new Status(false);
            return new ResponseEntity<>(status, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Status> updateUser(@PathVariable("id") Long userId, @Valid @RequestBody UserDetails userDetails) {
        try {
            Boolean isSuccess = userService.updateUser(userId, userDetails);
            return new ResponseEntity<>(new Status(isSuccess), HttpStatus.OK);
        } catch (Exception ex) {
            Status status = new Status(false);
            return new ResponseEntity<>(status, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDetails> fetchUserById(@PathVariable("id") Long userId) {
        try {
            UserDetails userDetails = userService.fetchUserById(userId);
            return new ResponseEntity<>(userDetails, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping
    public ResponseEntity<List<UserDetails>> fetchAllUsers() {
        try {
            List<UserDetails> usersList = userService.fetchAllUsers();
            return new ResponseEntity<>(usersList, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Status> deleteUser(@PathVariable("id") Long userId) {
        try {
            Boolean isSuccess = userService.deleteUserById(userId);
            return new ResponseEntity<>(new Status(isSuccess), HttpStatus.OK);
        } catch (Exception ex) {
            Status status = new Status(false);
            return new ResponseEntity<>(status, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
