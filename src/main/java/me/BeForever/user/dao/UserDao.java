package me.BeForever.user.dao;

import me.BeForever.user.model.User;

public interface UserDao {

    User getUserById(String id);

    User getUserByUsername(String username);

    boolean isExist(String username);

    void addUser(User user);

    void updateUser(User user);

    void updatePassword(User user);
}
