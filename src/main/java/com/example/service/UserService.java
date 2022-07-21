package com.example.service;

import java.util.List;

import com.example.domain.UserVo;

public interface UserService {
	int insertUser(UserVo user);
	UserVo selectUser(String userid);
	List<UserVo> selectAllUsers();
	int updateUser(UserVo user);
	int deleteUser(String userid);
}
