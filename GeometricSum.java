package recursionAssignment;

public class GeometricSum {
	
	public static double sum(int k) {
		System.out.println(1/Math.pow(2, k));
		if(k == 0) {
			return 1;
		}
		double ans = 1/(double)Math.pow(2, k) + sum(k-1);
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(3));
	}

}
