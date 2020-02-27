package com.app.demo.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Post {

  @Id
  public String id;

  private String title;
  private String description;

  public Post() {
  }

  public Post(String title, String description) {
    this.title = title;
    this.description = description;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "Post{" +
               "id='" + id + '\'' +
               ", title='" + title + '\'' +
               ", description='" + description + '\'' +
               '}';
  }
}
