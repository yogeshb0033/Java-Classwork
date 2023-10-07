package falls2023;
import java.util.Scanner;

public class GradeCHeck {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your marks: ");
		int marks= scan.nextInt();
		System.out.println("Your marks is : "+marks);
		char grade;
		
		if(marks>90) {
			grade='A';
			System.out.print("Your Grade is "+ grade);
		}
		else if(marks>=80) {
					grade='B';
					System.out.println("Your Grade is "+ grade);
	}
		else if(marks>=70) {
					grade='C';
					System.out.println("Your Grade is "+ grade);
	 }
		else {
				System.out.println("You have failed, Try Again next Year.");
		}
	}
}