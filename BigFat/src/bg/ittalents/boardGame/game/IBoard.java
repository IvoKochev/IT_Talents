package bg.ittalents.boardGame.game;

public interface IBoard {

    static final String ANSI_RED = "\u001B[31m";
    static final String ANSI_BLACK = "\u001B[30m";
    static final String ANSI_GOLD = "\u001B[33m";
    static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    static final String ANSI_WIHITE_BACKGROUND = "\u001B[107m";

    public void makeMatrix(int row, int col);

    public String[][] getMatrixx();
}
