package recursion;

public class NoOfDigits {
	
	public static int count(int n) {
		if(n == 0) {
			return 0;
		}
		int smallAns = count(n / 10);
		System.out.println(smallAns);
		return smallAns + 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count(956));
	}

}
