import java.awt.*;
import javax.swing.*;

public class Pacman extends JFrame {

    public Pacman() {

        initUI();

    }

    private void initUI() {

        add(new Board());
        setTitle("Pacman");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(380, 420);
        setLocationRelativeTo(null);
    }

    public void Start() {
        EventQueue.invokeLater(() -> {
            var ex = new Pacman();
            ex.setVisible(true);
        });
    }
}