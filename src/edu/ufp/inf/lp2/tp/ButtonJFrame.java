/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.inf.lp2.tp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Jorge
 */
public class ButtonJFrame extends JFrame {
    private JPanel southPanel;
    private JButton okJButton;
    private JButton colorJButton;
    public ButtonJFrame(String string) throws HeadlessException{
        super(string);
        initComponents();
    }
    
    private void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.southPanel = new JPanel();
        this.okJButton = new JButton("Ok");
        this.colorJButton = new JButton("Color");
        
        this.southPanel.setLayout(new GridLayout(1,2));
        this.southPanel.add(this.okJButton);
        this.southPanel.add(this.colorJButton);
        
        Container c = this.getContentPane();
        c.setBackground(Color.white);
        c.setLayout(new BorderLayout());
        c.add(BorderLayout.SOUTH, this.southPanel);
        
        this.okJButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                okButtonActionPerformed(ae);
            }
        });
        
        this.colorJButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                colorButtonActionPerformed(ae);
            }
        });
        
        this.setSize(400,400);
        this.setVisible(true);
    }
    
    private void okButtonActionPerformed(ActionEvent ae){
        JButton b = (JButton) ae.getSource();
        System.out.println(b.getText() + " Pressed...");
    }
    
    private void colorButtonActionPerformed(ActionEvent ae){
        Container c = this.getContentPane();
        if(c.getBackground()==Color.white){
            c.setBackground(Color.red);
        }else{
            c.setBackground(Color.white);
        }
        
    }
    
    public static void main(String[] args){
        ButtonJFrame f = new ButtonJFrame("My frame button");
    }
}
