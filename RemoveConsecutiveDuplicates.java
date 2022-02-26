package linkedlist;

import java.util.ArrayList;

public class RemoveConsecutiveDuplicates {
	
	public static ArrayList<Integer> sol(int[] arr){
		ArrayList<Integer> result = new ArrayList<>();
		result.add(arr[0]);
		for(int i=1; i<arr.length; i++) {
			if(arr[i-1]!=arr[i]) {
				result.add(arr[i]);
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 10, 20, 20, 20, 30, 30, 10};
		ArrayList<Integer> ans = sol(arr);
		for(int i=0; i<ans.size(); i++) {
			System.out.println(ans.get(i));
		}
	}

}