package recursionAssignment;

public class StringToInt {
	
	public static int sol(String input) {
		if(input.length() == 1) {
			return input.charAt(0) - '0';
		}
		
		double y = sol(input.substring(1));
		System.out.println(y);
		double x = input.charAt(0) - '0'; //In case we have two two chars in a string, 
		x = x * Math.pow(10, input.length() - 1) + y;
		return (int)(x);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sol("1234"));
	}

}
