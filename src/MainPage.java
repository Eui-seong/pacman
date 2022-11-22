import javax.swing.*;
import java.awt.*;

public class MainPage extends JFrame {
    private Image background = new ImageIcon("src/resources/images/mainpage.PNG").getImage();

    public MainPage() {

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        JPanel p1 = new AllButton(this);
        cp.add(page1);
        cp.add(p1,BorderLayout.SOUTH);
        setTitle("Pacman");
        setSize(998, 800);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    static JPanel page1=new JPanel() {
        /*이미지*/
        private Image background = new ImageIcon("src/resources/images/mainpage.PNG").getImage();
        public void paint(Graphics g) {//그리는 함수
            g.drawImage(background, 0, 0, null);//background를 그려줌
        }
    };


}