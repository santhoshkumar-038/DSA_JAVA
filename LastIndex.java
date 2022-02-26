package recursion;

public class LastIndex {
	public static int findElementAtLastIndex(int[] input, int x) {
		return findElementAtLastIndex(input, x, 0);
	}
	
	private static int findElementAtLastIndex(int[] input, int x, int startIndex) {
		if(startIndex == input.length) {
			return -1;
		}
		//k is to get lastIndex, we check it with startIndex as reference, it helps us to get
		//startIndex which starts from last.
		int k = findElementAtLastIndex(input, x, startIndex + 1);
		System.out.println(k);
		if(k!=-1){
			return k;
		}else {
			if(input[startIndex] == x) {
				return startIndex;
			}else {
				return -1;
			}
		}
	}
	public static void main(String[] args) {
		int[] input = {1,2,3,4,5};
		int x = 3;
		System.out.println(findElementAtLastIndex(input, x));
	}
}

