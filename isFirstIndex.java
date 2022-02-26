package recursion;

public class isFirstIndex {
	
	public static int firstIndex(int[] input, int x) {
		return firstIndex(input, x, 0);
	}
	
	private static int firstIndex(int[] input, int x, int startIndex) {
		if(startIndex == input.length) {
			return -1;
		}
		if(input[startIndex] == x) {
			return startIndex;
		}
		return firstIndex(input, x, startIndex + 1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,2,3,4,5};
		int x = 3;
		System.out.println(firstIndex(input, x, 0));
	}

}
