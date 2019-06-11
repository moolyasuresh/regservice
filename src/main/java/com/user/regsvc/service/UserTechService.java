package com.user.regsvc.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.user.regsvc.dao.IUserRepository;
import com.user.regsvc.dao.IuserTechRepository;
import com.user.regsvc.userform.UserTechForm;

@Service
public class UserTechService {
	
	@Autowired
	private IuserTechRepository userTechRepository;
		
		
		 public UserTechForm addUserTech(UserTechForm userTechForm) {
			return userTechRepository.save(userTechForm);
		}
		
		
	}

