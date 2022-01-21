package com.xalodev.course.resources;

import com.xalodev.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User
                (1L, "Grazi", "grazieleloiolamota@gmail.com", "85998164001", "11062001");
        return ResponseEntity.ok().body(u);
    }
}
