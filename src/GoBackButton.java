import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GoBackButton extends JButton implements ActionListener {

    private RankPage rankPage;

    public GoBackButton(RankPage r) {
        super("Go Back");
        rankPage =  r;
        addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        new MainPage();
        rankPage.dispose();
    }
}
