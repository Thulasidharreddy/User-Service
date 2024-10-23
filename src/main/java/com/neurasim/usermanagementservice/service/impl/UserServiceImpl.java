package com.neurasim.usermanagementservice.service.impl;

import com.neurasim.usermanagementservice.model.UserDetails;
import com.neurasim.usermanagementservice.repository.UserRepository;
import com.neurasim.usermanagementservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public Boolean createUser(UserDetails userDetails) {
        try {
            return userRepository.createUser(userDetails);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public Boolean updateUser(Long userId, UserDetails userDetails) {
        try {
            return userRepository.updateUser(userId, userDetails);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public UserDetails fetchUserById(Long userId) {
        try {
            return userRepository.fetchUserById(userId);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public List<UserDetails> fetchAllUsers() {
        try {
            return userRepository.fetchAllUsers();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public Boolean deleteUserById(Long userId) {
        try {
            return userRepository.deleteUserById(userId);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
