package recursionAssignment;

public class multiplyTwoNumbers {
	
	public static int multiply(int m, int n) {
		if(n <= 1) {
			return m;
		}
		
		int ans = m + multiply(m, n-1);
		return ans;
	}
	
	public static void main(String[] args) {
		System.out.println(multiply(3,5));
	}
}

