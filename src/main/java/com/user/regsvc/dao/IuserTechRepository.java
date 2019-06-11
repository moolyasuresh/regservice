package com.user.regsvc.dao;

import org.springframework.data.repository.CrudRepository;

import com.user.regsvc.userform.UserTechForm;

public interface IuserTechRepository extends CrudRepository<UserTechForm, Integer> {


}
