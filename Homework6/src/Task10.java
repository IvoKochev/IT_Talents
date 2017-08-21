
public class Task10 {

	public static void main(String[] args) {
		int[] arr = {1,1,1,3, 4, 5, 6,6,6,6,6, 6, 6, 6, 3,4,6, 6, 6, 6, 6, 6, 1, 2, 3,5, 5 ,5 ,1 ,1, 2, 3, 2,2,2,2,5,5,1,1,1};
		int streak =0;
		int maxStreak = 0;
		int index = 0;
		for(int i = 0; i< arr.length; i++){
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j]){
					streak++;
				}
			}
			if(streak>maxStreak){
				maxStreak = streak;
				index = i;
			}
			streak =0;
		}
		System.out.println(arr[index] + " - " + maxStreak + " times");
		

	}

}
