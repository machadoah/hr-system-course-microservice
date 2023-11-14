package com.medium.machadoah.userapi.services;

import com.medium.machadoah.userapi.domain.User;

import java.util.List;

public interface UserService {
    User findById(Long id);
    List<User> findAll();
}
