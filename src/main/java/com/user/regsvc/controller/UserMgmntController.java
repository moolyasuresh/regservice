package com.user.regsvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.user.regsvc.dao.IUserMgmntRepository;
import com.user.regsvc.service.UserMgmntService;
import com.user.regsvc.userform.UserMgmntForm;
import com.user.regsvc.userform.UserTechForm;

@RestController
public class UserMgmntController {
	@Autowired
	private UserMgmntService userMgmntService;
	
	@RequestMapping(method=RequestMethod.POST,value="/user/mgmnt")
	public void addUserMgmnt(@RequestBody UserMgmntForm userMgmntForm) {
		userMgmntService.addUserMgmnt(userMgmntForm);
	}

}
