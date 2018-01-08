package com.sdd.model.pojo.po;

public class Phone {
	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Phone [id=" + id + ", name=" + name + "]";
	}
	
}
