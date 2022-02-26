package recursion;

public class PrintNNaturalNum {
	
	public static void print(int num) {
		if(num == 0) {
			return ;
		}
		print(num - 1);
		System.out.print(num + " ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(5);
	}

}
