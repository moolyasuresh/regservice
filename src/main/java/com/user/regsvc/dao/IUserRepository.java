package com.user.regsvc.dao;


import javax.persistence.Entity;

import org.springframework.data.repository.CrudRepository;

import com.user.regsvc.userform.BasicUserProfile;
import com.user.regsvc.userform.UserTechForm;

public interface IUserRepository extends CrudRepository<BasicUserProfile, Integer> {


}
