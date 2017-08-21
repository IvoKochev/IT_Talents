package bg.ittalents.boardGame.game;

import bg.ittalents.boardGame.dotsAndBoxes.DotsAndBoxes;
import bg.ittalents.boardGame.mineSwaper.MineSweeper;
import bg.ittalents.boardGame.seaChess.SeaChess;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Demo {

    static JFrame frame;
    static JPanel panel;
    static JButton mineSweeperBtn;
    static JButton seaChessBtn;
    static JButton foxAndHoundsBtn;
    static JButton dotsAndBoxesBtn;
    private static Game newGame;

    public static void openMenu() {
        frame = new JFrame("Game Menu");
        frame.setSize(200, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        mineSweeperBtn = new JButton("Mine Sweeper");
        seaChessBtn = new JButton("Sea Chess");
        foxAndHoundsBtn = new JButton("Fox And Hounds");
        dotsAndBoxesBtn = new JButton("Dots And Boxes");
        panel = new JPanel();
        panel.add(foxAndHoundsBtn);
        panel.add(dotsAndBoxesBtn);
        panel.add(mineSweeperBtn);
        panel.add(seaChessBtn);
        frame.add(panel, BorderLayout.CENTER);

        foxAndHoundsBtn.addActionListener((ActionEvent e) -> {

        });
        dotsAndBoxesBtn.addActionListener((ActionEvent e) -> {
        	frame.dispose();
        	newGame = new DotsAndBoxes(new Player("Ivo"), new Robot(), Level.LEVEL1);
        	newGame.play();

        });
        mineSweeperBtn.addActionListener((ActionEvent e) -> {
            frame.dispose();
            newGame = new MineSweeper(new Player("Slavi"), Level.LEVEL1);
            newGame.play();
        });
        seaChessBtn.addActionListener((ActionEvent e) -> {
        	frame.dispose();
        	newGame = new SeaChess(new Player("Ivo"), new Robot(), Level.LEVEL1);
        	newGame.play();
        });
    }

    public static void main(String[] args) {
        openMenu();

    }

}

