import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;


/**
 * Created by Aila on 2016-12-29.
 * This is a simple Tic Tac Toe game.
 */

public class TicTacToeBoard extends JFrame implements ActionListener /*implements ActionListener*/{

    JButton[][] buttons= new JButton[3][3];
    int moves = 9;
    int turn = 0;

    boolean gameWon = false;

    String playerName;

    public void initialize (){

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
        reset.setActionCommand("reset");
        reset.setVisible(true);

        menu.add(bottomRight, BorderLayout.EAST);
        bottomRight.add(start);
        start.setBounds(10, 10, 100, 25);
        start.setText("Start");
        start.setActionCommand("start");
        start.setVisible(true);

        menu.add(bottomCenter, BorderLayout.NORTH);
        bottomCenter.add(status, BorderLayout.CENTER);
        status.setBounds(0, 0, 100, 50);
        status.setVisible(true);

        start.addActionListener(this);
        reset.addActionListener(this);

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

        System.out.println("GUI is generated!");

    }

    private void checkWin (int row, int col) {
        //Determine label of button, if corner or middle, check diagonal + row + col,
        //else check row and col for equal label
        //If grid is full and no win is found, game is no win
    }

    public void computerTurn () {
        //find empty square and place an 'o' on turn
    }

    public void gameStart () {
        //Ask for player name
        //buttons can now be clicked
        //ask player for first turn
        JFrame askPlayer = new JFrame();
        JPanel panelMain = new JPanel(new BorderLayout());
        JButton submit = new JButton();
        JLabel text = new JLabel();
        JTextField name = new JTextField();

        askPlayer.setTitle("Name");
        askPlayer.setSize(500, 100);
        askPlayer.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        askPlayer.setLocationRelativeTo(null);
        askPlayer.add(panelMain);

        panelMain.add(text, BorderLayout.NORTH);
        panelMain.add(name, BorderLayout.WEST);
        panelMain.add(submit, BorderLayout.EAST);

        text.setText("");
        text.setSize(100, 50);
        text.setVisible(true);
        name.setText("");
        name.setSize(25, 300);
        name.setVisible(true);
        submit.setText("Submit");
        submit.setSize(25, 25);
        submit.setVisible(true);

        askPlayer.setVisible(true);
    }

    public void reset () {
        //Reset all buttons
        //don't forget player name
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("start".equals(e.getActionCommand())) {
            gameStart();
            System.out.println("Start is pressed!");
        }
        else if ("reset".equals(e.getActionCommand())) {
            System.out.println("Reset is pressed!");
        }
    }

    public static void main (String [] args) {

        TicTacToeBoard TicTacToe = new TicTacToeBoard();
        TicTacToe.initialize();

    }
}
