import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;
import java.util.Arrays;
public class UltimateTicTacToe extends JFrame implements ActionListener {
    private boolean XorO = true;
    private boolean gameWon= false;
    //true is x false is o
    private  String[][] valUs= new String[3][3];
    private Container pane1;

    private JButton ULUL;
    private JButton ULUC;
    private JButton ULUR;
    private JButton ULML;
    private JButton ULMC;
    private JButton ULMR;
    private JButton ULBL;
    private JButton ULBC;
    private JButton ULBR;
    
    private JButton UCUL;
    private JButton UCUC;
    private JButton UCUR;
    private JButton UCML;
    private JButton UCMC;
    private JButton UCMR;
    private JButton UCBL;
    private JButton UCBC;
    private JButton UCBR;
    
    private JButton URUL;
    private JButton URUC;
    private JButton URUR;
    private JButton URML;
    private JButton URMC;
    private JButton URMR;
    private JButton URBL;
    private JButton URBC;
    private JButton URBR;
    
    private JButton MLUL;
    private JButton MLUC;
    private JButton MLUR;
    private JButton MLML;
    private JButton MLMC;
    private JButton MLMR;
    private JButton MLBL;
    private JButton MLBC;
    private JButton MLBR;
    
    private JButton MCUL;
    private JButton MCUC;
    private JButton MCUR;
    private JButton MCML;
    private JButton MCMC;
    private JButton MCMR;
    private JButton MCBL;
    private JButton MCBC;
    private JButton MCBR;

    
  
    private JButton BLUL;
    private JButton BLUC;
    private JButton BLUR;
    private JButton BLML;
    private JButton BLMC;
    private JButton BLMR;
    private JButton BLBL;
    private JButton BLBC;
    private JButton BLBR;

    

    private JButton BRUL;
    private JButton BRUC;
    private JButton BRUR;
    private JButton BRML;
    private JButton BRMC;
    private JButton BRMR;
    private JButton BRBL;
    private JButton BRBC;
    private JButton BRBR;
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


	ULUL = new JButton("-");
        ULUL.addActionListener(this);

        ULUC = new JButton("-");
        ULUC.addActionListener(this);

        ULUR = new JButton("-");
        ULUR.addActionListener(this);

        ULML = new JButton("-");
	ULML.addActionListener(this);

        ULMC = new JButton("-");
        ULMC.addActionListener(this);

	ULMR = new JButton("-");
        ULMR.addActionListener(this);

        ULBL = new JButton("-");
        ULBL.addActionListener(this);

	ULBC = new JButton("-");
        ULBC.addActionListener(this);

        ULBR = new JButton("-");
        ULBR.addActionListener(this);

	UCUL = new JButton("-");
        UCUL.addActionListener(this);

        UCUC = new JButton("-");
        UCUC.addActionListener(this);

        UCUR = new JButton("-");
        UCUR.addActionListener(this);

        UCML = new JButton("-");
        UCML.addActionListener(this);

        UCMC = new JButton("-");
        UCMC.addActionListener(this);

        UCMR = new JButton("-");
        UCMR.addActionListener(this);

        UCBL = new JButton("-");
	UCBL.addActionListener(this);

        UCBC = new JButton("-");
        UCBC.addActionListener(this);

        UCBR = new JButton("-");
        UCBR.addActionListener(this);

	
        pane1.add(ULUL);
        pane1.add(ULUC);
        pane1.add(ULUR);
        pane1.add(ULML);
        pane1.add(ULMC);
        pane1.add(ULMR);
        pane1.add(ULBL);
        pane1.add(ULBC);
        pane1.add(ULBR);

	pane1.add(UCUL);
        pane1.add(UCUC);
        pane1.add(UCUR);
        pane1.add(UCML);
        pane1.add(UCMC);
        pane1.add(UCMR);
        pane1.add(UCBL);
        pane1.add(UCBC);
        pane1.add(UCBR);
	}
public void actionPerformed(ActionEvent e){
	    if(e.getSource() == ULUL){
		placeletter(0,0,ULUL);}
	    if(e.getSource() == ULUC){
		placeletter(0,1,ULUC);}
	    if(e.getSource()  == ULUR){
		placeletter(0,2,ULUR);}
	    if(e.getSource() == ULML){
		placeletter(1,0,ULML);}
	    if(e.getSource() == ULMC){
		placeletter(1,1,ULMC);}
	    if(e.getSource() == ULMR){
		placeletter(1,2,ULMR);}
	    if(e.getSource() == ULBL){
		placeletter(2,0,ULBR);}
	    if(e.getSource() == ULBC){
		placeletter(2,1,ULBC);}
	    if(e.getSource() == ULBR){
		placeletter(2,2,ULBR);}
	     if(e.getSource() == ULUL){
		placeletter(3,0,UCUL);}
	    if(e.getSource() == UCUC){
		placeletter(3,1,UCUC);}
	    if(e.getSource()  == UCUR){
		placeletter(3,2,UCUR);}
	    if(e.getSource() == UCML){
		placeletter(4,0,UCML);}
	    if(e.getSource() == UCMC){
		placeletter(4,1,UCMC);}
	    if(e.getSource() == UCMR){
		placeletter(4,2,UCMR);}
	    if(e.getSource() == UCBL){
		placeletter(5,0,UCBR);}
	    if(e.getSource() == UCBC){
		placeletter(5,1,UCBC);}
	    if(e.getSource() == UCBR){
		placeletter(5,2,UCBR);}
	    
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
        UltimateTicTacToe g = new UltimateTicTacToe();
        g.setVisible(true);
    }


	    }
