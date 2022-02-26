package StringRec;

public class ReplaceChar {
	public static String replaceChar(String str, char a, char b) {
		if(str.length() == 0) {
			return str;
		}
		String smallOutput = replaceChar(str.substring(1), a, b);
		if(str.charAt(0) == a) {
			return b + smallOutput;
		}else {
			return str.charAt(0) + smallOutput;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String output = replaceChar("abxcxdx", 'x', 'y');
		System.out.println(output);
	}
}
