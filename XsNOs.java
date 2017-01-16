import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class XsNOs extends JFrame implements ActionListener{
    Container c;
    ClassicTicTacToe og;
    MisereTicTacToe rg;
    UltimateTicTacToe ug;
    MNKGUI mg;
    JButton misere = new JButton("Misere");
    JButton classic = new JButton("Classic");
    JButton ultimate = new JButton("Ultimate");
    JButton mnk = new JButton("MNK Tic-Tac-Toe");

    static int m, n, k;

    public XsNOs(){
        c = this.getContentPane();
        c.setLayout(new FlowLayout());
        this.setSize(500,350);
        this.setTitle("Choose your Tic-Tac-Toe");

        classic.addActionListener(this);
        misere.addActionListener(this);
        ultimate.addActionListener(this);
        mnk.addActionListener(this);

        c.add(classic);
        c.add(misere);
        c.add(ultimate);
        c.add(mnk);

        c.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == classic){
            og = new ClassicTicTacToe();
            og.setVisible(true);
        }
        if(e.getSource() == misere){
            rg = new MisereTicTacToe();
            rg.setVisible(true);
        }
        if(e.getSource() == ultimate){
            ug = new UltimateTicTacToe();
            ug.setVisible(true);
        }
        if(e.getSource() == mnk){
            mg = new MNKGUI();
            mg.setVisible(true);
        }
    }

    public static void main(String[] args){
        /*if(args.length == 3){
            m = Integer.parseInt(args[0]);
            n = Integer.parseInt(args[1]);
            k = Integer.parseInt(args[2]);
        }
        else{
            System.out.println("You did not input any values for m, n, or k. be advised that MNK tic tac toe will not work.");
        }*/
        XsNOs game = new XsNOs();
        game.setVisible(true);
    }
}
