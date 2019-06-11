package com.user.regsvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.user.regsvc.service.UserTechService;
import com.user.regsvc.userform.UserTechForm;

@RestController
public class UserTechController {
	
	@Autowired
	private UserTechService usertechservice;
	
	@RequestMapping(method=RequestMethod.POST,value="/user/tech")
	public void addUserTech(@RequestBody UserTechForm userTechForm) {
		usertechservice.addUserTech(userTechForm);
	}

}
