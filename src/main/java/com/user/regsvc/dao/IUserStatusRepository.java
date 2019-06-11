package com.user.regsvc.dao;

import org.springframework.data.repository.CrudRepository;

import com.user.regsvc.userform.UserStatusForm;

public interface IUserStatusRepository extends CrudRepository<UserStatusForm, Integer> {

}
