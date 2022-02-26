package RecursionII;

public class MergeSort {
	
	public static void mergeSort(int[] arr) {
		if(arr.length <= 1) {
			return ;
		}
		
		int[] s1 = new int[arr.length / 2];
		int[] s2 = new int[arr.length - s1.length];
		
		for(int i=0; i<arr.length/2; i++) {
			s1[i] = arr[i];
		}
		
		for(int i=arr.length/2; i<arr.length; i++) {
			s2[i - arr.length/2] = arr[i];
		}
		
		mergeSort(s1);
		mergeSort(s2);
		merge(s1, s2, arr);
 	}
	
	public static void merge(int[] a1, int[] a2, int[] d) {
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < a1.length && j < a2.length) {
			if(a1[i] <= a2[j]) {
				d[k] = a1[i];
				i++;
				k++;
			}else if(a2[j] <= a1[i]) {
				d[k] = a2[j];
				j++;
				k++;
			}
		}
		
		if(i < a1.length) {
			while(i < a1.length) {
				d[k] = a1[i];
				k++;
				i++;
			}
		}
		
		if(j < a2.length) {
			while(j < a2.length) {
				d[k] = a2[j];
				k++;
				j++;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 9, 8, 7, 1, 2, 3, 0};
		mergeSort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
