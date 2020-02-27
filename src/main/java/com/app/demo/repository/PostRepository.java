package com.app.demo.repository;


import com.app.demo.entities.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PostRepository extends MongoRepository<Post, String> {
  List<Post> findByTitle(String title);
}
