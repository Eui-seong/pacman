import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RankStartButton extends JButton implements ActionListener {

    private RankPage rankPage;

    public RankStartButton(RankPage r) {
        super(new ImageIcon("src/resources/images/rankStartButton.PNG"));
        rankPage =  r;
        addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        new CharacterPage();
        rankPage.dispose();
    }
}
