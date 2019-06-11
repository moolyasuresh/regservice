package com.user.regsvc.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.regsvc.dao.IUserMgmntRepository;
import com.user.regsvc.userform.UserMgmntForm;
import com.user.regsvc.userform.UserTechForm;

@Service
public class UserMgmntService {
	
	@Autowired
	private IUserMgmntRepository usermgmntrepository;
	
	
	 public UserMgmntForm addUserMgmnt(UserMgmntForm userMgmntForm) {
			return usermgmntrepository.save(userMgmntForm);
		}

}
