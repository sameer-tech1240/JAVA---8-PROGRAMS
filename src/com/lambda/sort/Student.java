package com.lambda.sort;

public class Student {
	private Integer id;
	
	private String name;
	
	private String phonenumber;
	
	private String address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer id, String name, String phonenumber, String address) {
		super();
		this.id = id;
		this.name = name;
		this.phonenumber = phonenumber;
		this.address = address;
	}
	
	

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

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phonenumber=" + phonenumber + ", address=" + address + "]";
	}
	
	

}
