import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Created by Aila on 2016-12-29.
 * This is a simple Tic Tac Toe game.
 */

public class TicTacToeBoard extends JFrame{

    public static void main (String []args){

        //Create a window to play the game
        JFrame board = new JFrame();

        board.setTitle("Tic Tac Toe Game");
        board.setSize(600, 600);
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board.setLocationRelativeTo(null);
        board.setVisible(true);
    }

}
