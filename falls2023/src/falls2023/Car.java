package falls2023;
import java.util.Scanner;


public class Car {
	Scanner scan =new Scanner(System.in);
	public void Toyota(String name,String Model, int year ) {
		System.out.println("Car name is "+name);
		System.out.println("Car Model is "+Model);
		System.out.println("Car Year is "+ year);
		
	}

	public static void main(String args[]) {
		Car ms=new Car();
		ms.Toyota("Crysta", "A50", 2019);
		ms.Toyota("", null, 0);
	}
}
