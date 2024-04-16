package com.android.pawmate.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.android.pawmate.model.User;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
}

