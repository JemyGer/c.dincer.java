//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GrussMitProgrammfenster extends JFrame {
    public GrussMitProgrammfenster() {
        super("Hallo");
        ImageIcon var1 = new ImageIcon(this.getClass().getResource("java.logo.png"));
        Image var2 = var1.getImage();
        Image var3 = var2.getScaledInstance(300, 300, 4);
        var1 = new ImageIcon(var3);
        JLabel var4 = new JLabel("Viel Erfolg beim", 0);
        JLabel var5 = new JLabel("Progammieren mit Java!", 0);
        JLabel var6 = new JLabel(var1);
        Font var7 = new Font("SansSerif", 1, 24);
        var4.setFont(var7);
        var4.setForeground(Color.red);
        var5.setFont(var7);
        var5.setForeground(Color.red);
        Container var8 = this.getContentPane();
        var8.setLayout(new FlowLayout());
        var8.setBackground(Color.white);
        var8.add(var4);
        var8.add(var5);
        var8.add(var6);
        this.setDefaultCloseOperation(3);
        this.setSize(300, 300);
        this.setVisible(true);
    }

    public static void main(String[] var0) {
        new GrussMitProgrammfenster();
    }
}
