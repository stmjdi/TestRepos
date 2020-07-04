package com.spring.demo.mapper;

import java.util.List;

import com.spring.demo.vo.BookVO;


public interface BookMapper {
	public List<BookVO> selectAll();
}
