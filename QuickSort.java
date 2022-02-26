package RecursionII;

public class QuickSort {
	
	public static int partition(int[] arr, int si, int ei) {
		int pivotElement = arr[si];
		//Counting no elements less than Pivot Element
		int count = 0;
		for(int i=si+1; i<=ei; i++) {
			if(arr[i] < pivotElement) {
				count++;
			}
		}
		//Swapping pivot to its correct place...
		int temp = arr[si + count];
		arr[si + count] = arr[si];
		arr[si] = temp;
		
		//we have keep elements less than pivot on left side and elements greather than pivot on right hand side...
		int i = si;
		int j = ei;
		while(i < j) {
			if(arr[i] < pivotElement) {
				i++;
			}else if(arr[j] >= pivotElement) {
				j--;
			}else {
				int temp1 = arr[j];
				arr[j] = arr[i];
				arr[i] = temp1;
				i++;
				j--;
			}
		}
		
		return si + count; //pivot element
	}
	
	public static void quickSort(int[] arr, int si, int ei) {
		if(si >= ei) {
			return ;
		}
		
		int pivotElement = partition(arr, si, ei);
		quickSort(arr, si, pivotElement - 1);
		quickSort(arr, pivotElement + 1, ei);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,12,24,6,2,1,0};
		quickSort(arr, 0, arr.length-1);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
