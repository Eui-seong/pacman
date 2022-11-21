import javax.swing.*;
import java.awt.*;

public class MainPage extends JFrame {
    private Image background = new ImageIcon("src/resources/images/mainpage.PNG").getImage();

    public MainPage() {

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        JPanel p1 = new JPanel();

        JButton startButton =new StartButton("Start", this);
        startButton.setPreferredSize(new Dimension(150, 150));
        startButton.setBorderPainted(false);
        p1.add(startButton);
        JButton rankButton =new RankButton("Rank");
        rankButton.setPreferredSize(new Dimension(150, 150));
        rankButton.setBorderPainted(false);
        p1.add(rankButton);
        JButton exitButton =new ExitButton("Exit");
        exitButton.setPreferredSize(new Dimension(150, 150));
        exitButton.setBorderPainted(false);
        p1.add(exitButton);
        cp.add(p1,BorderLayout.SOUTH);
        setTitle("Pacman");
        setSize(998, 700);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public void paint(Graphics g) {//그리는 함수
        g.drawImage(background, 0, 0, null);
    }
}