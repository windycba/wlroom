package com.wl.edu.wlroom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wl.edu.wlroom.model.User;
import com.wl.edu.wlroom.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping(value="getUser",method=RequestMethod.GET)
	public User getUser(@RequestParam Integer id) {
		User user=userService.getUsers(id);
		return user;
	}
	@RequestMapping(value="getAll",method=RequestMethod.GET)
	public List<User> getAll() {
		List<User>  user=userService.getAll();
		return user;
	}

}
