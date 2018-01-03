package com.dto;

import java.io.Serializable;

public class BackgroundDto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String stageimg;
	
	public BackgroundDto () {
		
	}

	public BackgroundDto(int id, String stageimg) {
		super();
		this.id = id;
		this.stageimg = stageimg;
	}

	public BackgroundDto(String stageimg) {
		super();
		this.stageimg = stageimg;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStageimg() {
		return stageimg;
	}

	public void setStageimg(String stageimg) {
		this.stageimg = stageimg;
	}
	

}
