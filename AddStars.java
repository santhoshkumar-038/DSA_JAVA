package recursionAssignment;

public class AddStars {

	public static String sol(String s) {
		if(s.length() <= 1) {
			return s;
		}
		
		if(s.charAt(0) == s.charAt(1)) {
			String smallOutput = s.charAt(0) + "*" + sol(s.substring(1));
			return smallOutput;
		}
		
		String smallOutput = s.charAt(0) + sol(s.substring(1));
		return smallOutput;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sol("Hello"));
	}

}
