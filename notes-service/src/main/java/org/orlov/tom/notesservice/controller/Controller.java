package org.orlov.tom.notesservice.controller;

import org.orlov.tom.notesservice.entity.Person;
import org.orlov.tom.notesservice.repository.UserRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    private UserRepository userRepository;

    public Controller(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/users")
    public ResponseEntity<Person> writeName(@RequestBody Person person) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userRepository.save(person));
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<Person> showUser(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(userRepository.findById(id).orElseThrow());
    }

    @GetMapping("/")
    public String index() {
        return "Hello";
    }
}