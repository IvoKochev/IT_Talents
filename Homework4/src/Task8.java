
public class Task8 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 2, 2, 2, 5, 4, 3, 3, 3, 6, 7, 6, 6, 6, 6, 4, 5, 3, 15, 20 };
		//counts the streak
		int streak = 1;
		//holds the max streak
		int maxStreak = 0;
		//holds the current index
		int index = 0;
		// holds the index of the highest streak
		int helpIndex = 0;
		for (int i = 1; i < array.length; i++) {
			if(array[i-1] == array[i]){
				streak++;
				index = i;
			}else{
				if(streak<maxStreak){
					streak=1;
					index = 0;
				} else{
					maxStreak = streak;
					helpIndex = index;
					streak = 1;
				}
			}
		}
		
		for(int i = 0; i < maxStreak; i ++){
			System.out.print(array[helpIndex] + (i == maxStreak-1 ? "" : ","));
		}
		

		
			
		
		
		}

	}

