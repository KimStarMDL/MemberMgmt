package com.example.dao;

import java.util.List;

import com.example.domain.UserVo;

public interface UserDao {
	int create(UserVo user);
	UserVo read(String userid);
	List<UserVo> readAll();
	int update(UserVo user);
	int delete(String userid);
}
