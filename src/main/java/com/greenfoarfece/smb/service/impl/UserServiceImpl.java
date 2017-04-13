package com.greenfoarfece.smb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenfoarfece.smb.dao.UserDao;
import com.greenfoarfece.smb.domain.User;
import com.greenfoarfece.smb.service.UserService;

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
