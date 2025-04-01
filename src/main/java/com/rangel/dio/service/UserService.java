package com.rangel.dio.service;

import com.rangel.dio.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User findById(Long id);

    User create(User userToCreate);



}
