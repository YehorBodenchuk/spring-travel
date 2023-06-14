package com.travel.services;

import com.travel.bom.User;
import com.travel.connectors.UserConnector;
import com.travel.validation.UserValidation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserConnector userConnector;

    private final UserValidation userValidation;

    public User register(User user) {
        userValidation.validateUser(user);
        return userConnector.insert(user);
    }
}
