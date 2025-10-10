/**
 * v0.1 - Calculator
 * Autor - C.Dincer
 * GUI - Swing
 */
// CalculatorGUI in Java

// packages die benötigt werden
package de.cdincer;
// imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;



public class CalculatorGUI extends JFrame {

    public CalculatorGUI(){
        // Frame-Einstellung
        setTitle("Calculator v0.1");
        setSize(300,400);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Display des Calculator ( nicht edetierbar)
        JTextField display = new JTextField();
        display.setPreferredSize(new Dimension(0, 50));
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        //Panel für Buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 5));
        add(panel, BorderLayout.CENTER);

        // Button "1"
        JButton button1 = new JButton("1");
        panel.add(button1);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+ "1");
            }
        });
        // Button "2"
        JButton button2 = new JButton("2");
        panel.add(button2);

       button2.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               display.setText(display.getText()+ "2");
           }
       });
    }
}