package com.thutoEdu.thuto_backend.service;

import com.thutoEdu.thuto_backend.entity.user;
import com.thutoEdu.thuto_backend.repository.userRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class userService {

    private final userRepository userRepository;

    userService(userRepository userRepository) {
        this.userRepository = userRepository;
    }

    public user postUser(user user){
        return userRepository.save(user);
    }

}
