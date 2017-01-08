import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;
import java.util.Arrays;
import javax.imageio.ImageIO;
public class MisereTicTacToe  extends JFrame {
    private boolean XorO = true;
    private boolean gameWon;
    //true is x false is o
    private  String[][] valUs= new String[3][3];
    private Container pane1;

    public MisereTicTacToe(){
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

        final JButton UL = new JButton("-");
        UL.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                placeletter(0,0,UL);}
	    });

        final JButton UC = new JButton("-");
        UC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
		placeletter(0,1,UC);}

        });

        final JButton UR = new JButton("-");
        UR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
		placeletter(0,2,UR);}
        });

        final JButton ML = new JButton("-");
        ML.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
		placeletter(1,0,ML);}
        });

        final JButton MC = new JButton("-");
        MC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
		placeletter(1,1,MC);}

        });
        final JButton MR = new JButton("-");
        MR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
		placeletter(1,2,MR);}
        });

        final JButton BL = new JButton("-");
        BL.addActionListener(new ActionListener() {
	     public void actionPerformed(ActionEvent event){
		 placeletter(2,0,BL);}
        });
        final JButton BC = new JButton("-");
        BC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
		placeletter(2,1,BC);}
        });

        final JButton BR = new JButton("-");
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

    public  void  checkforwinner(String[][]array){
	    for(int i=0; i<array.length;i++){
            if(!array[i][0].equals("")&& array[i][0].equals(array[i][1]) && array[i][0].equals(array[i][2])){
                if(array[i][0].equals("O")){
                    System.out.println("X  won the game!");
                    gameWon=true;
                    setVisible(false);
                }
                else{
                    System.out.println("O  won the game!");
                    gameWon=true;
                    setVisible(false);
                }
            }
            if(!array[0][i].equals("")&& array[0][i].equals(array[1][i]) && array[0][i].equals(array[2][i])){
                if(array[0][i].equals("O")){
                    System.out.println("X  won the game!");
                    gameWon=true;
                    setVisible(false);
                }
                else{
    			    System.out.println("O  won the game!");
    			    gameWon=true;
                    setVisible(false);
                }
            }
        }

        if(!array[0][0].equals("")&& array[0][0].equals(array[1][1]) && array[0][0].equals(array[2][2])){
            if(array[0][0].equals("O")){
                System.out.println("X  won the game!");
                gameWon=true;
                setVisible(false);
            }
		    else{
                System.out.println("O  won the game!");
                gameWon=true;
                setVisible(false);
            }
        }

		if(!array[0][2].equals("")&& array[0][2].equals(array[1][1]) && array[0][2].equals(array[2][0])){
		    if(array[0][2].equals("O")){
                System.out.println("X  won the game!");
                gameWon=true;
                setVisible(false);
            }
		    else{
                System.out.println("O  won the game!");
                gameWon=true;
                setVisible(false);
            }
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
