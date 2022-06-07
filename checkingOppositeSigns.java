import java.util.Scanner;
public class checkingOppositeSigns {
	public static boolean checkOpp(int x,int y) {
		
		
		return ((x^y)<0);
	}

	public static void main(String[] args) {
		// we are checking weather two numbers are different sign or not;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE FIRST NO. : ");
		int x=sc.nextInt();
		System.out.println("ENTER THE SECOND NO. : ");
		int y=sc.nextInt();
		
		boolean answer=checkOpp(x,y);
		if(answer==true) {
			System.out.println("The no. are opposite in sign.");
		}else {
			System.out.println("The no. are not opposite in sign.");
		}

	}

}
