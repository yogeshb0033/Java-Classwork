package falls2023;

public class Week2 {

		static void message() {
			System.out.print("Welcome \n");
			System.out.println("Student Name: Yogesh Bhardwaj.");		
					
		}
		public void class1() {
			int x=200;
			int I =6858;
			long Lo=766856785;
			String H="Hello World1";
			char Ch='T';
			boolean tf=true;
			int j=100;
			int k=30;
			int i=k%j;
			
			double  rate;
			float f=x;
			System.out.println(f);
			
			System.out.println("The value of x is "+ x );
			System.out.println("The value of I is "+ I);
			System.out.println("The value of Lo is "+ Lo);
			System.out.println("The value of H is "+ H);	
			System.out.println("The value of Ch is "+ Ch);
			System.out.println("The value of tf is "+ tf);
			System.out.println("The value of tf i "+ i);
			System.out.println("To Check equality j==k "+ (j==k));
			System.out.println("String length of H  is "+ H.length());
			
		}
		public static void main(String args[]) {
			Week2 Ob=new Week2();
			Ob.class1();
			Ob.message();
		}
}
