package com.kosta.service;

import java.util.List;

import com.kosta.dto.JbwDTO;

public interface JbwService {
	public List<JbwDTO> userList();
	public void insert(JbwDTO dto);
	public void update(JbwDTO dto);
	public void delete(String id);
}
