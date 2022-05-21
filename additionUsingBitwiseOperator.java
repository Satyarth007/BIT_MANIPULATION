import java.util.Scanner;
public class additionOfTwoNumbers {
	public static int sum(int a, int b) {

		while(b !=0) {
			int carry= a & b;
			a=a^b;
			b=carry << 1;
		}

		return a;
	}

	public static void main(String[] args) {
		// main function will the sum method
	Scanner sc=new Scanner(System.in);
	System.out.print("ENTER THE FIRST NUMBER: ");
	int a=sc.nextInt();
	System.out.print("ENTER THE SECOND NUMBER: ");
	int b=sc.nextInt();
	System.out.print("THE SUM OF "+a+ " AND "+b+" is :- "+sum(a,b));
	

	}

}
