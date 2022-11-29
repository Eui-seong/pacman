import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RankButton extends JButton implements ActionListener {
    MainPage Frame;
    public RankButton(String s, MainPage f){
        super(s);
        Frame = f;
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        new RankPage();
        Frame.dispose();
    }
}
