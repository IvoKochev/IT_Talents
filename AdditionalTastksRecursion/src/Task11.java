
public class Task11 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		printElements(arr, 0);
	}
	static void printElements(int[] arr, int start) {
		if(start == arr.length-1) {
			System.out.print(arr[arr.length-1]);
		} else {
			System.out.print(arr[start] + ", ");
			printElements(arr, start + 1);
		}
	}
}
