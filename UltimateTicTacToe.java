import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;
import java.util.Arrays;
public class UltimateTicTacToe extends JFrame implements ActionListener{
    private boolean gameWon= false;
    private String winner= "";
    //true is x false is o
    private  String[][] valUs= new String[3][3];
    private Container pane1;
    private TicTacToe UL, UC, UR, ML, MC, MR, BL, BC, BR;
   public static String arrayToString(String[][] a) {

    String aString;
    aString = "";
    int column;
    int row;

    for (row = 0; row < a.length; row++) {
        for (column = 0; column < a[0].length; column++ ) {
        aString = aString + " " + a[row][column];
        }
	aString = aString + "\n";}

    return aString;}
    public void createArray(){
	valUs[0][0]=UL.getWinner();
	valUs[0][1]=UC.getWinner();
	valUs[0][2]=UR.getWinner();
	valUs[1][0]=ML.getWinner();
	valUs[1][1]=MC.getWinner();
	valUs[1][2]=MR.getWinner();
	valUs[2][0]=BL.getWinner();
	valUs[2][1]=BC.getWinner();
	valUs[2][2]=BR.getWinner();
    }
    public  void  checkforwinner(String[][]array){
     for(int i=0; i<array.length;i++){
    		if(!array[i][0].equals("")&& array[i][0].equals(array[i][1]) && array[i][0].equals(array[i][2])){
		    gameWon=true;
		    winner=array[i][0];
    		}

    		if(!array[0][i].equals("")&& array[0][i].equals(array[1][i]) && array[0][i].equals(array[2][i])){
    		     gameWon=true;
		     winner=array[0][i];	     
		}
	 }

    	if(!array[0][0].equals("")&& array[0][0].equals(array[1][1]) && array[0][0].equals(array[2][2])){
            gameWon=true;
	    winner=array[0][0];
	    }
	    
        if(!array[0][2].equals("")&& array[0][2].equals(array[1][1]) && array[0][2].equals(array[2][0])){
	    winner=array[0][2];
            gameWon=true;
	}
	
    }

  
    public UltimateTicTacToe(){
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

        UL = new TicTacToe();
        UL.addActionListener(this);

        UC = new TicTacToe();
	UC.addActionListener(this);
	
        UR = new TicTacToe();
	UR.addActionListener(this);
	
        ML = new TicTacToe();
	ML.addActionListener(this);

        MC = new TicTacToe();
	MC.addActionListener(this);

        MR = new TicTacToe();
	MR.addActionListener(this);

        BL = new TicTacToe();
	BL.addActionListener(this);

        BC = new TicTacToe();
	BC.addActionListener(this);

        BR = new TicTacToe();
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
public void actionPerformed(ActionEvent e){
    createArray();
    checkforwinner(valUs);}

    public static void main(String[] args){
        UltimateTicTacToe g = new UltimateTicTacToe();
        g.setVisible(true);
    }

    }
