package com.devsuperior.dscommerce.tests;

import com.devsuperior.dscommerce.entities.Role;
import com.devsuperior.dscommerce.entities.User;

import java.time.LocalDate;

public class UserFactory {

    public static User createClientUser() {
        User user = new User(1L, "Maria", "maria@gmail.com", "988888888", LocalDate.parse("2001-07-25"),"$2a$10$gBjfEOsEck3aIjhnhuSwZ..M2D1wxYcOyrPu/H3ip0kh2MCXtWhmi");
        user.addRole(new Role(1L, "ROLE_CLIENT"));
        return user;
    }

    public static User createAdminUser() {
        User user = new User(2L, "Alex", "alex@gmail.com", "977777777", LocalDate.parse("1987-12-13"),"$2a$10$gBjfEOsEck3aIjhnhuSwZ..M2D1wxYcOyrPu/H3ip0kh2MCXtWhmi");
        user.addRole(new Role(2L, "ROLE_ADMIN"));
        return user;
    }

    public static User createCustomClientUser(Long id, String username) {
        User user = new User(id, "Maria", username, "988888888", LocalDate.parse("2001-07-25"),"$2a$10$gBjfEOsEck3aIjhnhuSwZ..M2D1wxYcOyrPu/H3ip0kh2MCXtWhmi");
        user.addRole(new Role(1L, "ROLE_CLIENT"));
        return user;
    }

    public static User createCustomAdminUser(Long id, String username) {
        User user = new User(id, "Alex", username, "977777777", LocalDate.parse("1987-12-13"),"$2a$10$gBjfEOsEck3aIjhnhuSwZ..M2D1wxYcOyrPu/H3ip0kh2MCXtWhmi");
        user.addRole(new Role(2L, "ROLE_ADMIN"));
        return user;
    }


}
