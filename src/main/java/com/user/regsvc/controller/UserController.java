package com.user.regsvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.user.regsvc.service.UserService;
import com.user.regsvc.userform.BasicUserProfile;
import com.user.regsvc.userform.UserTechForm;



@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/user")
	public  List<BasicUserProfile> getUserDetails() {
		return userService.getUsers();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/user")
	public BasicUserProfile addUser(@RequestBody BasicUserProfile userprofile) {
		return userService.addUser(userprofile);
	}


}
