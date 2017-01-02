import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;

public class GridTest extends JFrame{
    private Container pane1;
    private JPanel pane2;

    public GridTest(){
        this.setTitle("Tic Tac Toe");
        this.setSize(1000,1000);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        pane1 = this.getContentPane();
        pane1.setLayout(new GridLayout(3,3));
        pane2 = new JPanel(new GridLayout(3,3));
        pane1.add(new JButton("1"));
        pane1.add(new JButton("2"));
        pane1.add(new JButton("3"));
        pane1.add(new JButton("4"));
        pane1.add(pane2);
        pane1.add(new JButton("6"));
        pane1.add(new JButton("7"));
        pane1.add(new JButton("8"));
        pane1.add(new JButton("9"));
        pane2.add(new JButton("1"));
        pane2.add(new JButton("2"));
        pane2.add(new JButton("3"));
        pane2.add(new JButton("4"));
        pane2.add(new JButton("5"));
        pane2.add(new JButton("6"));
        pane2.add(new JButton("7"));
        pane2.add(new JButton("8"));
        pane2.add(new JButton("9"));
    }

    public static void main(String[] args){
        GridTest g = new GridTest();
        g.setVisible(true);
    }
}
