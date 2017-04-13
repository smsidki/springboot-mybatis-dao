package com.greenfoarfece.smb.dao.impl;

import org.springframework.stereotype.Repository;

import com.greenfoarfece.smb.dao.UserDao;
import com.greenfoarfece.smb.domain.User;

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
