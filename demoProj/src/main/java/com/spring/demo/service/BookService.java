package com.spring.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.dao.BookDAO;
import com.spring.demo.vo.BookVO;

@Service
public class BookService {
	@Autowired
	BookDAO bookDAO;
	
	public List<BookVO> showList(){
		return bookDAO.selectList();
	}
	
	public ArrayList<BookVO> showMatched(String arg){
		ArrayList<BookVO> ret = new ArrayList<BookVO>();
		List<BookVO> lv = bookDAO.selectList();
		
		for(int i=0;i<lv.size();i++) {
			if(lv.get(i).getTitle().toUpperCase().contains(arg.toUpperCase())) {
				ret.add(lv.get(i));
				System.out.println(lv.get(i).getTitle()); // log
			}
		}
		
		return ret;
	}
}
