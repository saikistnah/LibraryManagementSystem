/**
 * 
 */
package com.library.user.service.Implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.library.user.Iservice.Iuser;
import com.library.user.model.UserModel;

/**
 * @author Saikrishna Gudla
 *
 */
public class UserService implements Iuser {
	
	List<UserModel> users = new ArrayList<>();

	/* (non-Javadoc)
	 * @see com.library.user.Iservice.Iuser#getUsersCount()
	 */
	@Override
	public int getUsersCount() {
		return users.size();
	}

	/* (non-Javadoc)
	 * @see com.library.user.Iservice.Iuser#getUsers()
	 */
	@Override
	public List<UserModel> getUsers() {
		return users;
	}

	/* (non-Javadoc)
	 * @see com.library.user.Iservice.Iuser#getUserByUser(java.lang.String)
	 */
	@Override
	public UserModel getUserByUser(String user) {
		Optional<UserModel> user1 = users.stream().filter(usr->usr.getUserName().equalsIgnoreCase(user)).findFirst();
		return user1.get();
	}

	/* (non-Javadoc)
	 * @see com.library.user.Iservice.Iuser#addUser(com.library.user.model.UserModel)
	 */
	@Override
	public String addUser(UserModel user) {
		users.add(user);
		return "Sucess";
	}

}
