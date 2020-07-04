package com.spring.demo.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.demo.mapper.BookMapper;
import com.spring.demo.vo.BookVO;

@Repository
public class BookDAO {
	@Autowired
	SqlSession sqlSession;
	
	public List<BookVO> selectList(){
		BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
		return bookMapper.selectAll();
	}
}
