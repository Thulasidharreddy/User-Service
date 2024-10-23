package com.neurasim.usermanagementservice.service;

import com.neurasim.usermanagementservice.model.UserDetails;

import java.util.List;

public interface UserService {
    //create user entry
    Boolean createUser(UserDetails user);

    // update user entry
    Boolean updateUser(Long userId, UserDetails user);

    // read user entry
    UserDetails fetchUserById(Long userId);

    // fetch list of all users from db
    List<UserDetails> fetchAllUsers();

    // delete user entry
    Boolean deleteUserById(Long userId);
}
