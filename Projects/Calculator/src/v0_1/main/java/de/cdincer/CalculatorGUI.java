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

        // Button "1 wird zu 7 siehe Layout"
        JButton button7 = new JButton("7");
        panel.add(button7);

        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+ "7");
            }
        });
        // Button "2 wird zu 8 siehe Layout"
        JButton button8 = new JButton("8");
        panel.add(button8);

       button8.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               display.setText(display.getText()+ "8");
           }
       });
       // Button "3 wird zu 9"
        JButton button9 = new JButton("9");
        panel.add(button9);

        button9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                display.setText(display.getText()+ "9");
            }
        });
        // Button "4 wird zu /"
        JButton button'/' = new JButton("/");
        panel.add(button4);

        button'/'.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                display.setText(display.getText()+ "/");
            }
        });/*
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

        button8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                display.setText(display.getText()+ "8");
            }
        });
        // Button "9"
        JButton button9 = new JButton("9");
        panel.add(button9);

        button9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                display.setText(display.getText()+ "9");
            }
        });
        // Button "10"
        JButton button10 = new JButton("10");
        panel.add(button10);

        button10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                display.setText(display.getText()+ "10");
            }
        });
        // Button "11"
        JButton button11 = new JButton("11");
        panel.add(button11);

        button11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                display.setText(display.getText()+ "11");
            }
        });
        // Button "12"
        JButton button12 = new JButton("12");
        panel.add(button12);

        button12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                display.setText(display.getText()+ "12");
            }
        });
        // Button "13"
        JButton button13 = new JButton("13");
        panel.add(button13);

        button13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                display.setText(display.getText()+ "13");
            }
        });
        // Button "14"
        JButton button14 = new JButton("14");
        panel.add(button14);

        button14.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                display.setText(display.getText()+ "14");
            }
        });
        // Button "15"
        JButton button15 = new JButton("15");
        panel.add(button15);

        button15.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                display.setText(display.getText()+ "15");
            }
        });
        // Button "16"
        JButton button16 = new JButton("16");
        panel.add(button16);

        button16.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                display.setText(display.getText()+ "16");
            }
        });*/
    }
}