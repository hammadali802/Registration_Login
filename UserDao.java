package com.example.usermanagement;

import com.example.usermanagement.User;

public interface UserDao {

	boolean addUser(User user);
	boolean isValidUser(String username, String password);
}
