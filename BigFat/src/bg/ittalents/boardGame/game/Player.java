package bg.ittalents.boardGame.game;

public class Player implements IPlayer {

    private final String name;
    private int score;

    Player(String name) {
        this.name = name;
    }

    @Override
    public void setScore(int score) {
        if (score < 0) {
            System.err.println("Invalid score");
            return;
        }
        this.score = score;
    }

    @Override
    public int getScore() {
        return score;
    }

    @Override
    public int getRow() {
        System.out.print("Enter row " + "\u2193" + " = ");
        while (!Game.input.hasNextInt()) {
            System.err.print("Enter row " + "\u2193" + " = ");
            Game.input.next();
        }
        return Game.input.nextInt();
    }

    @Override
    public int getCol() {
        System.out.print("Enter col " + "\u2192" + " = ");
        while (!Game.input.hasNextInt()) {
            System.err.print("Enter col " + "\u2192" + " = ");
            Game.input.next();
        }
        return Game.input.nextInt();
    }

    public String getName() {
        return name;
    }
}

