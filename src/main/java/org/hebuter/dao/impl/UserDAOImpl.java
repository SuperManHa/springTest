package org.hebuter.dao.impl;

import org.hebuter.dao.UserDAO;
import org.hebuter.model.User;

//@Component
public class UserDAOImpl implements UserDAO {

    public void save(User user) {
        System.out.println("impl user saved");
    }
}
