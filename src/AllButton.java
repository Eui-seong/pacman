import javax.swing.*;
import java.awt.*;

public class AllButton extends JPanel {
    MainPage Frame;
    private ImageIcon startimage = new ImageIcon("src/resources/images/startButton.PNG");
    private ImageIcon rankimage = new ImageIcon("src/resources/images/rankbutton.PNG");
    private ImageIcon exitimage = new ImageIcon("src/resources/images/exitbutton.PNG");
    public AllButton(MainPage f){
        Frame=f;
        JButton startButton =new StartButton("Start", Frame);
        startButton.setPreferredSize(new Dimension(190, 96));
        startButton.setBorderPainted(false);
        this.add(startButton);
        startButton.setIcon(startimage);
        JButton rankButton =new RankButton("Rank", Frame);
        rankButton.setPreferredSize(new Dimension(216, 90));
        rankButton.setBorderPainted(false);
        this.add(rankButton);
        rankButton.setIcon(rankimage);
        JButton exitButton =new ExitButton("Exit");
        exitButton.setPreferredSize(new Dimension(143, 104));
        exitButton.setBorderPainted(false);
        this.add(exitButton);
        exitButton.setIcon(exitimage);
    }
    public void paintComponent(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, 998, 150);

    }
}
