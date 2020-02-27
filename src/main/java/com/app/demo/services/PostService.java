package com.app.demo.services;

import com.app.demo.entities.Post;
import com.app.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

  private final PostRepository repository;

  @Autowired
  public PostService(PostRepository repository) {
    this.repository = repository;
  }

  public List<Post> getAll() {
    return repository.findAll();
  }


  public Post create(Post jsonPost) {
    return repository.save(jsonPost);
  }
}
