
public class Task12 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		System.out.println(sumElements(arr, 0));
	}
	static int sumElements(int[] arr, int start) {
		if(start == arr.length-1) {
			return arr[start];
		} else {
			return arr[start] + sumElements(arr, start+1);
		}
	}

}
