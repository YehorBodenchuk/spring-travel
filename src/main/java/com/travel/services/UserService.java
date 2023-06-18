package com.travel.services;

import com.travel.bom.User;
import com.travel.connectors.UserConnector;
import com.travel.utils.PasswordHasher;
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
        user.setPassword(PasswordHasher.hashPassword(user.getPassword()));
        return userConnector.save(user);
    }

    public User auth(User user) {
        User resultUser = userConnector.findByEmail(user.getEmail());
        if (!PasswordHasher.checkPassword(user.getPassword(), resultUser.getPassword())) {
            return null;
        }

        return resultUser;
    }

    public User get(String userId) {
        return userConnector.getById(userId);
    }
}
