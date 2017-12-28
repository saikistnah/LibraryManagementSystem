/**
 * 
 */
package com.library.user.Iservice;

import java.util.List;

import com.library.user.model.UserModel;

/**
 * @author Saikrishna Gudla
 *
 */
public interface Iuser {
	
	int getUsersCount();
	List<UserModel> getUsers();
	UserModel getUserByUser(String user);
	String addUser(UserModel user);
}
