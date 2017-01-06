import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;
import java.util.Arrays;
public class ClassicTicTacToe extends JFrame implements ActionListener {
    private boolean XorO = true;
    private boolean gameWon= false;
    //true is x false is o
    private  String[][] valUs= new String[3][3];
    private Container pane1;
    private JButton UL, UC, UR, ML, MC, MR, BL, BC, BR;

    public ClassicTicTacToe(){
        gameWon = false;

        this.setTitle("Tic Tac Toe");
        this.setSize(1000,1000);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        pane1 = this.getContentPane();
        pane1.setLayout(new GridLayout(3,3));
        for(int i=0; i<valUs.length;i++){
            for(int x=0; x<valUs[i].length;x++){
                valUs[i][x]="";
            }
        }

        UL = new JButton("-");
        UL.addActionListener(this);

        UC = new JButton("-");
        UC.addActionListener(this);

        UR = new JButton("-");
        UR.addActionListener(this);

        ML = new JButton("-");
        ML.addActionListener(this);

        MC = new JButton("-");
        MC.addActionListener(this);

        MR = new JButton("-");
        MR.addActionListener(this);

        BL = new JButton("-");
        BL.addActionListener(this);

        BC = new JButton("-");
        BC.addActionListener(this);

        BR = new JButton("-");
        BR.addActionListener(this);

        pane1.add(UL);
        pane1.add(UC);
        pane1.add(UR);
        pane1.add(ML);
        pane1.add(MC);
        pane1.add(MR);
        pane1.add(BL);
        pane1.add(BC);
        pane1.add(BR);
    }

    public  void  checkforwinner(String[][]array){
	    for(int i=0; i<array.length;i++){
    		if(!array[i][0].equals("")&& array[i][0].equals(array[i][1]) && array[i][0].equals(array[i][2])){
                System.out.println(array[i][0]+ " won the game!");
                gameWon=true;
                setVisible(false);
    		}

    		if(!array[0][i].equals("")&& array[0][i].equals(array[1][i]) && array[0][i].equals(array[2][i])){
    		    System.out.println(array[0][i]+ " won the game!");
    		     gameWon=true;
                 setVisible(false);
    		}
        }

    	if(!array[0][0].equals("")&& array[0][0].equals(array[1][1]) && array[0][0].equals(array[2][2])){
            System.out.println(array[0][0]+ " won the game!");
            gameWon=true;
            setVisible(false);
        }

        if(!array[0][2].equals("")&& array[0][2].equals(array[1][1]) && array[0][2].equals(array[2][0])){
            System.out.println(array[0][2]+ " won the game!");
            gameWon=true;
            setVisible(false);
        }
    }

    public void actionPerformed(ActionEvent e){
	    if(e.getSource() == UL){
            placeletter(0,0,UL);
        }

	    if(e.getSource() == UC){
            placeletter(0,1,UC);
        }

	    if(e.getSource()  == UR){
            placeletter(0,2,UR);
        }

	    if(e.getSource() == ML){
            placeletter(1,0,ML);
        }

	    if(e.getSource() == MC){
            placeletter(1,1,MC);
        }

	    if(e.getSource() == MR){
            placeletter(1,2,MR);
        }

	    if(e.getSource() == BL){
            placeletter(2,0,BR);
        }

	    if(e.getSource() == BC){
            placeletter(2,1,BC);
        }

	    if(e.getSource() == BR){
            placeletter(2,2,BR);
        }
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
		    checkforwinner(valUs);
            }
        }
    }

    public static void main(String[] args){
        ClassicTicTacToe g = new ClassicTicTacToe();
        g.setVisible(true);
    }
}
