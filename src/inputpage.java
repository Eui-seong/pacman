import javax.swing.*;
import java.awt.*;

public class inputpage extends JFrame {
    public inputpage(int p){
        getContentPane().setBackground(Color.BLACK);

        setLayout(null);
        JLabel game_over = new JLabel("GAME OVER");
        game_over.setFont(new Font("Serif",Font.BOLD,30));
        game_over.setForeground(Color.WHITE);
        game_over.setBounds(48,10,200,50);
        add(game_over);

        JLabel output_point = new JLabel("YOUR POINT : "+p);
        output_point.setFont(new Font("Serif",Font.BOLD,20));
        output_point.setForeground(Color.WHITE);
        output_point.setBounds(62,50,200,50);
        add(output_point);

        JLabel what_name = new JLabel("WHAT IS YOUR NAME?");
        what_name.setFont(new Font("Serif",Font.BOLD,15));
        what_name.setForeground(Color.WHITE);
        what_name.setBounds(60,80,200,50);
        add(what_name);

        JTextField tf = new JTextField();
        tf.setBounds(94,125,100,25);
        add(tf);

        JButton okay_button = new inputbutton("OKAY",p,this,tf);
        okay_button.setBounds(94,175,100,40);
        add(okay_button);

        setTitle("Pacman");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
