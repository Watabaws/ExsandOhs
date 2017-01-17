import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MNKGUI extends JFrame implements ActionListener{
    Container pane;
    JTextField m, n, k;
    JLabel error;
    JButton submit;
    MNK game;
    boolean gameMade = false;

    public MNKGUI(){
        pane = this.getContentPane();
        pane.setLayout(new GridLayout(1,5));
        this.setSize(2500,150);
        this.setTitle("Enter the values for MNK");

        m = new JTextField("rows");
        n = new JTextField("columns");
        k = new JTextField("how many in a row");
        error = new JLabel();
        error.setHorizontalAlignment(SwingConstants.LEFT);

        pane.add(m);
        pane.add(n);
        pane.add(k);

        submit = new JButton("Create Game");
        submit.addActionListener(this);

        pane.add(submit);
        pane.add(error);
    }

    public void actionPerformed(ActionEvent e){
        int em, en, kay;
        try{
            em = Integer.parseInt(m.getText());
            en = Integer.parseInt(n.getText());
            kay = Integer.parseInt(k.getText());
            if(kay < em && kay < en){
                game = new MNK(em, en, kay);
                gameMade = true;
            }
            else{
                error.setText("Please enter valid m, n and k values. K cannot exceed m or n. Try again!");
                error.setHorizontalAlignment(SwingConstants.LEFT);
                pane.remove(error);
                pane.add(error);
                pane.revalidate();
                pane.repaint();
            }
        }
        catch(NumberFormatException f){
            error.setText("Please only enter numbers (no spaces).");
            error.setHorizontalAlignment(SwingConstants.LEFT);
            pane.remove(error);
            pane.add(error);
            pane.revalidate();
            pane.repaint();
        }
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
