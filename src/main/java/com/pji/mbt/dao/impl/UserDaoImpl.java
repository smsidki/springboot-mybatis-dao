package com.pji.mbt.dao.impl;

import org.springframework.stereotype.Repository;

import com.pji.mbt.dao.UserDao;
import com.pji.mbt.domain.User;

/**
 * Implementation class of {@link UserDao}.
 *
 * @since 14 Mar 2017
 * @version 1.0-SNAPSHOT
 * @author Sayid Sidqi
 */
@Repository("userDao")
public class UserDaoImpl extends CommonDaoImpl<User, Long> implements UserDao {
	
}
