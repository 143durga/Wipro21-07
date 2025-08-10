package com.userservice.controller;

import com.userservice.dto.NotifyDTO;
import com.userservice.entity.User;
import com.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    private final String NOTIFY_URL = "http://localhost:8081/notify"; // Notification Service URL

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = userRepository.save(user);
        notifyChange(savedUser, "Created");
        return ResponseEntity.ok(savedUser);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User updatedData) {
        Optional<User> userOpt = userRepository.findById(id);
        if (userOpt.isEmpty()) return ResponseEntity.notFound().build();

        User user = userOpt.get();
        user.setUsername(updatedData.getUsername());
        user.setPassword(updatedData.getPassword());
        user.setAddress(updatedData.getAddress());

        userRepository.save(user);
        notifyChange(user, "Updated");
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        Optional<User> userOpt = userRepository.findById(id);
        if (userOpt.isEmpty()) return ResponseEntity.notFound().build();

        userRepository.deleteById(id);
        notifyChange(userOpt.get(), "Deleted");
        return ResponseEntity.ok().build();
    }

    private void notifyChange(User user, String action) {
        RestTemplate restTemplate = new RestTemplate();
        NotifyDTO dto = new NotifyDTO(user, action);
        restTemplate.postForObject(NOTIFY_URL, dto, Void.class);
    }
}
