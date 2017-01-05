import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;
import java.util.Arrays;
public class ClassicTicTacToe extends JFrame {
    private boolean XorO = true;
    private boolean gameWon= false;
    //true is x false is o
    private  String[][] valUs= new String[3][3];
    private Container pane1;
    private JButton UL=new JButton("-");
    private JButton UC;
    private JButton UR;
    private JButton ML;
    private JButton MC;
    private JButton MR;
    private JButton BL;
    private JButton BC;
    private JButton BR;
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

        UL.addActionListener(this);
	UL.setActionCommand("UL");
        UC = new JButton("-");
        UC.addActionListener(this);
	UC.setActionCommand("UC");
        UR = new JButton("-");
        UR.addActionListener(this);
	UR.setActionCommand("UR");
        ML = new JButton("-");
        ML.addActionListener(this);
	ML.setActionCommand("ML");
        MC = new JButton("-");
        MC.addActionListener(this);
	MC.setActionCommand("MC");
        MR = new JButton("-");
        MR.addActionListener(this);
	MR.setActionCommand("MR");
        BL = new JButton("-");
        BL.addActionListener(this);
	BL.setActionCommand("BL");
        BC = new JButton("-");
        BC.addActionListener(this);
	BC.setActionCommand("BC");
        BR = new JButton("-");
        BR.addActionListener(this);
	BR.setActionCommand("BR");

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
	    String event=e.getActionCommand;
	    if(event.equals("UL")){
		placeletter(0,0,UL);}
	    if(event.equals("UC")){
		placeletter(0,1,UC);}
	    if(event.equals("UR")){
		placeletter(0,2,UR);}
	    if(event.equals("ML")){
		placeletter(1,0,ML);}
	    if(event.equals("MC")){
		placeletter(1,1,MC);}
	    if(event.equals("MR")){
		placeletter(1,2,MR);}
	    if(event.equals("BL")){
		placeletter(2,0,BR);}
	    if(event.equals("BC")){
		placeletter(2,1,BC);}
	    if(event.equals("BR")){
		placeletter(2,2,BR);}
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
