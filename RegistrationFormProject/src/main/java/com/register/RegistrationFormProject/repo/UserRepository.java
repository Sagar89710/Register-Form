package com.register.RegistrationFormProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.register.RegistrationFormProject.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
