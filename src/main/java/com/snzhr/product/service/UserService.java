package com.snzhr.product.service;

import com.snzhr.product.dto.UserRegistrationDto;
import com.snzhr.product.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Repository;

@Repository
public interface UserService extends UserDetailsService {

    User findByEmail(String email);
    User save(UserRegistrationDto userRegistrationDto);
}
