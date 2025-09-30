package com.jones.security_alert_api.repositories;

import com.jones.security_alert_api.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
Optional<User> findByEmail(String email);
    Boolean existsByEmail(String email);
}
