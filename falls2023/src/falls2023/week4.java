package falls2023;
/* Student id: 4532435
 * Student name : Yogesh Bhardwaj
 * faculty name : SUMITHRA 
 */

public class week4 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		String[] car= {"BMW", "MAAZDA" , "AUDI"};
		
		//to fix length
		int[] az = new int[2];
		
		az[0]=100;
		az[1]=200;
		System.out.println("The value of az[0] is " + az[0]);
		
		System.out.println("The value of a is " +  az[0]);
		System.out.println("The value of a is " +  az[3]);
		System.out.println("The car is " + car[2]);
		
		//print elements..
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println("the list of elements are " + a[1]);
		}
		
		//reverse elements
		
		for(int i=a.length-1; i>=0;i--)
		{
			System.out.println("The reverse list are " + a[1]);
		}
	}

}
