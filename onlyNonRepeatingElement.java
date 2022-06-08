
public class onlyNonRepeatingElement {

	public static void main(String[] args) {
		// Here we have an array having every element occuring even times except one element.
		// we need to find that-------------
		int arr[]= {5,4,1,4,5,3,1,3,8};
		int res=0;
		for(int i=0;i<arr.length;i++) {
			res=res^arr[i];
		}
		System.out.println("That non repeating element is : "+res);

	}

}
