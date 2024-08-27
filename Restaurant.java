// package com.studyopedia;

class Father{
	String name="Father";
	int age=50;
	void Display() {
		System.out.println(name+" "+age);
	}
}
class Son extends Father{
	String name="Son";
	int age=25;
	void Display() {
		System.out.println(super.name+" "+super.age);
	}
}

public class Restaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s=new Son();
		System.out.println(s.name+" "+s.age);
        s.Display();
	}

}
