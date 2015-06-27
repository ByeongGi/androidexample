package com.example.dbconnent;

public class model {
	// student table 
	private String id;
	private String name;
	private String phone;
	private String email;
	private String grade;
	
	private int id2;
	private double kor;
	private double eng;
	private double math;
	
	public model(){}
	
	public model( String id,String name,String phone,String email,String grade){
		this.id= id;
		this.name=name;
		this.phone= phone;
		this.email=email;
		this.grade=grade;
	}
	
	public model(int id,double kor,double eng,double math){
		this.id2=id;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	public model( String id,String name,String phone,String email,String grade,double kor,double eng,double math){
		this.id= id;
		this.name=name;
		this.phone= phone;
		this.email=email;
		this.grade=grade;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getId2() {
		return id2;
	}

	public void setId2(int id2) {
		this.id2 = id2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public double getKor() {
		return kor;
	}

	public void setKor(double kor) {
		this.kor = kor;
	}

	public double getEng() {
		return eng;
	}

	public void setEng(double eng) {
		this.eng = eng;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}
	
	
	
	
} // end class model
