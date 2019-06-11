package com.user.regsvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.regsvc.dao.IUserRepository;
import com.user.regsvc.userform.BasicUserProfile;


@Service
public class UserService {
	@Autowired
	private IUserRepository userRepository;
	public void setUserRepositoy(IUserRepository userrepository) {
		this.userRepository=userrepository;
		
	}
	

	 public BasicUserProfile addUser(BasicUserProfile userprofile) {
		return userRepository.save(userprofile);
	}


	public List<BasicUserProfile> getUsers() {
		// TODO Auto-generated method stub
		 return  (List<BasicUserProfile>) userRepository.findAll();
	}

	
	
}
