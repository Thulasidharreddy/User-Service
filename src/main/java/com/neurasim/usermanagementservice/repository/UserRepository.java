package com.neurasim.usermanagementservice.repository;

import com.neurasim.usermanagementservice.model.UserDetails;

import java.util.List;

public interface UserRepository {
    Boolean createUser(UserDetails user);

    Boolean updateUser(Long userId, UserDetails user);

    UserDetails fetchUserById(Long userId);

    List<UserDetails> fetchAllUsers();

    Boolean deleteUserById(Long userId);
}