package com.wipro.java.interface1;

/*This class implements two interfaces 
 * It provides specific implementations for the show() and display() methods.
 * */
public class Interface implements Printable, Showable {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Print the first Method");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Print the Second Method");
	}

	public static void main(String[] args) {
		Interface inf = new Interface();
		inf.show();
		inf.display();

	}

}
