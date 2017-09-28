package com.ngxspring.starter.models;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface UserRepository extends MongoRepository<User, String> {

    public User findById(UUID id);

    public User findByName(String name);

}
