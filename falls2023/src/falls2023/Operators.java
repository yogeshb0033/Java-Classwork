package falls2023;
import java.util.Scanner;


public class Operators {
	 static void message() {
	System.out.print("This is message.");	
	}
	 
	 public void operate() {
		 Scanner scan= new Scanner(System.in);
		 
		 System.out.print("Enter any Value :: ");
		 int b=scan.nextInt();
		 
		 int a=++b;
		 System.out.println("Value of a "+a);
		 System.out.println("Value of b "+b);
		 a=b++;
		 System.out.println("Value of a after change is "+a);
		 System.out.println("Value of b after b++ is "+b+"\n");
		 System.out.print("enter value of j");
		 int j=scan.nextInt();
		 int i=j--;
		 System.out.println("Value of i"+i );
		 System.out.println("Value of j"+j);
		 i=++j;
		 System.out.println("Value of i after change is "+i);
		 System.out.println("Value of j afte ++j is "+j);
		 
		 Scanner z=new Scanner(System.in);
		 System.out.print("Enter your name : ");
		 String name=z.nextLine();
		 System.out.println("Name entered is : "+name);
		 }
	 
public static void main(String args[]) {
	Operators Obj=new Operators();
	Obj.operate();
}	 
}
