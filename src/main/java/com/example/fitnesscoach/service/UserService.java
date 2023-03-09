package com.example.fitnesscoach.service;

import com.example.fitnesscoach.model.User;
import com.example.fitnesscoach.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User createUser(User user) {
        // TODO: implementation of logic
        return userRepository.save(user);
    }

    public User updateUser(Long id, User user) {
        // TODO: implementation of logic
       return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        // TODO: implementation of logic
    }

    public User getUserById(Long id) {
        // TODO: implementation of logic
        // TODO: Handle optional
        return userRepository.findById(id).get();
    }

    public List<User> getAllUsers() {
        // TODO: implementation of logic
        return userRepository.findAll();
    }

    public void getUserByEmail(String email){
        // TODO: implementation of logic
    }
}
