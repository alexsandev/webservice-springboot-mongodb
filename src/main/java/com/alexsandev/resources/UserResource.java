package com.alexsandev.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alexsandev.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll(){
        User u1 = new User(1L, "Alex Rodrigues", "alex@gmail.com");
        User u2 = new User(2L, "Maria Pereira", "maria@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(u1, u2));
        return ResponseEntity.ok().body(list);
    }
}
