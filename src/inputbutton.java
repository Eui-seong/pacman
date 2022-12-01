import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.PrintWriter;

public class inputbutton extends JButton implements ActionListener {
    private int score;
    private String name;
    private JFrame frame;
    private JTextField text;
    public inputbutton(String s,int sc, JFrame f,JTextField t){
        super(s);
        score=sc;
        frame=f;
        text=t;
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        name= text.getText();
        try {
            FileWriter writer = new FileWriter("rank.csv", true);
            PrintWriter outfile = new PrintWriter(writer);
            outfile.println(score + "," + name);
            outfile.close();
        }
        catch (Exception e1) {
            System.out.println("Error!");
        }
        frame.dispose();
    }
}
