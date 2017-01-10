import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class MNK extends JFrame implements ActionListener{
    private JButton[][] tiles;
    private String[][] valUs;
    private boolean gameWon = false;
    private boolean XorO = true;
    private Container pane1;
    int rows, columns, inARow;

    public MNK(int m,int n,int k){
        this.setTitle("MNK Tic Tac Toe");
        this.setSize(1000,1000);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);


        rows = m;
        columns = n;
        inARow = k;
        valUs = new String[m][n];
        tiles = new JButton[m][n];
        for(int j = 0; j < m; j++){
            for(int i = 0; i < n; i++){
                tiles[j][i] = new JButton("-");
            }
        }

        pane1 = this.getContentPane();
        pane1.setLayout(new GridLayout(rows, columns));

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                tiles[i][j].addActionListener(this);
                pane1.add(tiles[i][j]);
            }
        }
    }

    public void checkWinHorizontal(String[][] valUs, int row, int col){
        String tis = valUs[row][col];
        int ctr = 1;
        int bakcheck = col-1;
        while(bakcheck >= 0 && valUs[row][bakcheck-1].equals(tis)){
            ctr += 1;
            bakcheck--;
        }
        int frntcheck = col+1;
        while(frntcheck<row && valUs[row][frntcheck+1].equals(tis)){
            ctr += 1;
            frntcheck++;
        }
        if(ctr == inARow){
            gameWon = true;
            setVisible(false);
        }
    }

    public void checkWinVertical(String[][] valUs,int row,int  col){
        String tis = valUs[row][col];
        int ctr = 1;
        int bakcheck = row-1;
        while(bakcheck >= 0 && valUs[bakcheck-1][col].equals(tis)){
            ctr += 1;
            bakcheck--;
        }
        int frntcheck = col+1;
        while(frntcheck<row && valUs[frntcheck+1][col].equals(tis)){
            ctr += 1;
            frntcheck++;
        }
        if(ctr == inARow){
            gameWon = true;
            setVisible(false);
        }
    }

    public void checkWinDiagonalPos(String[][] valUs, int row, int col){
	String tis = valUs[row][col];
	int ctr = 1;
	int bakcheckR = row-1;
	int bakcheckC = col-1;

	while(bakcheckR >= 0 && bakcheckC >= 0 && valUs[bakcheckR-1][bakcheckC-1].equals(tis)){
	    ctr += 1;
	    bakcheckR--;
	    bakcheckC--;
	}

	int frntcheckR = row + 1;
	int frntcheckC = col + 1;
	while(frntcheckR < col && bakcheckC < row && valUs[frntcheckR+1][frntcheckC+1].equals(tis)){
	    ctr += 1;
	    frntcheckR++;
	    frntcheckC++;
	}

        if(ctr == inARow){
            gameWon = true;
            setVisible(false);
        }
    }

    public void checkWinDiagonalNeg(String[][] valUs, int row, int col){
    	String tis = valUs[row][col];
    	int ctr = 1;
    	int bakcheckR = row-1;
    	int bakcheckC = col+1;

    	while(bakcheckR >= 0 && bakcheckC < row  && valUs[bakcheckR-1][bakcheckC+1].equals(tis)){
    	    ctr += 1;
    	    bakcheckR--;
    	    bakcheckC++;
    	}

    	int frntcheckR = row + 1;
    	int frntcheckC = col - 1;
    	while(frntcheckR < col && bakcheckC >= 0 && valUs[frntcheckR+1][frntcheckC-1].equals(tis)){
    	    ctr += 1;
    	    frntcheckR++;
    	    frntcheckC--;
    	}

            if(ctr == inARow){
                gameWon = true;
                setVisible(false);
            }
    }


    public void checkforwinner(String[][] valUs, int row, int col){
	checkWinHorizontal(valUs, row, col);
	checkWinVertical(valUs, row, col);
	checkWinDiagonalPos(valUs, row, col);
	checkWinDiagonalNeg(valUs, row, col);
    }

    public void placeLetter(int row, int col, JButton button){
        if(!gameWon){
            if (button.getText().equals("-")){
                if(XorO){
                    button.setText("X");
                    valUs[row][col] = "X";
                }
                else{
                    button.setText("O");
                    valUs[row][col] = "O";
                }
            XorO = !XorO;
            checkforwinner(valUs, row, col);
            }
        }
    }

    public void actionPerformed(ActionEvent e){
        int roo = 0, col = 0    ;
        Object acshunRaw = e.getSource();
        JButton acshun = (JButton)acshunRaw;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(tiles[i][j].equals(acshun)){
                    roo = i;
                    col = j;
                }
            }
        }
        placeLetter(roo, col, acshun);
    }

    public static void main(String[] args){
	MNK game = new MNK(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
	game.setVisible(true);
    }
}
