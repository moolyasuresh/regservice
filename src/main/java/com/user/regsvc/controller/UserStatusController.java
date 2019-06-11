package com.user.regsvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.user.regsvc.service.UserStatusService;
import com.user.regsvc.userform.UserStatusForm;
import com.user.regsvc.userform.UserTechForm;

@RestController
public class UserStatusController {
	
	@Autowired
	private UserStatusService userStatusService;
	
	@RequestMapping(method=RequestMethod.POST,value="/user/status")
	public void addUserTech(@RequestBody UserStatusForm userStatusForm) {
		userStatusService.addUserStatus(userStatusForm);
	}

}
