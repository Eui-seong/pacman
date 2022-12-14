import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class CharacterPage extends JFrame {

    private CharacterButton[][] character_board = new CharacterButton[1][3];

    private ImageIcon icon1 = new ImageIcon("src/resources/images/bigleft3_y.png");
    private ImageIcon icon2 = new ImageIcon("src/resources/images/bigleft3_b.png");
    private ImageIcon icon3 = new ImageIcon("src/resources/images/bigleft3_r.png");

    Container cp = getContentPane();
    GridBagLayout gbl = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();

    public CharacterPage(){
        cp.setLayout(gbl);
        cp.setBackground(Color.BLACK);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 0.5;

        JPanel jp1 = new JPanel(new BorderLayout());
        jp_set(jp1,0,0,4,1);
        gbc.weighty = 1.0;
        jp1.add(new Panel_1(),BorderLayout.CENTER);
        JPanel jp2 = new JPanel(new GridLayout(1,3,15,0));
        jp2.setBackground(Color.BLACK);
        jp_set(jp2,0,1,4,2);
        gbc.weighty = 0.5;
        JPanel jp3 = new JPanel(new FlowLayout());
        jp3.setBackground(Color.BLACK);
        jp_set(jp3,0,3,4,1);
        for(int i = 0 ; i <3 ; i++){
            character_board[0][i] = new CharacterButton(this);
            character_board[0][i].setBackground(new Color(34,42,53));
            character_board[0][i].setBorder(new LineBorder(Color.white,3));
            if(i == 0){
                character_board[0][i].add(new Panel_2(icon1));
                character_board[0][i].setActionCommand("y");
            }
            else if (i == 1) {
                character_board[0][i].add(new Panel_2(icon2));
                character_board[0][i].setActionCommand("b");
            }
            else{
                character_board[0][i].add(new Panel_2(icon3));
                character_board[0][i].setActionCommand("r");
            }

            jp2.add(character_board[0][i]);
        }

        JLabel label = new JLabel(" Choose a character! ");
        label.setFont(new Font("Helvetica",Font.BOLD,18));
        jp3.add(label);


        cp.add(jp1);
        cp.add(jp2);
        cp.add(jp3);
        setSize(380,420);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }



    public void jp_set(JPanel jp, int x, int y, int w, int h){
        gbc.gridx = x; //????????? ????????? x??????
        gbc.gridy = y; //????????? ????????? y??????
        gbc.gridwidth = w; //????????? ????????? ????????? ??? ??????
        gbc.gridheight = h; //????????? ????????? ????????? ?????? ??????
        gbl.setConstraints(jp,gbc);
    }

    public CharacterButton[][] getCharacter_board() {
        return character_board;
    }

    public Icon icon1(){
        return  icon1;
    }

    public Icon icon2(){
        return  icon2;
    }
    public Icon icon3(){
        return  icon3;
    }
    class Panel_1 extends JPanel{
        public void paintComponent(Graphics g){
            g.setColor(Color.WHITE);
            g.fillRect(80,30,200,40);
            g.setColor(new Color(34,42,53));
            g.fillRect(83,33,194,34);
            g.setColor(Color.WHITE);
            g.setFont(new Font("Helvetica",Font.BOLD,14));
            g.drawString("PACMAN FRIENDS",120,55);
        }
    }

    class Panel_2 extends JPanel{
        private ImageIcon icon;
        private Image img;

        public Panel_2(ImageIcon i){
            icon = i;
            img = icon.getImage();
        }
        public void paintComponent(Graphics g){
            g.drawImage(img,14,40,getWidth()-25,getWidth()-25,this);
        }
    }


}
