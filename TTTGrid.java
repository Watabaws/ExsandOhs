import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;
import java.util.Arrays;
public class TTTGrid extends JFrame {
    private boolean XorO = true;
    private boolean gameWon= false;
    //true is x false is o
    private  String[][] valUs= new String[3][3];
    private Container pane1;
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

		}
		if(!array[0][i].equals("")&& array[0][i].equals(array[1][i]) && array[0][i].equals(array[2][i])){
		    System.out.println(array[0][i]+ " won the game!");
		     gameWon=true;
		}}
		if(!array[0][0].equals("")&& array[0][0].equals(array[1][1]) && array[0][0].equals(array[2][2])){
		    System.out.println(array[0][0]+ " won the game!");
		    gameWon=true;}
		if(!array[0][2].equals("")&& array[0][2].equals(array[1][1]) && array[0][2].equals(array[2][0])){
		     System.out.println(array[0][2]+ " won the game!");
		     gameWon=true;
		}}
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
	}}}

    public TTTGrid(){
        this.setTitle("Tic Tac Toe");
        this.setSize(1000,1000);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        pane1 = this.getContentPane();
        pane1.setLayout(new GridLayout(3,3));
	for(int i=0; i<valUs.length;i++){
	    for(int x=0; x<valUs[i].length;x++){
		valUs[i][x]="";}}


        JButton UL = new JButton("-");
        UL.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event){
		placeletter(0,0,UL);}
	    });

        JButton UC = new JButton("-");
        UC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
		placeletter(0,1,UC);}

        });

        JButton UR = new JButton("-");
        UR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
		placeletter(0,2,UR);}
        });

        JButton ML = new JButton("-");
        ML.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
		placeletter(1,0,ML);}
        });

        JButton MC = new JButton("-");
        MC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
		placeletter(1,1,MC);}

        });
        JButton MR = new JButton("-");
        MR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
		placeletter(1,2,MR);}
        });

        JButton BL = new JButton("-");
        BL.addActionListener(new ActionListener() {
	     public void actionPerformed(ActionEvent event){
		 placeletter(2,0,BL);}
        });
        JButton BC = new JButton("-");
        BC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
		placeletter(2,1,BC);}
        });

        JButton BR = new JButton("-");
        BR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
	        placeletter(2,2,BR);}
        });


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

    public static void main(String[] args){
        TTTGrid g = new TTTGrid();
        g.setVisible(true);
    }
}
