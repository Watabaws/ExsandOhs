import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;
import java.util.Arrays; 
public class GridTest extends JFrame {
    private boolean XorO = true;
    //true is x false is o
    private  String[][] valUs= new String[3][3];
    private JPanel  pane1,overall;
    public GridTest(){
        this.setTitle("Tic Tac Toe");
        this.setSize(1000,1000);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

       
        pane1 = new JPanel(new GridLayout(3,3));
	overall = new JPanel(new CardLayout());

        final JButton UL = new JButton("-");
        UL.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event){
		if (UL.getText().equals("-")){
		    if(XorO){
			UL.setText("X");
			valUs[0][0] = "X";
		    }
		    else{
			UL.setText("O");
			valUs[0][0] = "O";
		    }
		    XorO = !XorO;
		}}
        });

        final JButton UC = new JButton("-");
        UC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
		if (UC.getText().equals("-")){
		    if(XorO){
			UC.setText("X");
			valUs[0][0] = "X";
		    }
		    else{
			UC.setText("O");
			valUs[0][0] = "O";
		    }
		    XorO = !XorO;
		}}
        });

        final JButton UR = new JButton("-");
        UR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
		if (UR.getText().equals("-")){
		    if(XorO){
			UR.setText("X");
			valUs[0][0] = "X";
		    }
		    else{
			UR.setText("O");
			valUs[0][0] = "O";
		    }
		    XorO = !XorO;
		}}
        });

        final JButton ML = new JButton("-");
        ML.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
		if (ML.getText().equals("-")){
		    if(XorO){
			ML.setText("X");
			valUs[0][0] = "X";
		    }
		    else{
			ML.setText("O");
			valUs[0][0] = "O";
		    }
		    XorO = !XorO;
		}}
        });

        final JButton MC = new JButton("-");
        MC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
		if (MC.getText().equals("-")){
		    if(XorO){
			MC.setText("X");
			valUs[0][0] = "X";
		    }
		    else{
			MC.setText("O");
			valUs[0][0] = "O";
		    }
		    XorO = !XorO;
		}}
        });

        final JButton MR = new JButton("-");
        MR.addActionListener(new ActionListener() {	
            public void actionPerformed(ActionEvent event){
		if (MR.getText().equals("-")){
		    if(XorO){
			MR.setText("X");
			valUs[0][0] = "X";
		    }
		    else{
			MR.setText("O");
			valUs[0][0] = "O";
		    }
		    XorO = !XorO;
		}}
        });

        final JButton BL = new JButton("-");
        BL.addActionListener(new ActionListener() {
	     public void actionPerformed(ActionEvent event){
		if (BL.getText().equals("-")){
		    if(XorO){
			BL.setText("X");
			valUs[0][0] = "X";
		    }
		    else{
		       BL.setText("O");
			valUs[0][0] = "O";
		    }
		    XorO = !XorO;
		}}
        });
        final JButton BC = new JButton("-");
        BC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
		if (BC.getText().equals("-")){
		    if(XorO){
			BC.setText("X");
			valUs[0][0] = "X";
		    }
		    else{
		        BC.setText("O");
			valUs[0][0] = "O";
		    }
		    XorO = !XorO;
		}}
        });

        final JButton BR = new JButton("-");
        BR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
		if (BR.getText().equals("-")){
		    if(XorO){
			BR.setText("X");
			valUs[0][0] = "X";
		    }
		    else{
			BR.setText("O");
			valUs[0][0] = "O";
		    }
		    XorO = !XorO;
		}}
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

	overall.add(pane1, "Regular Tic Tac Toe");
	    }

    public static void main(String[] args){
        GridTest g = new GridTest();
        g.setVisible(true);
    }


}
