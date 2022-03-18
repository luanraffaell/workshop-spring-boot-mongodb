package com.luanrafael.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

public class ComentDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public String text;
	public Date date;
	public AutorDTO author;
	
	public ComentDTO() {
	}

	public ComentDTO(String text, Date date, AutorDTO author) {
		super();
		this.text = text;
		this.date = date;
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public AutorDTO getAuthor() {
		return author;
	}

	public void setAuthor(AutorDTO author) {
		this.author = author;
	}
	
	
}
