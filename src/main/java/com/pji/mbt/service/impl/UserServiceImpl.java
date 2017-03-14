package com.pji.mbt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pji.mbt.dao.UserDao;
import com.pji.mbt.domain.User;
import com.pji.mbt.service.UserService;

/**
 * Implementation class of {@link UserService}.
 *
 * @since 14 Mar 2017
 * @version 1.0-SNAPSHOT
 * @author Sayid Sidqi
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public User getUser() {
		return userDao.find(Long.valueOf(1));
	}

}
