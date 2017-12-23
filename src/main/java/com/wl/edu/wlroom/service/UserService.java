package com.wl.edu.wlroom.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wl.edu.wlroom.model.User;

public interface UserService {
	public User getUsers(Integer id);

	public List<User> getAll();
}
