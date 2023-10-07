package falls2023;

import java.util.Scanner;

public class Circle {
	public void area(){
 Scanner scan= new Scanner(System.in);
 System.out.print("Radius: ");
 double r=scan.nextDouble();
 double pi=3.14;
 double Area=	pi*r*r;
 
 System.out.print("Radius= "+r);
 System.out.print("Area= "+Area);
 

}
	public static void main(String args[]) {
	Circle C=new Circle();
	C.area();
	
}
}
