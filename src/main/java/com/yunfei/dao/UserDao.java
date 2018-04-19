package com.yunfei.dao;


import java.util.List;

import com.yunfei.entity.User;

public interface UserDao {
	public User findbyId(String id);
	public List<User> findAll();
}
