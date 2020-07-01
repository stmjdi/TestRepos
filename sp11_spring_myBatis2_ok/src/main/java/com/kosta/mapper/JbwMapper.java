package com.kosta.mapper;

import java.util.ArrayList;
import com.kosta.dto.JbwDTO;

public interface JbwMapper {

	public ArrayList<JbwDTO> getUsers();
	public void insertUsers(JbwDTO dto);
	public void updateUsers(JbwDTO dto);
	public void deleteUsers(String id);
}
