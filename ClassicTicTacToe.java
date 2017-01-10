import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.imageio.ImageIO;

public class ClassicTicTacToe extends JFrame implements ActionListener {
    private boolean XorO = true;
    private boolean gameWon= false;
    private String winner="";
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
                gameWon=true;
		winner=array[i][0];
                setVisible(false);
    		}

    		if(!array[0][i].equals("")&& array[0][i].equals(array[1][i]) && array[0][i].equals(array[2][i])){
    		     gameWon=true;
		     winner=array[0][i];
                 setVisible(false);
    		}
        }

    	if(!array[0][0].equals("")&& array[0][0].equals(array[1][1]) && array[0][0].equals(array[2][2])){
            gameWon=true;
	    winner=array[0][0];
            setVisible(false);
        }

        if(!array[0][2].equals("")&& array[0][2].equals(array[1][1]) && array[0][2].equals(array[2][0])){
	    winner=array[0][2];
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
                    valUs[row][col] = "O";
		    try {
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
	    if(gameWon){
	    System.out.println(winner+ " won the game!");}

            }
        }
    }

    public static void main(String[] args){
        ClassicTicTacToe g = new ClassicTicTacToe();
        g.setVisible(true);

    }
}
