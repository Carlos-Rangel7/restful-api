package com.rangel.dio.repository;

import com.rangel.dio.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String AccountNumber);

}
