package com.example.spring_boot_api.domain.user;

public record RegisterDTO(String login, String password, UserRole role) {

}
