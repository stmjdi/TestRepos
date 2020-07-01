package com.kosta.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kosta.dto.JbwDTO;
import com.kosta.mapper.JbwMapper;

@Repository
public class JbwDAOImpl implements JbwDAO {
	
	@Autowired
	private SqlSession  sqlSession;

	@Override
	public ArrayList<JbwDTO> getUsers() {
		ArrayList<JbwDTO> lists = new ArrayList<JbwDTO>();
		JbwMapper mapper = sqlSession.getMapper(JbwMapper.class);
		
		lists = mapper.getUsers();
		
		return lists;
	}

	@Override
	public void insertUsers(JbwDTO dto) {
		JbwMapper mapper = sqlSession.getMapper(JbwMapper.class);
		mapper.insertUsers(dto);
	}

	@Override
	public void updateUsers(JbwDTO dto) {
		JbwMapper mapper = sqlSession.getMapper(JbwMapper.class);
		mapper.updateUsers(dto);

	}

	@Override
	public void deleteUsers(String id) {
		JbwMapper mapper = sqlSession.getMapper(JbwMapper.class);
		mapper.deleteUsers(id);
	}

}
