package com.user.regsvc.dao;

import org.springframework.data.repository.CrudRepository;

import com.user.regsvc.userform.UserMgmntForm;

public interface IUserMgmntRepository extends CrudRepository<UserMgmntForm, Integer> {

}
