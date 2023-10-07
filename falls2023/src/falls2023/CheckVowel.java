package falls2023;
import java.util.Scanner;
public class CheckVowel {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter character:  ");
		char Al=scan.next().charAt(0);
		switch(Al) {
		case 'a':
			System.out.println("This is a Vowel");
			break;
		case 'e':
			System.out.println("This is a Vowel");
			break;
		case 'i':
			System.out.println("This is a Vowel");
			break;
		case 'o':
			System.out.println("This is a Vowel");
			break;
		case 'u':
			System.out.println("This is a Vowel");
			break;
		default:
			System.out.println("This is a Consonent.");
		}
	}

}
