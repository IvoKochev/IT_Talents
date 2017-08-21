import java.util.Arrays;

public class Paths {

	public static void main(String[] args) {
		int[][] arr = { 
				{ 0, 0, 1, 0, 0, 1, 0 }, 
				{ 1, 0, 1, 1, 0, 0, 0 }, 
				{ 0, 0, 0, 0, 1, 0, 1 },
				{ 1, 0, 1, 0, 0, 0, 0 }, 
				{ 1, 0, 1, 1, 0, 1, 0 }, 
				{ 1, 0, 0, 0, 0, 1, 0 }, 
				{ 1, 1, 1, 1, 0, 0, 0 }

		};
		System.out.println("The paths are: " + pathsFrom(0, 0, arr));
		System.out.println(Arrays.deepToString(arr));
	}

	static public int pathsFrom(int i, int j, int[][] arr) {
		if (!isInBounds(i, j, arr) || arr[i][j] == 1) {
			return 0;
		}
		if (i == arr.length - 1 && j == arr[i].length - 1) {
			return 1;
		}
		arr[i][j] = 1;
		System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
		int paths = pathsFrom(i + 1, j, arr) + 
					pathsFrom(i - 1, j, arr) + 
					pathsFrom(i, j + 1, arr) + 
					pathsFrom(i, j - 1, arr);
		System.out.println("paths= " + paths);
		
		arr[i][j] = 0;
		return paths;
	}

	static public boolean isInBounds(int i, int j, int[][] arr) {
		return (i >= 0 && i < arr.length && j >= 0 && j < arr[i].length);
	}

}

	


