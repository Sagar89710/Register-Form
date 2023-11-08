package com.register.RegistrationFormProject.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.register.RegistrationFormProject.model.*;
import com.register.RegistrationFormProject.repo.UserRepository;
import com.register.RegistrationFormProject.web.dto.UserRegistrationDto;

@Service
public class UserServiceImp implements UserService {
	
private UserRepository userRepository;
	


	
	public UserServiceImp(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	

	@Override
	public User save(UserRegistrationDto registrationDto) {
		User user = new User(registrationDto.getFirstName(), 
				registrationDto.getLastName(), registrationDto.getEmail(),
				registrationDto.getPassword(), Arrays.asList(new Role("ROLE_USER")));
		
		return userRepository.save(user);
	}

	
	
}
