package StringRec;

public class ReplacePi {
	
	public static String output(String s) {
		if(s.length() <= 1) {
			return s;
		}
		
		if(s.charAt(0) == 'p' && s.charAt(1) == 'i') {
			String smallOutput = output(s.substring(2));
			System.out.println(smallOutput);
			return "3.14" + smallOutput;
		}else {
			String smallOutput = output(s.substring(1));
			System.out.println(smallOutput);
			return s.charAt(0) + smallOutput;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(output("apipib"));
	}

}
