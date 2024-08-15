package zentask_10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Circumference {

	
	//static Scanner sc = new Scanner(System.in);
	static double radius;
	
	//empty constructor
	public Circumference()
	{
		radius=0.0;
	}

	// parameterized constructor
	public Circumference(double rad)
	{
		radius = rad;

	}
	
	public double getRadius() 
	{
		return calculate();
	}
	
	public void setRadius(double rad) 
	{
		radius = rad;
	}
	
	public double calculate() 
	{
		return Math.PI*radius*radius;

	}
		
		//Main method
		public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat();
	    df.setMinimumFractionDigits(2);
	    df.setMaximumFractionDigits(2);
		

		//create a circle object using the constructor with no arguments - empty constructor
		Circumference obj1 = new Circumference();
		obj1.setRadius(1.4);
		System.out.println("Empty constructor");
		System.out.println("The circumference of the circle is:" + df.format(obj1.calculate()));
		 
		// create a circle object using the constructor with one argument
		Circumference obj2 = new Circumference(radius);
		obj2.setRadius(6.4);
		System.out.println("\nParameterized constructor");
		System.out.println("The circumference of the circle is: " + df.format(obj2.calculate())+"\n");


	}

}
