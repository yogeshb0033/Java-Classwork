package falls2023;

import java.util.Scanner;


public class NewClass {
	Scanner scan =new Scanner(System.in);
	public void addition() {
		System.out.print("Enter First Number:");
		int b1=scan.nextInt();
		System.out.print("Enter Second Number: ");
		int b2=scan.nextInt();
		int sum1=b1+b2;
		System.out.println("Sum Is: " + sum1);
	}

	
	public static void main(String args[]) {
		
		System.out.println("Hello World");
		int a1 =1;
		int a2=2;
		int a3=a1+a2;
		System.out.println("a1 = "+a1);
		System.out.println(a3);
		for(int i3=1;i3<=10;i3++) {
			System.out.print(i3);
		}
		System.out.println();
		for(int v=1; v<10; v++) {
			System.out.println();
			for(int b=1;b<10;b++) {
				System.out.print(v);
			}
		}
		System.out.println();
		NewClass sumw= new NewClass();
		sumw.addition();
		
	}
}
