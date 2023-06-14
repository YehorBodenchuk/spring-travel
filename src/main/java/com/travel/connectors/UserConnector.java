package com.travel.connectors;

import com.travel.bom.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserConnector extends MongoRepository<User, String> {

    User findByEmail(String email);
}
