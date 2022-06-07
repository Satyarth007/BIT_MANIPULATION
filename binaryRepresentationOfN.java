import java.util.Scanner;

public class binaryRepresentationOfN {
	public static void bin(int n) {
		if(n>1) {
			bin(n>>1);
		}
		System.out.print(n&1);
	}

	public static void main(String[] args) {
		// Binary representation of a no. N.
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE FIRST NO. : ");
		int n=sc.nextInt();
		bin(n);

	}

}
