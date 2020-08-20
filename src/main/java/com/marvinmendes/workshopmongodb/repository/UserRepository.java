package com.marvinmendes.workshopmongodb.repository;

import com.marvinmendes.workshopmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public interface UserRepository extends MongoRepository<User, String> {
}
