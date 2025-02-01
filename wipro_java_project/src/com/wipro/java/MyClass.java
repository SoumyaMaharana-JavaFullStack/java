/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
public class MyClass {

	/**
	 * 
	 */
	int num=5;
	public void changeValue(int num) {
		this.num=num;
	}
	public MyClass() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating an object of Myclass
		MyClass obj= new MyClass();
		//here we can call a method as changeValue() and passing a value as 10
		obj.changeValue(10);
		//it will change the value of num as 10
		System.out.println(obj.num);

	}

}
