package recursion;

public class CheckNumberInArray {
	
	public static boolean checkNumber(int[] input, int x) {
		return checkNumber(input, x, 0);
	}
	
	private static boolean checkNumber(int[] input, int x, int startIndex) {
		if(input.length == startIndex) {
			return false;
		}
		if(input[startIndex] == x) {
			return true;
		}
		return checkNumber(input, x, startIndex + 1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,2,3,4,5};
		int x = 5;
		System.out.println(checkNumber(input, x));
	}

}
