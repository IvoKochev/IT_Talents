import java.util.Random;
import java.util.Scanner;

public class Minesweeper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int level;
		//checks if the user entered a wrong level
		int counter = 0;
		int wannaPlayAgain = 1;
		while(wannaPlayAgain == 1) {
			counter = 0;
		do {
			if (counter > 0) {
				System.out.println("Your entered a wrong level. Please, try again: ");
				counter = 0;
			}
			getLevel();
			level = sc.nextInt();
			counter++;
		} while (level < 1 || level > 4);
		switch (level) {
		case 1:
			// arrLevel1 - an array filled with numbers and *
			char[][] arrLevel1 = new char[8][8];
			// copyArrLevel1 - copy of arrLevel1 that is being filled and shown
			// to the user
			char[][] copyArrLevel1 = new char[8][8];
			// isShownArrLvl1 - boolean array that shows me if the chosen
			// coordinates are already opened
			boolean[][] isShownArrLvl1 = new boolean[8][8];
			choice(level);
			fillCopyArr(copyArrLevel1, 8, 8);
			fillArrayWithBombs(arrLevel1, 8, 8, 10);
			fillArrayWithNumbers(arrLevel1, 8, 8);
			selectCoordinates(arrLevel1, copyArrLevel1, isShownArrLvl1, 8, 8, 10);
			break;
		case 2:
			char[][] arrLevel2 = new char[16][16];
			char[][] copyArrLevel2 = new char[16][16];
			boolean[][] isShownArrLvl2 = new boolean[16][16];
			choice(level);
			fillCopyArr(copyArrLevel2, 16, 16);
			fillArrayWithBombs(arrLevel2, 16, 16, 49);
			fillArrayWithNumbers(arrLevel2, 16, 16);
			selectCoordinates(arrLevel2, copyArrLevel2, isShownArrLvl2, 16, 16, 49);
			break;
		case 3:
			char[][] arrLevel3 = new char[16][30];
			char[][] copyArrLevel3 = new char[16][30];
			boolean[][] isShownArrLvl3 = new boolean[16][30];
			choice(level);
			fillCopyArr(copyArrLevel3, 16, 30);
			fillArrayWithBombs(arrLevel3, 16, 30, 99);
			fillArrayWithNumbers(arrLevel3, 16, 30);
			selectCoordinates(arrLevel3, copyArrLevel3, isShownArrLvl3, 16, 30, 99);
			break;
		case 4:
			char[][] arrLevel4 = new char[16][30];
			char[][] copyArrLevel4 = new char[16][30];
			boolean[][] isShownArrLvl4 = new boolean[16][30];
			choice(level);
			int numberOfBombs;
			boolean isNumberOfBombsOk = true;
			do {
				if (!isNumberOfBombsOk) {
					System.out.println("You entered wrong number of bombs!");
				}
				System.out.println("Please, enter the number of bombs: ");
				numberOfBombs = sc.nextInt();
				isNumberOfBombsOk = false;
			} while (numberOfBombs < 1 || numberOfBombs > 479);
			fillCopyArr(copyArrLevel4, 16, 30);
			fillArrayWithBombs(arrLevel4, 16, 30, numberOfBombs);
			fillArrayWithNumbers(arrLevel4, 16, 30);
			selectCoordinates(arrLevel4, copyArrLevel4, isShownArrLvl4, 16, 30, numberOfBombs);
			break;
		}
		do{
			System.out.println("Do you want to play again ?\nPlease, press 1 for yes or 2 for no:");
			wannaPlayAgain = sc.nextInt();
		} while(wannaPlayAgain > 2 || wannaPlayAgain < 1);
		}
		sc.close();
	}
		
		
	
		

	

	static void getLevel() {

		System.out.println("Please, select a level of difficulty: ");
		System.out.println("- 1 for Begginer 8x8 - 10 mines.");
		System.out.println("- 2 for Intermediate - 16x16 - 49 mines.");
		System.out.println("- 3 for Expert - 16x30 - 99 mines.");
		System.out.println("- 4 for Custom - 16x30 - (1 - 479) mines.");
	}

	static void fillArrayWithBombs(char[][] array, int rows, int cols, int numberOfBombs) {
		Random r = new Random();
		int rowToFill, colToFill;
		// checks if there is already a bomb
		int counter = 0;
		do {
			rowToFill = r.nextInt(rows);
			colToFill = r.nextInt(cols);
			if (array[rowToFill][colToFill] != '*') {
				array[rowToFill][colToFill] = '*';
				counter++;
			}
		} while (counter < numberOfBombs);
	}

	static void winMessage() {
		System.out.println("Congratulations! You win!");
	}

	static void printArray(char[][] array, int rows, int cols) {
		for (int i = 0; i < rows; i++) {
			System.out.print("    -");
			for (int k = 1; k < cols; k++) {
				System.out.print("   -");
			}
			System.out.println();
			System.out.print(i + (i <=9 ? " " : ""));
			for (int j = 0; j < cols; j++) {
				System.out.print(j == 0 ? "| " + array[i][j] + " |" : " " + array[i][j] + " |");
			}
			System.out.println();
		}
		System.out.print("    -");
		for (int k = 1; k < cols; k++) {
			System.out.print("   -");
		}
		System.out.println();
		System.out.print("  ");
		for (int i = 0; i < cols; i++) {
			System.out.print("  " + i + (i <= 9 ? " " : ""));
		}
		System.out.println();
	}

	static void choice(int level) {
		System.out.println("Your choice is level: " + level);

	}

	static void selectCoordinates(char[][] arr, char[][] copyArr, boolean[][] arr1, int rows, int cols,
			int numberOfBombs) {
		Scanner sc = new Scanner(System.in);
		// the input row coordinate from user
		int rowCoordinate;
		// the input col coordinate from user
		int colCoordinate;
		// checks if the user already won
		boolean isWin = false;
		// checks if the user already lost
		boolean isLost = false;
		// checks if the coordinates are wrong
		boolean isWrongCoordinate = false;
		// counts the opened squares
		int counterForWin = 0;
		while (true) {
			if (isWrongCoordinate) {
				System.out.println("You entered wrong coordinates! Try again! ");
				isWrongCoordinate = false;
			}
			do {
				System.out.println("Please, enter coordinate by rows: ");
				rowCoordinate = sc.nextInt();
				System.out.println("Please, enter coordinate by columns: ");
				colCoordinate = sc.nextInt();
				if (rowCoordinate >= 0 && rowCoordinate <= rows - 1 && colCoordinate >= 0
						&& colCoordinate <= cols - 1) {
					if (arr[rowCoordinate][colCoordinate] == '*') {
						isLost = true;
						looseMessage();
						printArray(arr, rows, cols);
						break;
					}
					if (arr[rowCoordinate][colCoordinate] == '0') {
						showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate, colCoordinate);

					} else {
						copyArr[rowCoordinate][colCoordinate] = arr[rowCoordinate][colCoordinate];

					}
					printArray(copyArr, rows, cols);
					for (int i = 0; i < rows; i++) {
						for (int j = 0; j < cols; j++) {
							if (copyArr[i][j] != ' ') {
								counterForWin++;
							}
						}
					}
					if (counterForWin == rows * cols - numberOfBombs - 1) {
						isWin = true;
						printArray(arr, rows, cols);
						winMessage();
						break;
					}
					counterForWin = 0;
				}
			} while (rowCoordinate >= 0 && rowCoordinate <= rows - 1 && colCoordinate >= 0
					&& colCoordinate <= cols - 1);
			if (isLost || isWin) {
				break;
			}
			isWrongCoordinate = true;
		}
		
	}

	static void fillArrayWithSpaces(char[][] arr, int rows, int cols) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = ' ';
			}
		}
	}

	static void looseMessage() {
		System.out.println("Sorry, but you just lost!");
	}

	static void fillArrayWithNumbers(char[][] arr, int rows, int cols) {
		int counterForBombsAround = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (i > 0 && i < rows - 1 && j > 0 && j < cols - 1 && arr[i][j] != '*') {
					if (arr[i - 1][j - 1] == '*') {
						counterForBombsAround++;
					}
					if (arr[i - 1][j] == '*') {
						counterForBombsAround++;
					}
					if (arr[i - 1][j + 1] == '*') {
						counterForBombsAround++;
					}
					if (arr[i][j - 1] == '*') {
						counterForBombsAround++;
					}
					if (arr[i][j + 1] == '*') {
						counterForBombsAround++;
					}
					if (arr[i + 1][j - 1] == '*') {
						counterForBombsAround++;
					}
					if (arr[i + 1][j] == '*') {
						counterForBombsAround++;
					}
					if (arr[i + 1][j + 1] == '*') {
						counterForBombsAround++;
					}
				} else if (i == 0 && j == 0 && arr[i][j] != '*') {
					if (arr[i + 1][j] == '*') {
						counterForBombsAround++;
					}
					if (arr[i + 1][j + 1] == '*') {
						counterForBombsAround++;
					}
					if (arr[i][j+1] == '*') {
						counterForBombsAround++;
					}
				} else if (i == 0 && j == cols - 1 && arr[i][j] != '*') {
					if (arr[i][j - 1] == '*') {
						counterForBombsAround++;
					}
					if (arr[i + 1][j - 1] == '*') {
						counterForBombsAround++;
					}
					if (arr[i + 1][j] == '*') {
						counterForBombsAround++;
					}
				} else if (i == rows - 1 && j == 0 && arr[i][j] != '*') {
					if (arr[i - 1][j] == '*') {
						counterForBombsAround++;
					}
					if (arr[i - 1][j + 1] == '*') {
						counterForBombsAround++;
					}
					if (arr[i][j + 1] == '*') {
						counterForBombsAround++;
					}
				} else if (i == rows - 1 && j == cols - 1 && arr[i][j] != '*') {
					if (arr[i][j - 1] == '*') {
						counterForBombsAround++;
					}
					if (arr[i - 1][j - 1] == '*') {
						counterForBombsAround++;
					}
					if (arr[i - 1][j] == '*') {
						counterForBombsAround++;
					}
				} else if (i == 0 && j > 0 && j < cols - 1 && arr[i][j] != '*') {
					if (arr[i][j - 1] == '*') {
						counterForBombsAround++;
					}
					if (arr[i + 1][j - 1] == '*') {
						counterForBombsAround++;
					}
					if (arr[i + 1][j] == '*') {
						counterForBombsAround++;
					}
					if (arr[i + 1][j + 1] == '*') {
						counterForBombsAround++;
					}
					if (arr[i][j + 1] == '*') {
						counterForBombsAround++;
					}
				} else if (i == rows - 1 && j > 0 && j < cols - 1 && arr[i][j] != '*') {
					if (arr[i][j - 1] == '*') {
						counterForBombsAround++;
					}
					if (arr[i - 1][j - 1] == '*') {
						counterForBombsAround++;
					}
					if (arr[i - 1][j] == '*') {
						counterForBombsAround++;
					}
					if (arr[i - 1][j + 1] == '*') {
						counterForBombsAround++;
					}
					if (arr[i][j + 1] == '*') {
						counterForBombsAround++;
					}
				} else if (i > 0 && i < rows - 1 && j == 0 && arr[i][j] != '*') {
					if (arr[i - 1][j] == '*') {
						counterForBombsAround++;
					}
					if (arr[i - 1][j + 1] == '*') {
						counterForBombsAround++;
					}
					if (arr[i][j + 1] == '*') {
						counterForBombsAround++;
					}
					if (arr[i + 1][j + 1] == '*') {
						counterForBombsAround++;
					}
					if (arr[i + 1][j] == '*') {
						counterForBombsAround++;
					}
				} else if (i > 0 && i < rows - 1 && j == cols - 1 && arr[i][j] != '*') {
					if (arr[i - 1][j] == '*') {
						counterForBombsAround++;
					}
					if (arr[i - 1][j - 1] == '*') {
						counterForBombsAround++;
					}
					if (arr[i][j - 1] == '*') {
						counterForBombsAround++;
					}
					if (arr[i + 1][j - 1] == '*') {
						counterForBombsAround++;
					}
					if (arr[i + 1][j] == '*') {
						counterForBombsAround++;
					}
				}
				if (counterForBombsAround == 1) {
					arr[i][j] = '1';
				} else if (counterForBombsAround == 2) {
					arr[i][j] = '2';
				} else if (counterForBombsAround == 3) {
					arr[i][j] = '3';
				} else if (counterForBombsAround == 4) {
					arr[i][j] = '4';
				} else if (counterForBombsAround == 5) {
					arr[i][j] = '5';
				} else if (counterForBombsAround == 6) {
					arr[i][j] = '6';
				} else if (counterForBombsAround == 7) {
					arr[i][j] = '7';
				} else if (counterForBombsAround == 8) {
					arr[i][j] = '8';
				} else if (counterForBombsAround == 0 && arr[i][j] != '*') {
					arr[i][j] = '0';
				}
				counterForBombsAround = 0;
			}
		}
	}

	static void showZeros(char[][] arr, char[][] copyArr, boolean arr1[][], int rows, int cols, int rowCoordinate,
			int colCoordinate) {
		if (!(arr1[rowCoordinate][colCoordinate]) && arr[rowCoordinate][colCoordinate] != '0') {
			copyArr[rowCoordinate][colCoordinate] = arr[rowCoordinate][colCoordinate];
			arr1[rowCoordinate][colCoordinate] = true;
		} else if (!(arr1[rowCoordinate][colCoordinate]) && arr[rowCoordinate][colCoordinate] == '0') {
			arr1[rowCoordinate][colCoordinate] = true;
			copyArr[rowCoordinate][colCoordinate] = arr[rowCoordinate][colCoordinate];
			if (rowCoordinate > 0 && rowCoordinate < rows - 1 && colCoordinate > 0 && colCoordinate < cols - 1) {
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate - 1, colCoordinate - 1);
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate - 1, colCoordinate);
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate - 1, colCoordinate + 1);
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate, colCoordinate - 1);
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate, colCoordinate + 1);
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate + 1, colCoordinate - 1);
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate + 1, colCoordinate);
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate + 1, colCoordinate + 1);

			} else if (rowCoordinate == 0 && colCoordinate == 0) {
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate + 1, colCoordinate);
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate + 1, colCoordinate + 1);
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate, colCoordinate + 1);

			} else if (rowCoordinate == 0 && colCoordinate == cols - 1) {
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate, colCoordinate - 1);
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate + 1, colCoordinate - 1);
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate + 1, colCoordinate);

			} else if (rowCoordinate == rows - 1 && colCoordinate == 0) {
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate - 1, colCoordinate);
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate - 1, colCoordinate + 1);
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate, colCoordinate + 1);

			} else if (rowCoordinate == rows - 1 && colCoordinate == cols - 1) {
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate, colCoordinate - 1);
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate - 1, colCoordinate - 1);
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate - 1, colCoordinate);

			} else if (rowCoordinate == 0 && colCoordinate > 0 && colCoordinate < cols - 1) {
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate, colCoordinate - 1);
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate + 1, colCoordinate - 1);
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate + 1, colCoordinate);
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate + 1, colCoordinate + 1);
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate, colCoordinate + 1);

			} else if (rowCoordinate == rows - 1 && colCoordinate > 0 && colCoordinate < cols - 1) {
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate, colCoordinate - 1);
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate - 1, colCoordinate - 1);
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate - 1, colCoordinate);
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate - 1, colCoordinate + 1);
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate, colCoordinate + 1);

			} else if (rowCoordinate > 0 && rowCoordinate < rows - 1 && colCoordinate == 0) {
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate - 1, colCoordinate);
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate - 1, colCoordinate + 1);
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate, colCoordinate + 1);
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate + 1, colCoordinate + 1);
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate + 1, colCoordinate);

			} else if (rowCoordinate > 0 && rowCoordinate < rows - 1 && colCoordinate == cols - 1) {
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate - 1, colCoordinate);
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate - 1, colCoordinate - 1);
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate, colCoordinate - 1);
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate + 1, colCoordinate - 1);
				showZeros(arr, copyArr, arr1, rows, cols, rowCoordinate + 1, colCoordinate);

			}
		}

	}

	static void fillCopyArr(char[][] arr, int rows, int cols) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = ' ';
			}
		}
	}

}
