package recursion;

public class Factorial {

	public static int fact(int n) {
		if(n == 0) {
			return 1;
		}
		int smallOutput = fact(n-1);
		int output = n * smallOutput;
		return output;
	}
	
	public static int sumOfN(int n) {
		if(n == 0) {
			return 0;
		}
		int output = n + sumOfN(n-1);
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));
		System.out.println(sumOfN(4));
	}

}
