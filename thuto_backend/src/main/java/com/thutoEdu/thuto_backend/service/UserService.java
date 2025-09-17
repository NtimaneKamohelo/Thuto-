package com.thutoEdu.thuto_backend.service;

import com.thutoEdu.thuto_backend.entity.User;
import com.thutoEdu.thuto_backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User postUser(User user){
        return userRepository.save(user);
    }

}
