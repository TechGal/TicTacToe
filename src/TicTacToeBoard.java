import java.awt.*;
import javax.swing.*;


/**
 * Created by Aila on 2016-12-29.
 * This is a simple Tic Tac Toe game.
 */

public class TicTacToeBoard extends JFrame{

    public void initialize (){

        int moves = 9;

        int turn = 0;

        boolean gameWon = false;

        //Create a window to play the game
        JFrame board = new JFrame();
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel game = new JPanel(new GridLayout(3, 3));
        JPanel menu = new JPanel(new BorderLayout());
        JPanel bottomLeft = new JPanel(new BorderLayout());
        JPanel bottomRight = new JPanel(new BorderLayout());
        JPanel bottomCenter = new JPanel(new FlowLayout());
        JButton [][] buttons = new JButton[3][3];
        JButton reset = new JButton();
        JButton start = new JButton();

        JLabel status = new JLabel("Tic Tac Toe Game");

        board.setTitle("Tic Tac Toe Game");
        board.setSize(400, 500);
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board.setLocationRelativeTo(null);

        board.add(mainPanel);

        mainPanel.setPreferredSize(new Dimension(350, 450));
        game.setPreferredSize(new Dimension(300, 300));
        menu.setPreferredSize(new Dimension(300, 100));

        mainPanel.add(game, BorderLayout.NORTH);
        mainPanel.add(menu, BorderLayout.SOUTH);

        menu.add(bottomLeft, BorderLayout.WEST);
        bottomLeft.add(reset);
        reset.setBounds(10, 10, 100, 25);
        reset.setText("Reset");
        reset.setVisible(true);
        menu.add(bottomRight, BorderLayout.EAST);
        bottomRight.add(start);
        start.setBounds(10, 10, 100, 25);
        start.setText("Start");
        start.setVisible(true);
        menu.add(bottomCenter, BorderLayout.NORTH);
        bottomCenter.add(status, BorderLayout.CENTER);
        status.setBounds(0, 0, 100, 50);
        status.setVisible(true);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                buttons[i][j] = new JButton();
                buttons[i][j].setText(" ");
                buttons[i][j].setSize(100, 100);
                buttons[i][j].setVisible(true);

                game.add(buttons[i][j]);
                //buttons[i][j].addActionListener(new myActionListener);

            }
        }

        board.setVisible(true);

    }

    public static void main (String [] args) {

        TicTacToeBoard TicTacToe = new TicTacToeBoard();
        TicTacToe.initialize();

    }

}
