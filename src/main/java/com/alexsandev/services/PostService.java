package com.alexsandev.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexsandev.domain.Post;
import com.alexsandev.repositories.PostRepository;
import com.alexsandev.services.exceptions.ObjectNotFoundException;

@Service
public class PostService {
    
    @Autowired
    private PostRepository repository;

    public Post findById(String id){
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("object not found"));
    }
}
