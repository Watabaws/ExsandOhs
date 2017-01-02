import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;

public class GridTest extends JFrame {
    private boolean XorO=true;
    //true is x false is o
   final  private  String[][] ary= new String[3][3];
    private Container pane1;
    public GridTest(){
        this.setTitle("Tic Tac Toe");
        this.setSize(1000,1000);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        pane1 = this.getContentPane();
        pane1.setLayout(new GridLayout(3,3));
	for (int row = 0; row < 3; row++)
    {
        for (int col = 0; col < 3; col++)
        {
	    String ary_i_j = ary[row][col];
            JButton b = new JButton();
            b.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
		    if (b.getText().equals("")){
			    if (XorO){
				b.setText("X");
				ary_i_j="X";
			    }
			    else{
				b.setText("O");
				ary_i_j="O";
			    }
			    XorO=!XorO;
			}}
            });
            pane1.add(b);
        }
    }}

    public static void main(String[] args){
        GridTest g = new GridTest();
        g.setVisible(true);
    }

	
}
