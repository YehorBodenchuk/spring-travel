package com.travel.validation;

import com.travel.bom.User;
import com.travel.connectors.UserConnector;
import com.travel.exceptions.UserBadRequestException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserValidation {

    private final UserConnector userConnector;

    public void validateUser (User user) {
        if (user.getFirstName().length() < 3) {
            throw new UserBadRequestException("User first name cannot be less then 3 literals!");
        }

        if (user.getLastName().length() < 3) {
            throw new UserBadRequestException("User last name cannot be less then 3 literals!");
        }

        if (userConnector.findByEmail(user.getEmail()) != null) {
            throw new UserBadRequestException("This email already registered!");
        }
    }
}
