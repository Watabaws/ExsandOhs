import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;
import java.util.Arrays;
public class UltimateTicTacToe extends JFrame {
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

    //public  void  checkforwinner(String[][]array){
     

    //}
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
       
        UC = new TicTacToe();

        UR = new TicTacToe();

        ML = new TicTacToe();

        MC = new TicTacToe();

        MR = new TicTacToe();

        BL = new TicTacToe();

        BC = new TicTacToe();

        BR = new TicTacToe();


      

	
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
	//public void actionPerformed(ActionEvent e){
      
	    
	//}

    public static void main(String[] args){
        UltimateTicTacToe g = new UltimateTicTacToe();
        g.setVisible(true);
    }

    }
