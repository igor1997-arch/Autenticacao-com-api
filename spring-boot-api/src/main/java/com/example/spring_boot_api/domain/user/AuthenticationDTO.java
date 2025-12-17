package com.example.spring_boot_api.domain.user;

import com.example.spring_boot_api.repositories.UserRepository;

public record AuthenticationDTO(String login, String password){
}
