import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;
import java.util.Arrays;
import javax.imageio.ImageIO;

public class MisereTicTacToe  extends JFrame implements ActionListener {
    private boolean XorO = true;
    private boolean gameWon;
    //true is x false is o
    private  String[][] valUs= new String[3][3];
    private Container pane1;
    private String winner = "";
    private JButton UL, UC, UR, ML, MC, MR, BL, BC, BR, gameEnd;

    public MisereTicTacToe(){
        gameWon = false;

        this.setTitle("Tic Tac Toe");
        this.setSize(1000,1000);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        pane1 = this.getContentPane();
        pane1.setLayout(new GridLayout(4,3));
        for(int i=0; i<valUs.length;i++){
            for(int x=0; x<valUs[i].length;x++){
                valUs[i][x]="";
            }
        }
	gameEnd=new JButton("End Game");
	gameEnd.addActionListener(this);
	    
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
	pane1.add(gameEnd);
    }

        

        public String getWinner(){
            return winner;
        }

        public void setGW(boolean gw){
            gameWon = gw;
        }
    public void endGame(MisereTicTacToe x){
	x.setVisible(false);}

    public  void  checkforwinner(String[][]array){
	    for(int i=0; i<array.length;i++){
            if(!array[i][0].equals("")&& array[i][0].equals(array[i][1]) && array[i][0].equals(array[i][2])){
                if(array[i][0].equals("O")){
                    System.out.println("X  won the game!");
                    gameWon=true;
                    winner = "X";
                }
                else{
                    System.out.println("O  won the game!");
                    gameWon=true;
                    winner = "O";
                }
            }
            if(!array[0][i].equals("")&& array[0][i].equals(array[1][i]) && array[0][i].equals(array[2][i])){
                if(array[0][i].equals("O")){
                    System.out.println("X  won the game!");
                    gameWon=true;
                    winner = "X";
                }
                else{
    			    System.out.println("O  won the game!");
    			    gameWon=true;
                    winner = "O";
                }
            }
        }

        if(!array[0][0].equals("")&& array[0][0].equals(array[1][1]) && array[0][0].equals(array[2][2])){
            if(array[0][0].equals("O")){
                System.out.println("X  won the game!");
                gameWon=true;
                winner = "X";
            }
		    else{
                System.out.println("O  won the game!");
                gameWon=true;
                winner = "O";
            }
        }

		if(!array[0][2].equals("")&& array[0][2].equals(array[1][1]) && array[0][2].equals(array[2][0])){
		    if(array[0][2].equals("O")){
                System.out.println("X  won the game!");
                gameWon=true;
                winner = "X";
            }
		    else{
                System.out.println("O  won the game!");
                gameWon=true;
                winner = "O";
            }
		}
    }


    public void actionPerformed(ActionEvent e){
	if(e.getSource()==gameEnd){
	    endGame(this);}
	    
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
            placeletter(2,0,BL);
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
		    try {
			Image img = ImageIO.read(getClass().getResource("x.jpg"));
			Image newimg = img.getScaledInstance(300, 300,  java.awt.Image.SCALE_SMOOTH ) ;
			Icon icon = new ImageIcon( newimg );
			button.setIcon(icon);

		    } catch (Exception ex) {
			System.out.println(ex);
		    }
                }
                else{
                    button.setText("O");
                    valUs[row][col] = "O";try {
			Image img = ImageIO.read(getClass().getResource("o.jpg"));
			Image newimg = img.getScaledInstance(300, 300,  java.awt.Image.SCALE_SMOOTH ) ;
			Icon icon = new ImageIcon( newimg );
			button.setIcon(icon);

		    } catch (Exception ex) {
			System.out.println(ex);
		    }
                }
                XorO = !XorO;
                checkforwinner(valUs);
            }
        }
    }



    public static void main(String[] args){
        MisereTicTacToe g = new MisereTicTacToe();
    }
}
