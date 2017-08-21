package bg.ittalents.boardGame.dotsAndBoxes;

import java.util.Random;

import bg.ittalents.boardGame.game.Board;
import bg.ittalents.boardGame.game.Demo;
import bg.ittalents.boardGame.game.Game;
import bg.ittalents.boardGame.game.Level;
import bg.ittalents.boardGame.game.Player;
import bg.ittalents.boardGame.game.Robot;

public final class DotsAndBoxes extends Game {

    public DotsAndBoxes(Player player, Robot robot, Level level) {
        super("Dots and Boxes", player, robot);
        this.setLevel(level);
        System.out.println(Board.ANSI_RED + this.getGameName() + "     " + Board.ANSI_BLACK + "\n");
    }

    @Override
    protected void makeGame() {
        // TODO Auto-generated method stub

    }

    @Override
    protected void play() {
        while (true) {
            this.printMatrix();
            this.playerMove();
            if (isPlayerWin()) {
                this.printMatrix();
                System.out.println(this.getPlayer1().getName() + " wins!");
                gameOver();
                break;
            }
            this.printMatrix();
            this.botMovee();
            if (isBotWin()) {
                this.printMatrix();
                System.out.println("Bot wins!");
                gameOver();
                break;
            }
        }

    }

    @Override
    protected int[] playerMove() {
        int row, row1, col, col1;
        boolean isFilled = false;
        int count1 = 0;
        int numberOfLetters;
        do {
            numberOfLetters = countLetters("A");
            do {
                if (count1 == 1) {
                    System.out.println("Wrong coordinates! Try again!");
                    count1 = 0;
                }
                int count = 0;
                do {
                    if (count == 1) {
                        System.out.println("Wrong coordinates! Try again!");
                        count = 0;
                    }
                    System.out.println("Please, enter the first dot: ");
                    row = this.getPlayer1().getRow();
                    col = this.getPlayer1().getCol();
                    System.out.println("Please, enter the second dot: ");
                    row1 = this.getPlayer1().getRow();
                    col1 = this.getPlayer1().getCol();
                    count++;
                } while (!isInBounds(row, col, row1, col1));
                if (row > 0) {
                    row *= 2;
                }
                if (col > 0) {
                    col *= 2;
                }
                if (row1 > 0) {
                    row1 *= 2;
                }
                if (col1 > 0) {
                    col1 *= 2;
                }
                if (areDotsLegal(row, col, row1, col1) && isFilled(row, col, row1, col1)) {
                    this.fillMatrix(row, col, row1, col1);
                    isFilled = true;
                } else {
                    count1++;
                }
            } while (!isFilled);
            fillLetter("A");
            this.printMatrix();
            if (isPlayerWin()) {
                System.out.println("Game over!");
                break;
            }
        } while (numberOfLetters < countLetters("A"));
        return null;
    }

    private boolean isGameOver() {
        for (int i = 1; i < this.getBoard().getRowLength() - 2; i += 2) {
            for (int j = 1; j < this.getBoard().getColLength() - 2; j += 2) {
                if (this.getBoard().getMatrixx()[i][j].equals(" ")) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isPlayerWin() {
        if (isGameOver()) {
            int countForA = 0, countForO = 0;
            for (int i = 1; i < this.getBoard().getRowLength() - 2; i += 2) {
                for (int j = 1; j < this.getBoard().getColLength() - 2; j += 2) {
                    if (this.getBoard().getMatrixx()[i][j].equals("A")) {
                        countForA++;
                    } else if (this.getBoard().getMatrixx()[i][j].equals("O")) {
                        countForO++;
                    }
                }
            }
            return countForA > countForO;
        }
        return false;

    }

    private boolean isBotWin() {
        if (isGameOver()) {
            int countForA = 0, countForO = 0;
            for (int i = 1; i < this.getBoard().getRowLength() - 2; i += 2) {
                for (int j = 1; j < this.getBoard().getColLength() - 2; j += 2) {
                    if (this.getBoard().getMatrixx()[i][j].equals("A")) {
                        countForA++;
                    } else if (this.getBoard().getMatrixx()[i][j].equals("O")) {
                        countForO++;
                    }
                }
            }
            return countForO > countForA;
        }
        return false;
    }

    private int countLetters(String letter) {
        int count = 0;
        for (int i = 1; i < this.getBoard().getRowLength() - 2; i += 2) {
            for (int j = 1; j < this.getBoard().getColLength() - 2; j += 2) {
                if (this.getBoard().getMatrixx()[i][j].equals(letter)) {
                    count++;
                }
            }
        }
        return count;
    }

    private void fillLetter(String letter) {
        for (int i = 1; i < this.getBoard().getRowLength() - 2; i += 2) {
            for (int j = 1; j < this.getBoard().getColLength() - 2; j += 2) {
                if (this.getBoard().getMatrixx()[i][j].equals(" ")) {
                    if (this.getBoard().getMatrixx()[i - 1][j].equals("-")
                            && this.getBoard().getMatrixx()[i + 1][j].equals("-")
                            && this.getBoard().getMatrixx()[i][j + 1].equals("|")
                            && this.getBoard().getMatrixx()[i][j - 1].equals("|")) {
                        this.getBoard().getMatrixx()[i][j] = letter;
                    }
                }
            }
        }
    }

    private boolean isFilled(int row, int col, int row1, int col1) {
        if (row > row1) {
            return this.getBoard().getMatrixx()[row - 1][col].equals(" ");
        }
        if (row1 > row) {
            return this.getBoard().getMatrixx()[row1 - 1][col].equals(" ");
        }
        if (col > col1) {
            return this.getBoard().getMatrixx()[row][col - 1].equals(" ");
        }
        if (col1 > col) {
            return this.getBoard().getMatrixx()[row][col1 - 1].equals(" ");
        }

        return false;

    }

    private boolean areDotsLegal(int row, int col, int row1, int col1) {
        if (row == row1 && col == col1) {
            return false;
        }
        if (row == row1) {
            if (col - col1 == 2) {
                return true;
            } else {
                return col1 - col == 2;
            }
        }
        if (col == col1) {
            if (row - row1 == 2) {
                return true;
            } else {
                return row1 - row == 2;
            }
        }

        return false;
    }

    private boolean isInBounds(int row, int col, int row1, int col1) {
        return row >= 0 && row < this.getBoard().getRowLength() / 2 && row1 >= 0
                && row1 < this.getBoard().getRowLength() / 2 && col >= 0 && col < this.getBoard().getColLength() / 2
                && col1 >= 0 && col1 < this.getBoard().getColLength() / 2;

    }

    private boolean isInBounds(int row, int col) {
        return row >= 0 && row < this.getBoard().getRowLength() && col >= 0 && col < this.getBoard().getColLength();
    }

    @Override
    protected int[] botMovee() {
        Random r = new Random();
        int count, countForO;
        do {
            countForO = countLetters("O");
            count = 0;
            for (int i = 1; i < this.getBoard().getRowLength() - 2; i += 2) {
                for (int j = 1; j < this.getBoard().getColLength() - 2; j += 2) {
                    if (this.getBoard().getMatrixx()[i][j].equals(" ")) {
                        if (this.getBoard().getMatrixx()[i - 1][j].equals("-")) {
                            count++;
                        }
                        if (this.getBoard().getMatrixx()[i + 1][j].equals("-")) {
                            count++;
                        }
                        if (this.getBoard().getMatrixx()[i][j - 1].equals("|")) {
                            count++;
                        }
                        if (this.getBoard().getMatrixx()[i][j + 1].equals("|")) {
                            count++;
                        }
                    }
                    if (count == 3) {
                        if (this.getBoard().getMatrixx()[i - 1][j].equals(" ")) {
                            this.getBoard().getMatrixx()[i - 1][j] = "-";
                            break;
                        }
                        if (this.getBoard().getMatrixx()[i + 1][j].equals(" ")) {
                            this.getBoard().getMatrixx()[i + 1][j] = "-";
                            break;
                        }
                        if (this.getBoard().getMatrixx()[i][j - 1].equals(" ")) {
                            this.getBoard().getMatrixx()[i][j - 1] = "|";
                            break;
                        }
                        if (this.getBoard().getMatrixx()[i][j + 1].equals(" ")) {
                            this.getBoard().getMatrixx()[i][j + 1] = "|";
                            break;
                        }
                    }
                    count = 0;

                }
                if (count == 3) {
                    break;
                }
                count = 0;

            }
            if (count == 3) {
                fillLetter("O");
            } else {
                int row = 0, col = 0;
                int cnt = 0;
                do {
                    do {
                        row = r.nextInt(this.getBoard().getRowLength() / 2);
                        col = r.nextInt(this.getBoard().getColLength() / 2);
                        if (row > 0) {
                            row *= 2;
                        }
                        if (col > 0) {
                            col *= 2;
                        }
                        if (isInBounds(row - 2, col) && this.getBoard().getMatrixx()[row - 1][col].equals(" ")) {
                            row = row - 1;
                        } else if (isInBounds(row + 2, col) && this.getBoard().getMatrixx()[row + 1][col].equals(" ")) {
                            row = row + 1;
                        } else if (isInBounds(row, col - 2) && this.getBoard().getMatrixx()[row][col - 1].equals(" ")) {
                            col = col - 1;
                        } else if (isInBounds(row, col + 2) && this.getBoard().getMatrixx()[row][col + 1].equals(" ")) {
                            col = col + 1;
                        }
                        if (isFilled(row, col)) {
                            cnt++;
                            if (row % 2 == 0) {
                                this.getBoard().getMatrixx()[row][col] = "-";
                            } else {
                                this.getBoard().getMatrixx()[row][col] = "|";
                            }
                        }
                    } while (cnt == 0);
                    System.out.println(row + " " + col);
                } while (isFilled(row, col));

            }
            if (isBotWin()) {
                System.out.println("Game over!");
                break;
            }
        } while (countForO < countLetters("O"));
        return null;
    }

    private boolean isFilled(int row, int col) {
        return this.getBoard().getMatrixx()[row][col].equals(" ");
    }

    @Override
    protected final void setLevel(Level level) {
        this.setCurrentLevel(level);
        switch (level) {
            case LEVEL1:
                this.setBoard(new Board(8, 8));
                this.fillMatrix();
                break;
            case LEVEL2:
                this.setBoard(new Board(10, 10));
                this.fillMatrix();
                break;
            case LEVEL3:
                this.setBoard(new Board(12, 12));
                this.fillMatrix();
                break;
        }

    }

    private void fillMatrix(int row, int col, int row1, int col1) {
        if (row == row1) {
            if (col > col1) {
                this.getBoard().getMatrixx()[row][col - 1] = "-";
            } else if (col1 > col) {
                this.getBoard().getMatrixx()[row][col + 1] = "-";
            }
        } else {
            if (row > row1) {
                this.getBoard().getMatrixx()[row - 1][col] = "|";
            } else if (row1 > row) {
                this.getBoard().getMatrixx()[row + 1][col] = "|";
            }
        }

    }

    protected void fillMatrix() {
        for (int i = 0; i < this.getBoard().getRowLength(); i++) {
            for (int j = 0; j < this.getBoard().getColLength(); j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    this.getBoard().getMatrixx()[i][j] = "O";
                } else {
                    this.getBoard().getMatrixx()[i][j] = " ";
                }
            }
        }
    }

    private void fillMatrix(int row, int col) {
        if (row % 2 == 0) {
            this.getBoard().getMatrixx()[row][col] = "-";
        } else {
            this.getBoard().getMatrixx()[row][col] = "|";
        }
    }

    protected void printMatrix() {
        int count = 0;
        System.out.print("  ");
        for (int i = 0; i < this.getBoard().getRowLength(); i++) {
            if (i % 2 == 0) {
                System.out.print(count + " ");
                count++;
            }
        }
        count = 0;
        System.out.println();
        for (int i = 0; i < this.getBoard().getRowLength(); i++) {
            if (i % 2 == 0) {
                System.out.print(count + " ");
                count++;
            } else {
                System.out.print("  ");
            }

            for (int j = 0; j < this.getBoard().getColLength(); j++) {
                System.out.print(this.getBoard().getMatrixx()[i][j]);
            }
            System.out.println();
        }
    }

    @Override
    protected void nextLevel() {
        // TODO Auto-generated method stub

    }

    @Override
    protected void gameOver() {
        System.out.println("Game over!");
        new Demo().loadMenu();
    }

}