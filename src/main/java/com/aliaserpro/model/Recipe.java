package com.aliaserpro.model;


import java.io.Serializable;

public class Recipe implements Serializable {
	private long id;
	private String name;
	private String desc;
	private boolean isVege;
	
	public Recipe() {
		
	}
	
	public Recipe(String name, String desc, boolean isVege) {
		this.name=name;
		this.desc=desc;
		this.isVege=isVege;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDesc() {
		return this.desc;
	}
	
	public boolean getVege() {
		return this.isVege;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setDesc(String desc) {
		this.desc=desc;
	}
	
	public void setName(boolean isVege) {
		this.isVege=isVege;
	}

}
