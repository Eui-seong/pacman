import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitButton extends JButton implements ActionListener {

    public ExitButton(String s){
        super(s);
        addActionListener(this);
    }


    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }
}
