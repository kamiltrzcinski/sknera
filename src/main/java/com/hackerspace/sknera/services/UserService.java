package com.hackerspace.sknera.services;

import com.hackerspace.sknera.model.User;
import com.hackerspace.sknera.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAll(String name) {
        return userRepository.findAllByName(name);
    }

    public User createUser(){
        User userToSave = User.builder()
                .build();

        return userRepository.save(userToSave);
    }
}
