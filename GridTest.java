import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;

public class GridTest extends JFrame {
    private boolean XorO = true;
    //true is x false is o
    private  String[][] valUs= new String[3][3];
    private Container pane1;
    public GridTest(){
        this.setTitle("Tic Tac Toe");
        this.setSize(1000,1000);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        pane1 = this.getContentPane();
        pane1.setLayout(new GridLayout(3,3));


        JButton UL = new JButton("-");
        UL.addActionListener(this);
        UL.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event){
                if(XorO){
                    UL.setText("X");
                    valUs[0][0] = "X";
                }
                else{
                    UL.setText("O");
                    valUs[0][0] = "O";
                }
                XorO = !XorO;
            }
        }

        JButton UC = new JButton("-");
        UC.addActionListener(this);
        UC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                if(XorO){
                    UC.setText("X");
                    valUs[0][1] = "X";
                }
                else{
                    UC.setText("O");
                    valUs[0][1] = "O";
                }
                XorO = !XorO;
            }
        }

        JButton UR = new JButton("-");
        UR.addActionListener(this);
        UR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                if(XorO){
                    UR.setText("X");
                    valUs[0][2] = "X";
                }
                else{
                    UR.setText("O");
                    valUs[0][2] = "O";
                }
                XorO = !XorO;
            }
        }

        JButton ML = new JButton("-");
        ML.addActionListener(this);
        ML.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                if(XorO){
                    ML.setText("X");
                    valUs[1][0] = "X";
                }
                else{
                    ML.setText("O");
                    valUs[1][0] = "O";
                }
                XorO = !XorO;
            }
        }

        JButton MC = new JButton("-");
        MC.addActionListener(this);
        MC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                if(XorO){
                    MC.setText("X");
                    valUs[1][1] = "X";
                }
                else{
                    MC.setText("O");
                    valUs[1][1] = "O";
                }
                XorO = !XorO;
            }
        }

        JButton MR = new JButton("-");
        MR.addActionListener(this);
        MR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                if(XorO){
                    MR.setText("X");
                    valUs[1][2] = "X";
                }
                else{
                    MR.setText("O");
                    valUs[1][2] = "O";
                }
                XorO = !XorO;
            }
        }

        JButton BL = new JButton("-");
        BL.addActionListener(this);
        BL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                if(XorO){
                    BL.setText("X");
                    valUs[2][0] = "X";
                }
                else{
                    BL.setText("O");
                    valUs[2][0] = "O";
                }
                XorO = !XorO;
            }
        }

        JButton BC = new JButton("-");
        BC.addActionListener(this);
        BC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                if(XorO){
                    BC.setText("X");
                    valUs[2][1] = "X";
                }
                else{
                    BC.setText("O");
                    valUs[2][1] = "O";
                }
                XorO = !XorO;
            }
        }

        JButton BR = new JButton("-");
        BR.addActionListener(this);
        BR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                if(XorO){
                    BR.setText("X");
                    valUs[2][2] = "X";
                }
                else{
                    BR.setText("O");
                    valUs[2][2] = "O";
                }
                XorO = !XorO;
            }
        }


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
        GridTest g = new GridTest();
        g.setVisible(true);
    }


}
