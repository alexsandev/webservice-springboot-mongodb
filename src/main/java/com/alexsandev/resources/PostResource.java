package com.alexsandev.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alexsandev.dto.PostDTO;
import com.alexsandev.services.PostService;

@RestController
@RequestMapping(value = "posts")
public class PostResource {

    @Autowired
    private PostService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<PostDTO> findbyId(@PathVariable String id){
        return ResponseEntity.ok().body(new PostDTO(service.findById(id)));
    }
}
