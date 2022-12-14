import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CharacterButton extends JButton implements ActionListener {
    private CharacterPage c_frame;

    public CharacterButton(CharacterPage c){
        c_frame = c;
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(this.getActionCommand().equals("y"))
            new Pacman("y").Start();

        else if(this.getActionCommand().equals("b"))
            new Pacman("b").Start();

        else if(this.getActionCommand().equals("r"))
            new Pacman("r").Start();


        c_frame.dispose();
    }
}
