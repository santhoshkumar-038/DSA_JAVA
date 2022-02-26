package recursion;

public class Fibonacci {
	
	public static int fibo(int n) {
		if(n == 1 || n==2) {
			return 1;
		}
		int output = fibo(n-1) + fibo(n-2);
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibo(5));
	}

}
