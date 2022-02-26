package recursionAssignment;

public class StairCase {
	
	public static int stairCase(int n) {
		if(n == 0) {
			return 1;
		}
		else if(n < 0) {
			return 0;
		}
		else {
			return stairCase(n-1) + stairCase(n-2) + stairCase(n-3);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stairCase(3));
	}

}
