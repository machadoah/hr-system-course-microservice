package com.medium.machadoah.userapi;

import com.medium.machadoah.userapi.domain.User;
import com.medium.machadoah.userapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class UserApiApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(UserApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.saveAll(List.of(
                new User(null, "Antonio Henrique", "antonio@mail.com", "1234", 150.0),
                new User(null, "Antonio Henrique", "antonio@mail.com", "1234", 150.0)
        ));
    }
}
