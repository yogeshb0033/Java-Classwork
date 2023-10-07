package falls2023;
import java.util.Scanner;
//Name: Yogesh Bhardwaj
//Student Id: 4532435

public class GradeCalulator {

	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		
		System.out.print("Enter Your percentage: ");
		int per=s.nextInt();
		if(per>=100) {
			System.out.print("Invalid Input, Please Enter percentage between 0 to 100");
		}
		else  if(per >=90) {
			System.out.println("Your Grade : A");
		}
		else if(per>=80) {
			System.out.println("Your Grade: B");
		}
		else if(per>=70) {
			System.out.println("Your Grade: C");
		}
		else if(per>=60) {
			System.out.println("Your Grade: D");
		}
		else {
			System.out.println("Your Grade: F");
		}
		
System.out.println("Name: Yogesh Bhardwaj");
System.out.println("StudentId: 4532435");
	}
}
