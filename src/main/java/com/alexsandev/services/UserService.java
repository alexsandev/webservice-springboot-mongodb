package com.alexsandev.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexsandev.domain.User;
import com.alexsandev.repositories.UserRepository;
import com.alexsandev.services.exceptions.ObjectNotFoundException;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(String id){
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("object not found"));
    }

    public User insert(User user){
        return repository.insert(user);
    }
}
