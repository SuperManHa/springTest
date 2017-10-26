package org.hebuter.dao.impl;

import org.hebuter.dao.UserDAO;
import org.hebuter.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserDAOImpl2 implements UserDAO {

    public void save(User user) {
        System.out.println("impl2 user saved");
    }
}
