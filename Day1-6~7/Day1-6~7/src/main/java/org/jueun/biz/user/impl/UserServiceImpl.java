package org.jueun.biz.user.impl;

import org.jueun.biz.user.UserService;
import org.jueun.biz.user.UserVO;

public class UserServiceImpl implements UserService {
	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}
}
