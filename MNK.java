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

	for(int j = 0; j < m; j++){
            for(int i = 0; i < n; i++){
                valUs[j][i] = "-";
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
        }
        if(!gameWon){
	    if(acshun.getText().equals("-")){
		    if(XorO){
			acshun.setText("X");
			valUs[row][col] = "X";
		    }
		    else{
			acshun.setText("O");
			valUs[row][col] = "O";
		    }
		    XorO = !XorO;
		    checkforwinner(row, col);
		}
	   }
    }


    public void checkforwinner(int row, int col){
	if(checkforhorizontalwin(row, col) || checkforverticalwin(row,col) || checkfordiagonalposwin(row,col) ){
	    System.out.println("Winner!");
	    gameWon = true;
	    setVisible(false);
	}
    }

    public boolean checkfordiagonalposwin(int row, int col){
	String sign = valUs[row][col];
	int aRow = 0;
	int check = 0;

	while(check < Math.min(valUs.length - 1, valUs[0].length - 1) && valUs[row+check][col+check].equals(sign)){
	    aRow += 1;
	    check++;
	    System.out.println("1match\n");
	} 

	return aRow >= inARow;   
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

	return aRow >= inARow;
    }

    public boolean checkforverticalwin(int row, int col){
	String sign = valUs[row][col];
	
	//Check the values to the left of our current
	int backCtr = row;
	int aRow = 1;
	while(backCtr > 0 && valUs[backCtr - 1][col].equals(sign)){
	    aRow += 1;
	    backCtr--;
	} 

	//Check the values to the right of our current
	int frontCtr = row;
	while(frontCtr < valUs.length - 1 && valUs[frontCtr + 1][col].equals(sign)){
	    aRow += 1;
	    frontCtr++;
	}

	//Check if you got a valid row!
	return aRow >= inARow;
	
    }



    public static void main(String[] args){
	MNK game = new MNK(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
	game.setVisible(true);
    }
}
