package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserDao;
import com.example.domain.UserVo;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public int insertUser(UserVo user) {
		return this.userDao.create(user);
	}

	@Override
	public UserVo selectUser(String userid) {
		return this.userDao.read(userid);
	}

	@Override
	public List<UserVo> selectAllUsers() {
		return this.userDao.readAll();
	}

	@Override
	public int updateUser(UserVo user) {
		return this.userDao.update(user);
	}

	@Override
	public int deleteUser(String userid) {
		return this.userDao.delete(userid);
	}

}
