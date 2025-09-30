package com.jones.security_alert_api.auth;

import com.jones.security_alert_api.entities.User;
import com.jones.security_alert_api.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserRepository userRepository;
    private static final Logger log = LoggerFactory.getLogger(AuthController.class);

    public AuthController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public Iterable<User> getAllUsers() {
        log.info("CONNECTING TO USERS ENDPOINT BOOP BOOP");
        return userRepository.findAll();

    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        log.info("RETRIEVING USER DATA");
        return userRepository.findById(id).orElseThrow();
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest request) {
        log.info("Received the request: {}", request.getEmail());

        if (request.getEmail() != null && request.getPassword() != null) {
            log.info("REQUEST SUCCESSFUL");
            return ResponseEntity.ok(new AuthResponse("Success!"));
        } else {
            log.info("REQUEST INVALID OR NULL");
            return ResponseEntity.badRequest().build();
        }
    }
}