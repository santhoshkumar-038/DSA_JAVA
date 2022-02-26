package recursion;

public class isArraySortedBetter {
	
	public static boolean isSorted(int[] input, int startIndex) {
		if(startIndex == input.length - 1) {
			return true;
		}
		if(input[startIndex] > input[startIndex + 1]) {
			return false;
		}
		return isSorted(input, startIndex + 1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,2,3,5};
		System.out.println(isSorted(input, 0));
}
}
