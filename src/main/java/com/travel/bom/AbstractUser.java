package com.travel.bom;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
abstract class AbstractUser {

    private String id;

    private String firstName;

    private String lastName;

    private String email;

    private String password;
}
