package bg.ittalents.boardGame.seaChess;

import java.util.Random;

import bg.ittalents.boardGame.game.Board;
import bg.ittalents.boardGame.game.Demo;
import bg.ittalents.boardGame.game.Game;
import bg.ittalents.boardGame.game.Level;
import bg.ittalents.boardGame.game.Player;
import bg.ittalents.boardGame.game.Robot;

public final class TicTacToE extends Game {

    public TicTacToE(Player player1, Robot robot, Level level) {
        super("Tic Tac Toe", player1, robot);
        this.setLevel(level);
        System.out.println(Board.ANSI_RED + this.getGameName() + "     " + Board.ANSI_BLACK + "\n");
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
            this.getPlayer1().makeMove(this.getBoard().getMatrixx(), this.playerMove(), "X");
            this.printMatrix(this.getBoard().getMatrixx());
            if (isPlayerWin()) {
                System.out.println(this.getPlayer1().getName() + " wins!");
                gameOver();
                break;
            }
            if (isWholeMatrixFilled()) {
                new Demo().loadMenu();
                break;
            }
            this.getRobot().makeMove(this.getBoard().getMatrixx(), this.botMovee(), "0");
            this.printMatrix(this.getBoard().getMatrixx());
            if (isBotWin()) {
                System.out.println("The robot has defeated you!");
                gameOver();
                break;
            }
            if (isWholeMatrixFilled()) {
                new Demo().loadMenu();
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
        new Demo().loadMenu();
    }

    @Override
    protected int[] playerMove() {
        boolean isFilled = false;
        int[] coordinates = new int[2];

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
                coordinates[0] = row;
                coordinates[1] = col;
                isFilled = true;
            }
            count++;
        } while (!isFilled);
        return coordinates;
    }

    @Override
    protected int[] botMovee() {
        int[] coordinates = new int[2];
        int botMoves = 0, playerMoves = 0;

        for (int i = 0; i < this.getBoard().getRowLength(); i++) {
            for (int j = 0; j < this.getBoard().getColLength(); j++) {
                if (this.getBoard().getMatrixx()[i][j].equals("X")) {
                    playerMoves++;
                } else if (this.getBoard().getMatrixx()[i][j].equals("O")) {
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
                            coordinates[0] = row;
                            coordinates[1] = i;
                            return coordinates;
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
                            coordinates[0] = i;
                            coordinates[1] = row;
                            return coordinates;
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
                        coordinates[0] = row;
                        coordinates[1] = row;
                        return coordinates;
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
                            coordinates[0] = row;
                            coordinates[1] = col;
                            return coordinates;
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
                            coordinates[0] = row;
                            coordinates[1] = i;
                            return coordinates;
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
                            coordinates[0] = i;
                            coordinates[1] = row;
                            return coordinates;
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
                        coordinates[0] = row;
                        coordinates[1] = row;
                        return coordinates;
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
                            coordinates[0] = row;
                            coordinates[1] = col;
                            return coordinates;
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
            coordinates[0] = row;
            coordinates[1] = col;
            return coordinates;
        }
        if (playerMoves > botMoves) {
            Random r = new Random();
            int row, col;
            do {
                row = r.nextInt(this.getBoard().getRowLength());
                col = r.nextInt(this.getBoard().getColLength());
            } while (this.isMatrixFilled(row, col));
            coordinates[0] = row;
            coordinates[1] = col;
        }
        return coordinates;
    }

    protected boolean isMatrixFilled(int row, int col) {
        return !this.getBoard().getMatrixx()[row][col].equals(" ");
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
        return isWin;

    }

    protected boolean isInBounds(int row, int col) {
        return row >= 0 && row < this.getBoard().getRowLength() && col >= 0 && col < this.getBoard().getColLength();
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
        return isWin;

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