package com.travel.utils;

import org.mindrot.jbcrypt.BCrypt;

public final class PasswordHasher {

    public static String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public static Boolean checkPassword(String password, String hashPassword) {
        return BCrypt.checkpw(password, hashPassword);
    }
}
