import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class XsNOs extends JFrame implements ActionListener{
    Container c;
    ClassicTicTacToe og = new ClassicTicTacToe();
    MisereTicTacToe rg = new MisereTicTacToe();
    UltimateTicTacToe ug = new UltimateTicTacToe();
    MNK mg = new MNK(3,3,3);
    MNKGUI mgi = new MNKGUI();
    JButton misere = new JButton("Misere");
    JButton classic = new JButton("Classic");
    JButton ultimate = new JButton("Ultimate");
    JButton mnk = new JButton("MNK Tic-Tac-Toe");
    int xScore = 0, oScore = 0;
    JLabel Ex, Oh;
    Thread thread;

    public XsNOs(){
        c = this.getContentPane();
        c.setLayout(new GridLayout(2,2));
        this.setSize(700,350);
        this.setTitle("Choose your Tic-Tac-Toe");

        classic.addActionListener(this);
        misere.addActionListener(this);
        ultimate.addActionListener(this);
        mnk.addActionListener(this);

        c.add(classic);
        c.add(misere);
        c.add(ultimate);
        c.add(mnk);

        Ex = new JLabel("" + xScore);
        Oh = new JLabel("" + oScore);
        JLabel Xlab = new JLabel("X Score: ");
        JLabel Olab = new JLabel("O Score: ");

        c.add(Xlab);
        c.add(Ex);
        c.add(Olab);
        c.add(Oh);
        c.setVisible(true);
    }

    public void updateScores(){
        while(true){
            if(og.getGW()){
                if(og.getWinner().equals("X")){
                    xScore++;
                }
                else{
                    oScore++;
                }
                og.setGW(false);
                og.setVisible(false);
            }

            if(rg.getGW()){
                if(rg.getWinner().equals("X")){
                    xScore++;
                }
                else{
                    oScore++;
                }
                rg.setGW(false);
                rg.setVisible(false);
            }
            if(ug.getGW()){
                if(ug.getWinner().equals("X")){
                    xScore++;
                }
                else{
                    oScore++;
                }
                ug.setGW(false);
                ug.setVisible(false);
                thread.stop();
            }
            if(mg.getGW()){
                if(mg.getWinner().equals("X")){
                    xScore++;
                }
                else{
                    oScore++;
                }
                mg.setGW(false);
                mg.setVisible(false);
            }
            Ex.setText("" + xScore);
            Oh.setText("" + oScore);
            if(mgi.gameMade){
                mg = mgi.getGame();
                mg.setVisible(true);
                mgi.setGM(false);
                mgi.setVisible(false);
            }
        }
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
            thread = new Thread(new Runnable() {
                public void run() {
                    ug.checkSigns();
                }
            });
            thread.start();
        }
        if(e.getSource() == mnk){
            mgi = new MNKGUI();
            mgi.setVisible(true);
            //while(mgi.getGM() == false){}
            //mg = mgi.getGame();
            //mg.setVisible(true);

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
        game.updateScores();
    }
}
