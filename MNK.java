import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class MNK extends JFrame implements ActionListener{
    private JButton[] tiles;
    private String[][] valUs;
    private boolean gameWon = false;
    private Container pane1;
    int rows, columns, inARow;



    public MNK(m,n,k){
        rows = m;
        columns = n;
        inARow = k;
        valUs = new String[m][n];
        tiles = new JButton[m];
        for(int j = 0; j < m; j++){
            for(int i = 0; i < n; i++){
                tiles[m][n] = new Jbutton("-");
            }
        }

        pane1 = this.getContentPane();
        pane1.setLayout(new GridLayout(rows, columns));

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                tiles[m][n].addActionListener(this);
            }
        }
    }

    public void checkWinHorizontal(valUs, row, col){
        String tis = valUs[row][col];
        int ctr = 1;
        int bakcheck = col-1;
        while(backcheck >= 0 && valUs[row][bakcheck-1].equals(tis)){
            ctr += 1;
            bakcheck--;
        }
        int frntcheck = col+1;
        while(frntcheck<row && valUs[row][frntcheck+1].equals(tis)){
            ctr += 1;
            frntcheck++;
        }
        if(ctr == k){
            gameWon = true;
            setVisible(false);
        }
    }

    public void checkWinVertical(valUs, row, col){
        String tis = valUs[row][col];
        int ctr = 1;
        int bakcheck = row-1;
        while(backcheck >= 0 && valUs[bakcheck-1][col].equals(tis)){
            ctr += 1;
            bakcheck--;
        }
        int frntcheck = col+1;
        while(frntcheck<row && valUs[frntcheck+1][col].equals(tis)){
            ctr += 1;
            frntcheck++;
        }
        if(ctr == k){
            gameWon = true;
            setVisible(false);
        }
    }

    public void checkWinAll(valUs, row, col){

    }

    public void placeletter(int row, int col, JButton button){
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
        int roo, col;
        JButton acshun = e.getSource();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(Arrays.asList(tiles).contains(acshun)){
                    roo = i;
                    col = j;
                }
            }
        }
        placeLetter(roo, col, e.getSource());
    }
}
