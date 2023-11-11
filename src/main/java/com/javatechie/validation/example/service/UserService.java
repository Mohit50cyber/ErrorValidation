package com.javatechie.validation.example.service;

import com.javatechie.validation.example.dto.UserRequest;
import com.javatechie.validation.example.entity.User;
import com.javatechie.validation.example.repository.UserRepository;
import org.hibernate.usertype.UserCollectionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(UserRequest userRequest){
        User user = User
                .build(2,userRequest.getName(),userRequest.getEmail(),
                        userRequest.getMobile(),userRequest.getGender(),
                        userRequest.getAge(),userRequest.getNationality());
        return userRepository.save(user);
    }

    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    public User getUser(int id){
        return userRepository.findByUserId(id);
    }
}
