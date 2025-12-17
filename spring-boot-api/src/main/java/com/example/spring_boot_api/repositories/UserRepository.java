package com.example.spring_boot_api.repositories;

import com.example.spring_boot_api.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User,String> {
    UserDetails findByLogin(String login);
}
