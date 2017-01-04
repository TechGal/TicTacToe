import java.awt.*;
import javax.swing.*;


/**
 * Created by Aila on 2016-12-29.
 * This is a simple Tic Tac Toe game.
 */

public class TicTacToeBoard extends JFrame{

    public static void main (String []args){

        int moves = 9;

        int turn = 0;

        boolean gameWon = false;

        //Create a window to play the game
        JFrame board = new JFrame();
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel game = new JPanel(new GridLayout(3, 3));
        JPanel menu = new JPanel(new BorderLayout());

        JButton [][] buttons = new JButton[3][3];
        JButton reset = new JButton();
        JButton start = new JButton();

        JLabel status = new JLabel("Tic Tac Toe Game");

        board.setTitle("Tic Tac Toe Game");
        board.setSize(400, 500);
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board.setLocationRelativeTo(null);
        board.setVisible(true);

        board.add(mainPanel);

        mainPanel.setPreferredSize(new Dimension(350, 450));
        game.setPreferredSize(new Dimension(300, 300));
        menu.setPreferredSize(new Dimension(300, 100));

        mainPanel.add(game, BorderLayout.NORTH);
        mainPanel.add(menu, BorderLayout.SOUTH);

        menu.add(reset, BorderLayout.SOUTH);
        reset.setSize(100, 25);
        reset.setText("Reset");
        reset.setVisible(true);
        menu.add(start, BorderLayout.SOUTH);
        start.setSize(100, 25);
        start.setText("Start");
        start.setVisible(true);
        menu.add(status, BorderLayout.NORTH);
        status.setVisible(true);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                buttons[i][j] = new JButton();
                buttons[i][j].setText(" ");
                buttons[i][j].setVisible(true);
                buttons[i][j].setSize(100,100);

                game.add(buttons[i][j]);
                //buttons[i][j].addActionListener(new myActionListner);

            }
        }



    }

}
