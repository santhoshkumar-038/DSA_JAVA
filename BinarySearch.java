package RecursionII;

public class BinarySearch {
	public static int search(int[] arr, int si, int ei, int x) {
		if(si > ei) {
			return -1;
		}
		
		int mid = (si + ei)/2;
		if(arr[mid] == x) {
			return mid;
		}
		else if(arr[mid] < x) {
			return search(arr, mid+1, ei, x);
		}
		else {
			return search(arr, si, mid-1, x);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 2, 4, 6, 8, 10};
		int si = 0;
		int ei = arr.length-1;
		System.out.println(search(arr, si, ei, 10));
	}

}
