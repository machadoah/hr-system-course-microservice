package com.medium.machadoah.userapi.services.impl;

import com.medium.machadoah.userapi.domain.User;
import com.medium.machadoah.userapi.repositories.UserRepository;
import com.medium.machadoah.userapi.services.UserService;
import com.medium.machadoah.userapi.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
