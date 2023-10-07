/* STUDENT ID-4532435
* STUDENT NAME-Yogesh Bhardwaj
* FACULTY-SUMITHRA
*/

package falls2023;

public class Week5 {

    public void sum(int a, int b) {
        int s = 0;
        for (int i = a; i <= b; i++) {
            s += i;
        }
        System.out.println("the value of s is " + s);
    }

    static void display() {
        System.out.println("hello");
    }

    public static int total(int i1, int i2) {
        int sum = 0;
        for (int i = i1; i <= i2; i++) {
            sum += i;
        }
        return sum;
    }

    public void addition(int a, int b) {
        int c = a + b;
        System.out.println("the addition of a and b is " + c);
    }

    public void addition(int a, int b, int c) {
        int d = a + b + c;
        System.out.println("the value of d is " + d);
    }

    public static void main(String args[]) {
        Week5 z = new Week5();
        z.addition(24, 34);
        z.addition(34, 34, 345);
        int result = total(4, 5);
        System.out.println("The total is " + result);
        display(); 
    }
}
