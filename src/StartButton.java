import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartButton extends JButton implements ActionListener {
    MainPage Frame;
    public StartButton(String s, MainPage f){
        super(s);
        Frame= f;
        addActionListener(this);

    }

    public void actionPerformed(ActionEvent e){
        System.out.println("HAHA");
        new Pacman().Start();
        Frame.dispose();
    }
}
