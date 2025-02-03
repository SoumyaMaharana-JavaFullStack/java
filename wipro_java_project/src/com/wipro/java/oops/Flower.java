/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
public class Flower {

	/**
	 * 
	 */
	String FlowerName;// Name of the flower
	String color;// color of the flower
	int petals;// Number of petals

	// the below constructor are used to initializing the values
	Flower(String FlowerName, String color, int petals) {
		// TODO Auto-generated constructor stub
		this.FlowerName = FlowerName;
		this.color = color;
		this.petals = petals;

	}

	// this method are used to print the values
	void display() {
		System.out.println("FlowerName" + FlowerName + "color" + color + "No. of petals+ petals");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower obj1 = new Flower("Rose", "Red", 5);
		Flower obj2 = new Flower("Lilly", "White", 6);
		obj1.display();
		obj2.display();

	}

}
