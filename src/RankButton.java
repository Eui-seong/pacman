import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RankButton extends JButton implements ActionListener {

    public RankButton(String s){
        super(s);
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){

    }
}
