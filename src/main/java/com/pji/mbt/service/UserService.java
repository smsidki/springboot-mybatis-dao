package com.pji.mbt.service;

import com.pji.mbt.domain.User;

/**
 * Interface provides business logic of {@link User}.
 *
 * @since 14 Mar 2017
 * @version 1.0-SNAPSHOT
 * @author Sayid Sidqi
 */
public interface UserService {

	/**
	 * Populate a user.
	 * 
	 * @return {@link User} populated user data or null if there's no data available yet
	 */
	public User getUser();

}
