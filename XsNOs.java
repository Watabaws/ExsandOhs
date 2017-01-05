import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class XsNOs extends JFrame implements ActionListener{
    Container c;
    ClassicTicTacToe og = new ClassicTicTacToe();
    MisereTicTacToe rg = new MisereTicTacToe();
    JButton misere = new JButton("Misere");
    JButton classic = new JButton("Classic");

    public XsNOs(){
        c = this.getContentPane();
        c.setLayout(new FlowLayout());
        this.setSize(500,300);
        this.setTitle("Choose your Tic-Tac-Toe");


        classic.addActionListener(this);

        misere.addActionListener(this);

        c.add(classic);
        c.add(misere);

        c.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == classic){
            og.setVisible(true);
        }
        if(e.getSource() == misere){
            rg.setVisible(true);
        }
    }

    public static void main(String[] args){
        XsNOs game = new XsNOs();
        game.setVisible(true);
    }
}
