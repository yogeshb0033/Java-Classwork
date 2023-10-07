package falls2023;

import java.util.Scanner;


public class AreaOfCircle {

public void area(){
	Scanner scan = new Scanner(System.in);
	System.out.print("Radius: ");
	double  r =scan.nextDouble();
	double pi=3.14;
	double area = pi * r * r;
	
	System.out.println("Radius = "+ r);
	System.out.println("Area of Circle = "+ area);
	
}

static void main (String[] args) {
	
	AreaOfCircle c = new AreaOfCircle();
	c.area();
	
	}

}
