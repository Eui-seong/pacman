import javax.swing.*;
import java.awt.*;

public class MainPage extends JFrame {
    public MainPage(){
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JPanel p1 = new JPanel();
        p1.add(new StartButton("Start",this));
        p1.add(new RankButton("Rank"));
        p1.add(new ExitButton("Exit"));
        cp.add(p1);
        setTitle("Pacman");
        setSize(250,75);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
