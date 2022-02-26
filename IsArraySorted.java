package recursion;

public class IsArraySorted {
	
	public static boolean isSorted(int a[]) {
		if(a.length == 1) {
			return true;
		}
		
		if(a[0] > a[1]) {
			return false;
		}
		
		int smallArray[] = new int[a.length - 1];
		for(int i=1; i<a.length; i++) {
			smallArray[i-1] = a[i];
		}
		boolean output = isSorted(smallArray);
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,6,5};
		System.out.println(isSorted(arr));
	}

}
