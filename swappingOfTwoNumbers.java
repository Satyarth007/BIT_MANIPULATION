import java.util.Scanner;

public class swappingOfTwoNumbers {

	public static void main(String[] args) {
		// Here using xor operator we can swap two numbers.
		// take user input of two numbers.
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE FIRST NO. : ");
		int x=sc.nextInt();
		System.out.println("ENTER THE SECOND NO. : ");
		int y=sc.nextInt();
		System.out.println("ELEMENTS BEFORE SWAPPING : X = "+x+" AND Y = "+y);
		
		// CONCEPT------------
		x=x^y;
		y=x^y;
		x=x^y;
		//--------------------
		System.out.println("ELEMENTS AFTER SWAPPING : X = "+x+" AND Y = "+y);
		
		
	}

}
