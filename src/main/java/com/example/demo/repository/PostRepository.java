package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, Serializable>{

}
