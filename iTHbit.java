
public class iTHbit {

	public static void main(String[] args) {
// FIND THE i^TH BIT OF A NO. USING & OPERATION
		int n=1024;
		// masking formula:-
		// mask= 1 << i;
		int mask=1 << 4; //here i=4
		int what=n & mask;
		if(what!=0) {
			System.out.println("It is : "+ 1);
		}else {
			System.out.println("It is : "+0);
		}
		

	}

}
