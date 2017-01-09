package com.backend.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.backend.model.UsersModel;
@ComponentScan
@Repository
public interface UsersDao {
	public void registerUser(UsersModel user);

}
