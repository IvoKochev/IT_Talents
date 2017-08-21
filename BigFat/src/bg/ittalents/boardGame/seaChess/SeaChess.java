package bg.ittalents.boardGame.seaChess;

import java.util.Random;

import bg.ittalents.boardGame.game.Board;
import bg.ittalents.boardGame.game.Demo;
import bg.ittalents.boardGame.game.Game;
import bg.ittalents.boardGame.game.Level;
import bg.ittalents.boardGame.game.Player;
import bg.ittalents.boardGame.game.Robot;

public class SeaChess extends Game {

	public SeaChess(Player player1, Robot robot, Level level) {
		super("Sea Chess", player1, robot);
		this.setLevel(level);
	}

	@Override
	protected void nextLevel() {

	}

	@Override
	protected void makeGame() {

	}

	@Override
	protected void play() {
		while (true) {
			this.playerMove();
			this.printMatrix(this.getBoard().getMatrixx());
			if (isPlayerWin()) {
				System.out.println(this.getPlayer1().getName() + " wins!");
				gameOver();
				break;
			}
			if(isWholeMatrixFilled()) {
				Demo.openMenu();
				break;
			}
			this.botMove();
			this.printMatrix(this.getBoard().getMatrixx());
			if (isBotWin()) {
				System.out.println("The robot has defeated you!");
				gameOver();
				break;
			}
			if(isWholeMatrixFilled()) {
				Demo.openMenu();
				break;
			}
		}

	}

	@Override
	public void printMatrix(String[][] board) {
		for (int i = 0; i < this.getBoard().getRowLength(); i++) {
			System.out.print("    -");
			for (int k = 1; k < this.getBoard().getColLength(); k++) {
				System.out.print("   -");
			}
			System.out.println();
			System.out.print(i + (i <= 9 ? " " : ""));
			for (int j = 0; j < this.getBoard().getColLength(); j++) {
				System.out.print(j == 0 ? "| " + board[i][j] + " |" : " " + board[i][j] + " |");
			}
			System.out.println();
		}
		System.out.print("    -");
		for (int k = 1; k < this.getBoard().getColLength(); k++) {
			System.out.print("   -");
		}
		System.out.println();
		System.out.print("  ");
		for (int i = 0; i < this.getBoard().getColLength(); i++) {
			System.out.print("  " + i + (i <= 9 ? " " : ""));
		}
		System.out.println();
	}

	@Override
	protected void setLevel(Level level) {
		this.setCurrentLevel(level);
		switch (level) {
		case LEVEL1:
			this.setBoard(new Board(3, 3));
			this.fillMatrix();
			break;
		case LEVEL2:
			this.setBoard(new Board(4, 4));
			this.fillMatrix();
			break;
		case LEVEL3:
			this.setBoard(new Board(5, 5));
			this.fillMatrix();
			break;

		}

	}

	@Override
	protected void gameOver() {
		System.out.println("Game over!");
		Demo.openMenu();
	}

	@Override
	protected void playerMove() {
		// throw new UnsupportedOperationException("Not supported yet.");
		boolean isFilled = false;
		do {
			int row, col, count = 0;
			do {
				if (count == 1) {
					System.out.println("Wrong coordinates! Try again!");
					count = 0;
				}
				row = this.getPlayer1().getRow();
				col = this.getPlayer1().getCol();
				count++;
			} while (!isInBounds(row, col));
			if (count == 1) {
				System.out.println("Wrong coordinates! Try again!");
				count = 0;
			}
			if (!isMatrixFilled(row, col)) {
				fillMatrixPlayer(row, col);
				isFilled = true;
			}
			count++;
		} while (!isFilled);
	}

	@Override
	protected void botMove() {
		
		// throw new UnsupportedOperationException("Not supported yet.");
		int botMoves = 0, playerMoves = 0;
		for(int i = 0; i < this.getBoard().getRowLength(); i++) {
			for(int j = 0; j < this.getBoard().getColLength(); j++) {
				if(this.getBoard().getMatrixx()[i][j].equals("X")) {
					playerMoves++;
				} else if(this.getBoard().getMatrixx()[i][j].equals("O")) {
					botMoves++;
				}
			}
		}
		
		int countForO = 0;

		for (int row = 0; row < this.getBoard().getRowLength(); row++) {
			for (int col = 0; col < this.getBoard().getColLength(); col++) {
				if (this.getBoard().getMatrixx()[row][col].equals("O")) {
					countForO++;
				}
			}
		}
		if (countForO >= (this.getBoard().getRowLength() - 1)) {
			int count = 0;
			for (int row = 0; row < this.getBoard().getRowLength(); row++) {
				for (int col = 0; col < this.getBoard().getColLength(); col++) {
					if (this.getBoard().getMatrixx()[row][col].equals("O")) {
						count++;
					}
				}
				if (count == this.getBoard().getRowLength() - 1) {
					for (int i = 0; i < this.getBoard().getColLength(); i++) {
						if (this.getBoard().getMatrixx()[row][i].equals(" ")) {
							fillMatrixBot(row, i);
							return;
						}
					}
				}
				count = 0;
			}
			count = 0;
			for (int row = 0; row < this.getBoard().getRowLength(); row++) {
				for (int col = 0; col < this.getBoard().getColLength(); col++) {
					if (this.getBoard().getMatrixx()[col][row].equals("O")) {
						count++;
					}
				}
				if (count == this.getBoard().getRowLength() - 1) {
					for (int i = 0; i < this.getBoard().getColLength(); i++) {
						if (this.getBoard().getMatrixx()[i][row].equals(" ")) {
							fillMatrixBot(i, row);
							return;
						}
					}
				}
				count = 0;
			}
			count = 0;
			for (int row = 0; row < this.getBoard().getRowLength(); row++) {
				if (this.getBoard().getMatrixx()[row][row].equals("O")) {
					count++;
				}
			}
			if (count == this.getBoard().getRowLength() - 1) {
				for (int row = 0; row < this.getBoard().getColLength(); row++) {
					if (this.getBoard().getMatrixx()[row][row].equals(" ")) {
						fillMatrixBot(row, row);
						return;
					}
				}
			}
			count = 0;
			for (int row = 0; row < this.getBoard().getRowLength(); row++) {
				for (int col = 0; col < this.getBoard().getColLength(); col++) {
					if (row + col == this.getBoard().getColLength() - 1) {
						if (this.getBoard().getMatrixx()[row][col].equals("O")) {
							count++;
						}
					}
				}
			}
			if (count == this.getBoard().getRowLength() - 1) {
				for (int row = 0; row < this.getBoard().getColLength(); row++) {
					for (int col = 0; col < this.getBoard().getColLength(); col++) {
						if (this.getBoard().getMatrixx()[row][col].equals(" ")) {
							fillMatrixBot(row, col);
							return;
						}
					}
				}
			}
		}

		int countForX = 0;
		for (int row = 0; row < this.getBoard().getRowLength(); row++) {
			for (int col = 0; col < this.getBoard().getColLength(); col++) {
				if (this.getBoard().getMatrixx()[row][col].equals("X")) {
					countForX++;
				}
			}
		}
		if (countForX >= (this.getBoard().getRowLength() - 1)) {
			int count1 = 0;
			for (int row = 0; row < this.getBoard().getRowLength(); row++) {
				for (int col = 0; col < this.getBoard().getColLength(); col++) {
					if (this.getBoard().getMatrixx()[row][col].equals("X")) {
						count1++;
					}
				}
				if (count1 == this.getBoard().getRowLength() - 1) {
					for (int i = 0; i < this.getBoard().getColLength(); i++) {
						if (this.getBoard().getMatrixx()[row][i].equals(" ")) {
							fillMatrixBot(row, i);
							return;
						}
					}
				}
				count1 = 0;
			}
			count1 = 0;
			for (int row = 0; row < this.getBoard().getRowLength(); row++) {
				for (int col = 0; col < this.getBoard().getColLength(); col++) {
					if (this.getBoard().getMatrixx()[col][row].equals("X")) {
						count1++;
					}
				}
				if (count1 == this.getBoard().getRowLength() - 1) {
					for (int i = 0; i < this.getBoard().getColLength(); i++) {
						if (this.getBoard().getMatrixx()[i][row].equals(" ")) {
							fillMatrixBot(i, row);
							return;
						}
					}
				}
				count1 = 0;
			}
			count1 = 0;
			for (int row = 0; row < this.getBoard().getRowLength(); row++) {
				if (this.getBoard().getMatrixx()[row][row].equals("X")) {
					count1++;
				}
			}
			if (count1 == this.getBoard().getRowLength() - 1) {
				for (int row = 0; row < this.getBoard().getColLength(); row++) {
					if (this.getBoard().getMatrixx()[row][row].equals(" ")) {
						fillMatrixBot(row, row);
						return;
					}
				}
			}
			count1 = 0;
			for (int row = 0; row < this.getBoard().getRowLength(); row++) {
				for (int col = 0; col < this.getBoard().getColLength(); col++) {
					if (row + col == this.getBoard().getColLength() - 1) {
						if (this.getBoard().getMatrixx()[row][col].equals("X")) {
							count1++;
						}
					}
				}
			}
			if (count1 == this.getBoard().getRowLength() - 1) {
				for (int row = 0; row < this.getBoard().getColLength(); row++) {
					for (int col = 0; col < this.getBoard().getColLength(); col++) {
						if (this.getBoard().getMatrixx()[row][col].equals(" ")) {
							fillMatrixBot(row, col);
							return;
						}
					}
				}
			}

		} else {
			Random r = new Random();
			int row, col;
			do {
				row = r.nextInt(this.getBoard().getRowLength());
				col = r.nextInt(this.getBoard().getColLength());
			} while (this.isMatrixFilled(row, col));
			fillMatrixBot(row, col);
			return;
		}
		if(playerMoves > botMoves) {
			Random r = new Random();
			int row, col;
			do {
				row = r.nextInt(this.getBoard().getRowLength());
				col = r.nextInt(this.getBoard().getColLength());
			} while (this.isMatrixFilled(row, col));
			fillMatrixBot(row, col);
			return;
		}
	}

	protected void fillMatrixPlayer(int row, int col) {
		this.getBoard().getMatrixx()[row][col] = "X";

	}

	protected boolean isMatrixFilled(int row, int col) {
		return this.getBoard().getMatrixx()[row][col].equals(" ") ? false : true;
	}

	protected void fillMatrix() {
		for (int i = 0; i < this.getBoard().getRowLength(); i++) {
			for (int j = 0; j < this.getBoard().getColLength(); j++) {
				this.getBoard().getMatrixx()[i][j] = " ";
			}
		}
	}

	protected boolean isPlayerWin() {
		boolean isWin = true;
		for (int row = 0; row < this.getBoard().getRowLength(); row++) {
			if (!this.getBoard().getMatrixx()[row][row].equals("X")) {
				isWin = false;
				break;
			}
		}
		if (isWin) {
			return true;
		}
		isWin = true;
		for (int row = 0; row < this.getBoard().getRowLength(); row++) {
			for (int col = 0; col < this.getBoard().getColLength(); col++) {
				if (!this.getBoard().getMatrixx()[row][col].equals("X")) {
					isWin = false;
					break;
				}
			}
			if (isWin) {
				return true;
			}
			isWin = true;
		}
		for (int row = 0; row < this.getBoard().getRowLength(); row++) {
			for (int col = 0; col < this.getBoard().getColLength(); col++) {
				if (!this.getBoard().getMatrixx()[col][row].equals("X")) {
					isWin = false;
					break;
				}
			}
			if (isWin) {
				return true;
			}
			isWin = true;
		}
		for (int row = 0; row < this.getBoard().getRowLength(); row++) {
			for (int col = 0; col < this.getBoard().getColLength(); col++) {
				if ((row + col) == this.getBoard().getColLength() - 1
						&& !this.getBoard().getMatrixx()[row][col].equals("X")) {
					isWin = false;
					break;
				}
			}
		}
		if (isWin) {
			return true;
		}
		isWin = true;
		return false;

	}

	protected boolean isInBounds(int row, int col) {
		if (row >= 0 && row < this.getBoard().getRowLength() && col >= 0 && col < this.getBoard().getColLength()) {
			return true;
		} else {
			return false;
		}
	}

	protected boolean isBotWin() {
		boolean isWin = true;
		for (int row = 0; row < this.getBoard().getRowLength(); row++) {
			if (!this.getBoard().getMatrixx()[row][row].equals("O")) {
				isWin = false;
				break;
			}
		}
		if (isWin) {
			return true;
		}
		isWin = true;
		for (int row = 0; row < this.getBoard().getRowLength(); row++) {
			for (int col = 0; col < this.getBoard().getColLength(); col++) {
				if (!this.getBoard().getMatrixx()[row][col].equals("O")) {
					isWin = false;
					break;
				}

			}
			if (isWin) {
				return true;
			}
			isWin = true;
		}
		for (int row = 0; row < this.getBoard().getRowLength(); row++) {
			for (int col = 0; col < this.getBoard().getColLength(); col++) {
				if (!this.getBoard().getMatrixx()[col][row].equals("O")) {
					isWin = false;
					break;
				}
			}
			if (isWin) {
				return true;
			}
			isWin = true;
		}
		for (int row = 0; row < this.getBoard().getRowLength(); row++) {
			for (int col = 0; col < this.getBoard().getColLength(); col++) {
				if ((row + col) == this.getBoard().getColLength() - 1
						&& !this.getBoard().getMatrixx()[row][col].equals("X")) {
					isWin = false;
					break;
				}
			}
		}
		if (isWin) {
			return true;
		}

		return false;

	}

	protected void fillMatrixBot(int row, int col) {
		this.getBoard().getMatrixx()[row][col] = "O";
	}

	protected boolean isWholeMatrixFilled() {
		for (int row = 0; row < this.getBoard().getRowLength(); row++) {
			for (int col = 0; col < this.getBoard().getColLength(); col++) {
				if (this.getBoard().getMatrixx()[row][col].equals(" ")) {
					return false;
				}
			}
		}
		System.out.println("Tie!");
		return true;
	}
}
