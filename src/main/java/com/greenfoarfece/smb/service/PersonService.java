package com.greenfoarfece.smb.service;

import com.greenfoarfece.smb.domain.Person;

/**
 * Interface provides business logic of {@link Person}.
 *
 * @since 13 Apr 2017
 * @version 1.0-SNAPSHOT
 * @author Sayid Sidqi
 */
public interface PersonService {
	
	/**
	 * Populate a person.
	 * @return {@link User} populated person data.
	 */
	public Person getPerson();

}
