import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.imageio.ImageIO;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class MNK extends JFrame implements ActionListener{
    private JButton[][] tiles;
    private String[][] valUs;
    private boolean gameWon = false;
    private boolean XorO = true;
    private Container pane1;
    int rows, columns, inARow;
    private String winner;
    private JButton endGame;

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

        for(int j = 0; j < m; j++){
            for(int i = 0; i < n; i++){
                valUs[j][i] = "-";
            }
        }

        pane1 = this.getContentPane();
        pane1.setLayout(new GridLayout(rows+1, columns));

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                tiles[i][j].addActionListener(this);
                pane1.add(tiles[i][j]);
            }
        }
	endGame= new JButton("End Game");
	endGame.addActionListener(this);
	pane1.add(endGame);
    }

    public void actionPerformed(ActionEvent e){
        int row = 0, col = 0;
        Object acshunRaw = e.getSource();
        JButton acshun = (JButton)acshunRaw;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(tiles[i][j].equals(acshun)){
                    row = i;
                    col = j;
                }
            }
	    if(e.getSource()== endGame){
		gameEnd(this);}
        }

        if(!gameWon){
    	    if(acshun.getText().equals("-")){
    		    if(XorO){
    			acshun.setText("X");
    			valUs[row][col] = "X";
			try {
			Image img = ImageIO.read(getClass().getResource("x.jpg"));
		        Dimension size = acshun.getSize();
			Image newimg = img.getScaledInstance(size.width,size.height,  java.awt.Image.SCALE_SMOOTH ) ;
			Icon icon = new ImageIcon( newimg );
			acshun.setIcon(icon);

		    } catch (Exception ex) {
			System.out.println(ex);
			}
    		    }
    		    else{
    			acshun.setText("O");
    			valUs[row][col] = "O";
			try{Image img = ImageIO.read(getClass().getResource("o.jpg"));
		        Dimension size = acshun.getSize();
			Image newimg = img.getScaledInstance(size.width, size.height,  java.awt.Image.SCALE_SMOOTH ) ;
			Icon icon = new ImageIcon( newimg );
			acshun.setIcon(icon);}

		     catch (Exception ex) {
			System.out.println(ex);
		     }}

    		    XorO = !XorO;
    		    checkforwinner(row, col);

	    }
	}
    }
    public void  gameEnd(MNK x){
	x.setVisible(false);}
    
    public void checkforwinner(int row, int col){
    	if(checkforhorizontalwin(row, col) ||
           checkforverticalwin(row,col) ||
           checkfordiagonalnegwin(row,col) ||
           checkfordiagonalposwin(row,col)){
    	    System.out.println("Winner!");
    	    gameWon = true;
    	}
    }

    public boolean getGW(){
        return gameWon;
    }

    public String getWinner(){
        return winner;
    }

    public void setGW(boolean gw){
        gameWon = gw;
    }



    public boolean checkfordiagonalnegwin(int row, int col){
    	String sign = valUs[row][col];
    	int aRow = 0;
    	int check1 = 0;
	int check2=0;

    	while(check1 <= Math.min(valUs.length - 1 - row, valUs[0].length - 1 + col) &&
              valUs[row+check1][col-check1].equals(sign)){
    	    aRow += 1;
    	    check1++;
    	    //System.out.println("1matchu\n");
            //System.out.print(valUs[row+check1][col-check1] + "u\n");

    	}


        while(check2 <= Math.max(0 - row, 0 + col) &&
              valUs[row-check2][col+check2].equals(sign)){
            aRow += 1;
            check2++;
            //System.out.print("1matchd\n");
	    // System.out.print(valUs[row+check2][col+check2] + "d\n");
        }

        if(aRow-1 >= inARow){
            winner = sign;
        }
    	return aRow-1 >= inARow;
    }

    public boolean checkfordiagonalposwin(int row, int col){
    	String sign = valUs[row][col];
    	int aRow = 0;
    	int check1 = 0 ;
	    int check2=0;


    	while(check1 <=  Math.min(valUs.length - 1 - row, valUs[0].length - 1 - col) &&
              valUs[row+check1][col+check1].equals(sign)){
    	    aRow += 1;
    	    check1++;
    	    //System.out.println("1matchu\n");
	    // System.out.print(valUs[row+check1][col+check1] + "u\n");
    	}

        while(check2 <= Math.max(row, col) &&
              valUs[row-check2][col-check2].equals(sign)){
            aRow += 1;
            check2++;
            //System.out.print("1matchd\n");
	    // System.out.print(valUs[row-check2][col-check2] + "d\n");
        }
	//System.out.println(aRow);
	//	System.out.println(check1 + "hi");
	//System.out.println(check2+"hey");
	//System.out.println(valUs.length - 1 - row);
	//System.out.println(valUs[0].length - 1 - col);
	//System.out.println(valUs[row+check1][col+check1]);
	//System.out.println(valUs[row+check1][col+check1].equals(sign));
	//System.out.println( valUs[row-check2][col-check2].equals(sign));


        if(aRow-1 >= inARow){
            winner = sign;
        }

    	return aRow-1>= inARow;
    }

    public boolean checkforhorizontalwin(int row, int col){
    	String sign = valUs[row][col];

    	//Check the values to the left of our current
    	int backCtr = col;
    	int aRow = 1;
    	while(backCtr > 0 && valUs[row][backCtr-1].equals(sign)){
    	    aRow += 1;
    	    backCtr--;
    	}

    	//Check the values to the right of our current
    	int frontCtr = col;
    	while(frontCtr < valUs[row].length - 1 &&  valUs[row][frontCtr + 1].equals(sign)){
    	    aRow += 1;
    	    frontCtr++;
    	}

    	//Check if you got a valid row!

        if(aRow >= inARow){
            winner = sign;
        }

    	return aRow >= inARow;
    }

    public boolean checkforverticalwin(int row, int col){
    	String sign = valUs[row][col];

    	//Check the values to the top of our current
    	int backCtr = row;
    	int aRow = 1;
    	while(backCtr > 0 && valUs[backCtr - 1][col].equals(sign)){
    	    aRow += 1;
    	    backCtr--;
    	}

    	//Check the values to the bottom of our current
    	int frontCtr = row;
    	while(frontCtr < valUs.length - 1 && valUs[frontCtr+1][col].equals(sign)){
    	    aRow += 1;
    	    frontCtr++;
    	}

    	//Check if you got a valid row!

        if(aRow >= inARow){
            winner = sign;
        }
    	return aRow >= inARow;

    }



    public static void main(String[] args){
	MNK game = new MNK(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
	game.setVisible(true);
    }
}
