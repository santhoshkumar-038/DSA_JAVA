package recursionAssignment;

public class SumOfDigits {
	
	public static int sum(int input) {
		if(input <= 1) {
			return input;
		}
		
		int sum = input % 10 + sum(input / 10);
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(12345));
	}

}
