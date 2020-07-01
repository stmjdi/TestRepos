package com.kosta.dao;

import java.util.ArrayList;

import com.kosta.dto.JbwDTO;

public interface JbwDAO {

	public ArrayList<JbwDTO> getUsers();
	public void insertUsers(JbwDTO dto);
	public void updateUsers(JbwDTO dto);
	public void deleteUsers(String id);
}
