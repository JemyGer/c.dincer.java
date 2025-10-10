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
        panel.setLayout(new GridLayout(4, 4));
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
       // Button "3"
        JButton button3 = new JButton("3");
        panel.add(button3);

        button3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                display.setText(display.getText()+ "3");
            }
        });
        // Button "4"
        JButton button4 = new JButton("4");
        panel.add(button4);

        button4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                display.setText(display.getText()+ "4");
            }
        });
        // Button "5"
        JButton button5 = new JButton("5");
        panel.add(button5);

        button5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                display.setText(display.getText()+ "5");
            }
        });
        // Button "6"
        JButton button6 = new JButton("6");
        panel.add(button6);

        button6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                display.setText(display.getText()+ "6");
            }
        });
        // Button "7"
        JButton button7 = new JButton("7");
        panel.add(button7);

        button7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                display.setText(display.getText()+ "7");
            }
        });
        // Button "8"
        JButton button8 = new JButton("8");
        panel.add(button8);

        button7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                display.setText(display.getText()+ "8");
            }
        });
        // Button "9"
        JButton button9 = new JButton("9");
        panel.add(button9);

        button7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                display.setText(display.getText()+ "9");
            }
        });
    }
}