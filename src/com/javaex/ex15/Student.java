package com.javaex.ex15;

public class Student extends Person{
	
	//필드
	private String schoolname;
	
	//생성자
	public Student() {
		
	}
	public Student(String name, int age, String schoolname) {
		//부모의 생성자 호출
		//name, age 부모
		super(name, age);
		/*디폴트 생성자 사용시
		  super();
		  super.setName(name);
		  super.setAge(age);
		 */
		//자신메모리에 올리는 일
		
		//schoolname 자신
		this.schoolname = schoolname;
		System.out.println("Student(3)");
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	
	@Override
	public String toString() {
		return "Student [schoolname=" + schoolname + "]";
	}

	
}
