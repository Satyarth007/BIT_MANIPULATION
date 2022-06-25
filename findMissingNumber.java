
public class findMissingNumber {
	public static int giveAnswer(int[] arr) {
		int ans=0;
		int range=arr.length+1;
		for(int i=1;i<=range;i++) {
			ans^=i;
		}
		for(int i=0;i<arr.length;i++) {
			ans^=arr[i];
		}
		return ans;
	}

	public static void main(String[] args) {
		/*QUESTION:- In given list of n-1 elements, which are in the range of 1 to n. There
		are no duplicates in the array. One of the integer is missing. Find the missing element. */
		int [] arr= {1,2,4,5,6};
		System.out.println("MISSING NUMBER IS:  "+giveAnswer(arr));
	}

}
