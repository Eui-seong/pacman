import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class RankPage extends JFrame {

    public RankPage() {
        Container cp = getContentPane();
        cp.setBackground(Color.BLACK);
        cp.setLayout(new BorderLayout());
        JLabel label = new JLabel("Pacman Rank");
        label.setForeground(Color.WHITE);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Helvetica", Font.BOLD, 33));
        label.setBorder(BorderFactory.createEmptyBorder(20 , 0, 10 , 0));
        JPanel p1 = new JPanel();
        JPanel tempLeft = new JPanel();
        tempLeft.setBackground(Color.BLACK);
        JPanel tempRight = new JPanel();
        tempRight.setBackground(Color.BLACK);
        p1.setBackground(Color.BLACK);
        p1.setLayout(new GridLayout(6, 1));
        p1.setBorder(new LineBorder(Color.WHITE));
        JLabel hue = new JLabel("    Rank                         Score                       Name");
        JLabel rank1 = new JLabel("     1st");
        JLabel rank2 = new JLabel("     2nd");
        JLabel rank3 = new JLabel("     3th");
        JLabel rank4 = new JLabel("     4th");
        JLabel rank5 = new JLabel("     5th");
        hue.setFont(new Font("Helvetica", Font.BOLD, 15));
        rank1.setFont(new Font("Helvetica", Font.BOLD, 12));
        rank2.setFont(new Font("Helvetica", Font.BOLD, 12));
        rank3.setFont(new Font("Helvetica", Font.BOLD, 12));
        rank4.setFont(new Font("Helvetica", Font.BOLD, 12));
        rank5.setFont(new Font("Helvetica", Font.BOLD, 12));
        hue.setForeground(Color.WHITE);
        rank1.setForeground(Color.WHITE);
        rank2.setForeground(Color.WHITE);
        rank3.setForeground(Color.WHITE);
        rank4.setForeground(Color.WHITE);
        rank5.setForeground(Color.WHITE);
        p1.add(hue);
        p1.add(rank1);
        p1.add(rank2);
        p1.add(rank3);
        p1.add(rank4);
        p1.add(rank5);
        JPanel p2 = new JPanel();
        p2.setBackground(Color.BLACK);
        JButton goBackButton = new GoBackButton(this);
        goBackButton.setBackground(Color.WHITE);
        goBackButton.setFont(new Font("Helvetica", Font.BOLD, 17));
        goBackButton.setPreferredSize(new Dimension(100, 40));
        p2.setBorder(BorderFactory.createEmptyBorder(10 , 0, 10 , 0));
        p2.add(goBackButton);
        cp.add(label, BorderLayout.NORTH);
        cp.add(p1, BorderLayout.CENTER);
        cp.add(p2, BorderLayout.SOUTH);
        cp.add(tempLeft, BorderLayout.WEST);
        cp.add(tempRight, BorderLayout.EAST);
        setTitle("Pacman Rank");
        setSize(380, 420);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
