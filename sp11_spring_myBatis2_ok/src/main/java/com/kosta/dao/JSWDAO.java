package com.kosta.dao;

import java.util.ArrayList;

import com.kosta.dto.UserDTO;

public interface JSWDAO {

	public ArrayList<UserDTO> getUsers();
	public void insertUsers(UserDTO dto);
	public void updateUsers(UserDTO dto);
	public void deleteUsers(String id);
}
