package StringRec;

public class RemoveDuplicates {
	
	public static String output(String s) {
		if(s.length() <= 1) {
			return s;
		}
		
		if(s.charAt(0) == s.charAt(1)) {
			String smallOutput = output(s.substring(1));
			return smallOutput;
		}else {
			String smallOutput = output(s.substring(1));
			return s.charAt(0) + smallOutput;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(output("aaabbbccd"));
	}

}
