package com.LFJ.Swing.main.Window.Functions;

import com.LFJ.Swing.main.Window.Interface.Logic;
import java.awt.Component;
import javax.swing.*;
import java.awt.event.*;

public class LogicListenerSwing implements Logic {
    
    private JButton[] buttons = new JButton[2];
    private JLabel[] labels = new JLabel[2];
    
    private Component[] components;
    
    public LogicListenerSwing(Component[] components){
        this.components = components;
    }
    
    @Override
    public void logicStart(){
        int count = 0;
        for(Component comp : components){
            if(comp instanceof JButton){
                buttons[count] =(JButton) comp;
                count++;
            }
        }
        count = 0;
        for(Component comp : components){
            if(comp instanceof JLabel){
                labels[count] =(JLabel) comp;
                count++;
            }
        }
        
        logic();
        
    }
    
    private void logic(){
        buttons[0].addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                
                labels[0].setVisible(false);
                buttons[0].setVisible(false);
                buttons[1].setVisible(true);
                labels[1].setVisible(true);
                
            }
            
        });
        
        buttons[1].addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                
                labels[0].setVisible(true);
                buttons[0].setVisible(true);
                buttons[1].setVisible(false);
                labels[1].setVisible(false);
                
            }
        
        });
        
    }
    
    @Override
    public void logicClose(){
        
    }
    
    
}
