package com.register.RegistrationFormProject.service;

import com.register.RegistrationFormProject.model.User;
import com.register.RegistrationFormProject.web.dto.UserRegistrationDto;

public interface UserService {
	User save(UserRegistrationDto registrationDto);
}
