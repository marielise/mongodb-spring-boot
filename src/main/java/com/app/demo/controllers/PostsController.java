package com.app.demo.controllers;

import com.app.demo.entities.Post;
import com.app.demo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostsController {

  private final PostService service;

  @Autowired
  public PostsController(PostService service) {
    this.service = service;
  }

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public List<Post> getAll() {
    return service.getAll();
  }

  @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public Post createPost(@RequestBody Post jsonPost) {
    return service.create(jsonPost);
  }

}
