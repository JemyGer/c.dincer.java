/*Beispiel mit Programfenster
*/

import java.awt.*;
import javax.swing.*;

public class GrussMitProgrammfenster extends JFrame {
    public GrussMitProgrammfenster() {
        super("Hallo");

        ImageIcon icon = new ImageIcon(getClass().getResource("java.logo.png"));
        Image img = icon.getImage();
        Image skaliert = img.getScaledInstance(300,300, Image.SCALE_SMOOTH);
        icon = new ImageIcon(skaliert);

        JLabel label1 = new JLabel("Viel Erfolg beim", JLabel.CENTER);
        JLabel label2 = new JLabel("Progammieren mit Java!", JLabel.CENTER);
        JLabel label3 = new JLabel(icon);
        Font schrift = new Font ("SansSerif", Font.BOLD, 24);
        label1.setFont(schrift);
        label1.setForeground(Color.red);
        label2.setFont(schrift);
        label2.setForeground(Color.red);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.white);
        c.add(label1);
        c.add(label2);
        c.add(label3);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
    }
    public static void main (String[] args) {
        new GrussMitProgrammfenster();
    }

}
