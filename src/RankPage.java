import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.io.*;
import java.util.StringTokenizer;

public class RankPage extends JFrame {

    private String getTop5[][] = new String[5][2];

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
        p1.setLayout(new GridLayout(6, 3));
        p1.setBorder(new LineBorder(Color.WHITE));
        for (int i = 0; i < 5; i++) {
            getTop5[i][0] = "0";
            getTop5[i][1] = "-";
        }
        setGetTop5();
        JLabel hue1 = new JLabel("      Rank");
        JLabel hue2 = new JLabel("      Score");
        JLabel hue3 = new JLabel("      Name");
        JLabel rank1 = new JLabel("         1st");
        JLabel score1 = new JLabel("         " + getTop5[0][0]);
        JLabel name1 = new JLabel("        " + getTop5[0][1]);
        JLabel rank2 = new JLabel("         2nd");
        JLabel score2 = new JLabel("         " + getTop5[1][0]);
        JLabel name2 = new JLabel("        " + getTop5[1][1]);
        JLabel rank3 = new JLabel("         3rd");
        JLabel score3 = new JLabel("         " + getTop5[2][0]);
        JLabel name3 = new JLabel("        " + getTop5[2][1]);
        JLabel rank4 = new JLabel("         4th");
        JLabel score4 = new JLabel("         " + getTop5[3][0]);
        JLabel name4 = new JLabel("        " + getTop5[3][1]);
        JLabel rank5 = new JLabel("         5th");
        JLabel score5 = new JLabel("         " + getTop5[4][0]);
        JLabel name5 = new JLabel("        " + getTop5[4][1]);
        hue1.setFont(new Font("Helvetica", Font.BOLD, 15));
        hue2.setFont(new Font("Helvetica", Font.BOLD, 15));
        hue3.setFont(new Font("Helvetica", Font.BOLD, 15));
        rank1.setFont(new Font("Helvetica", Font.BOLD, 12));
        score1.setFont(new Font("Helvetica", Font.BOLD, 12));
        name1.setFont(new Font("Helvetica", Font.BOLD, 12));
        rank2.setFont(new Font("Helvetica", Font.BOLD, 12));
        score2.setFont(new Font("Helvetica", Font.BOLD, 12));
        name2.setFont(new Font("Helvetica", Font.BOLD, 12));
        rank3.setFont(new Font("Helvetica", Font.BOLD, 12));
        score3.setFont(new Font("Helvetica", Font.BOLD, 12));
        name3.setFont(new Font("Helvetica", Font.BOLD, 12));
        rank4.setFont(new Font("Helvetica", Font.BOLD, 12));
        score4.setFont(new Font("Helvetica", Font.BOLD, 12));
        name4.setFont(new Font("Helvetica", Font.BOLD, 12));
        rank5.setFont(new Font("Helvetica", Font.BOLD, 12));
        score5.setFont(new Font("Helvetica", Font.BOLD, 12));
        name5.setFont(new Font("Helvetica", Font.BOLD, 12));
        hue1.setForeground(Color.WHITE);
        hue2.setForeground(Color.WHITE);
        hue3.setForeground(Color.WHITE);
        rank1.setForeground(Color.WHITE);
        score1.setForeground(Color.WHITE);
        name1.setForeground(Color.WHITE);
        rank2.setForeground(Color.WHITE);
        score2.setForeground(Color.WHITE);
        name2.setForeground(Color.WHITE);
        rank3.setForeground(Color.WHITE);
        score3.setForeground(Color.WHITE);
        name3.setForeground(Color.WHITE);
        rank4.setForeground(Color.WHITE);
        score4.setForeground(Color.WHITE);
        name4.setForeground(Color.WHITE);
        rank5.setForeground(Color.WHITE);
        score5.setForeground(Color.WHITE);
        name5.setForeground(Color.WHITE);
        p1.add(hue1);
        p1.add(hue2);
        p1.add(hue3);
        p1.add(rank1);
        p1.add(score1);
        p1.add(name1);
        p1.add(rank2);
        p1.add(score2);
        p1.add(name2);
        p1.add(rank3);
        p1.add(score3);
        p1.add(name3);
        p1.add(rank4);
        p1.add(score4);
        p1.add(name4);
        p1.add(rank5);
        p1.add(score5);
        p1.add(name5);
        JPanel p2 = new JPanel();
        p2.setBackground(Color.BLACK);
        JButton goBackButton = new GoBackButton(this);
        goBackButton.setBackground(Color.WHITE);
        goBackButton.setFont(new Font("Helvetica", Font.BOLD, 17));
        goBackButton.setPreferredSize(new Dimension(110, 40));
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


    public void setGetTop5() {
        // 배열 초기화
        try {
            BufferedReader infile = new BufferedReader(new FileReader("./rank.csv"));
            if (infile.ready()) {
                System.out.println("success");
                String line;
                int count = 0;
                while ((line = infile.readLine())!= null) {
                    System.out.println(line);
                    StringTokenizer t = new StringTokenizer(line, ",");
                    String s = t.nextToken().trim();
                    String n = t.nextToken().trim();
                    System.out.println(s);
                    int score = Integer.parseInt(s);
                    for (int i = 0; i < 5; i++) {
                        if (score > Integer.parseInt(getTop5[i][0])) {
                            for (int j = 4; j > i; j--) {
                                getTop5[j][0] = getTop5[j-1][0];
                                getTop5[j][1] = getTop5[j-1][1];
                            }
                            getTop5[i][0] = s;
                            getTop5[i][1] = n;
                            break;
                        }
                    }
                    count++;
                }
                for (int i = count; i < 5; i++) {
                    getTop5[i][0] = "0";
                    getTop5[i][1] = "-";
                }
            }
            infile.close();
        }
        catch(Exception e) {
                System.out.println("No Data");
        }
    }
}
