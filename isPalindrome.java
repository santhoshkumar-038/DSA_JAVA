package recursionAssignment;

public class isPalindrome {
	
	public static boolean palindrome(String input, int si, int ei) {
		if(input.length() <= 1) {
			return true;
		}
		
		if(input.charAt(si) != input.charAt(ei)) {
			return false;
		}
		
		if(si < ei+1) {
			return palindrome(input, si+1, ei-1);
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "racecar";
		int ei = input.length() - 1;
		System.out.println(palindrome(input, 0, ei));
	}

}
