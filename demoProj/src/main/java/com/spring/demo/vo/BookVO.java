package com.spring.demo.vo;

import org.springframework.stereotype.Component;

@Component
public class BookVO {
	private String bid;
	private String title;
	private String author;
	private String category;
	private String catDetail;
	
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCatDetail() {
		return catDetail;
	}
	public void setCatDetail(String catDetail) {
		this.catDetail = catDetail;
	}
	@Override
	public String toString() {
		return "BookVO [bid=" + bid + ", title=" + title + ", author=" + author + ", category=" + category
				+ ", catDetail=" + catDetail + "]";
	}
	
}
