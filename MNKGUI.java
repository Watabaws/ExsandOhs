import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MNKGUI extends JFrame implements ActionListener{
    Container pane;
    JTextField m, n, k;
    JButton submit;
    MNK game;
    boolean gameMade = false;

    public MNKGUI(){
        pane = this.getContentPane();
        pane.setLayout(new GridLayout(1,4));
        this.setSize(300,100);
        this.setTitle("Enter the values for MNK");

        m = new JTextField();
        n = new JTextField();
        k = new JTextField();

        pane.add(m);
        pane.add(n);
        pane.add(k);

        submit = new JButton("Create Game");
        submit.addActionListener(this);

        pane.add(submit);
    }

    public void actionPerformed(ActionEvent e){
        int em, en, kay;
        em = Integer.parseInt(m.getText());
        en = Integer.parseInt(n.getText());
        kay = Integer.parseInt(k.getText());
        game = new MNK(em, en, kay);
        gameMade = true;
    }

    public MNK getGame(){
        return game;
    }

    public boolean getGM(){
        return gameMade;
    }

    public void setGM(boolean nv){
        gameMade = nv;
    }
}
