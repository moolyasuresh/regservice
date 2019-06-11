package com.user.regsvc.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.regsvc.dao.IUserStatusRepository;
import com.user.regsvc.userform.UserStatusForm;

@Service
public class UserStatusService {
	
	@Autowired
	private IUserStatusRepository iuserstatusrepository;

	
	public UserStatusForm addUserStatus(UserStatusForm userStatusForm) {
		return iuserstatusrepository.save(userStatusForm);
		
	}

}
