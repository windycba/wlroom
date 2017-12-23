package com.wl.edu.wlroom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wl.edu.wlroom.dao.UserMapper;
import com.wl.edu.wlroom.model.User;
import com.wl.edu.wlroom.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	public User getUsers(Integer id) {
		User user=	userMapper.selectByPrimaryKey( id);
		return user;
	}
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userMapper.selectAll();
	}

}
