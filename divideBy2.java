// u should use RIGHT SHIFT OPERATOR instead of '/' operator.
import java.util.Scanner;
public class divideBy2 {

	public static void main(String[] args) {
// USING RIGHT SHIFT OPERATOR WITH 1 IS EQUALS TO DIVIDING A NO. BY 2
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE N:- ");
		int n=sc.nextInt();
		int ans=n >> 1; //it gives the quotient
		System.out.println("ANSWER:-"+ans);
	}

}
