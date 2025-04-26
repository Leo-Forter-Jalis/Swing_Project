package com.LFJ.Swing.main.Window.Windows.Windows;

import com.LFJ.Swing.main.Window.Interface.Window;
import javax.swing.*;
import java.awt.Component;
import com.LFJ.Swing.main.Window.Functions.PullLogic;
import com.LFJ.Swing.main.Window.Functions.LogicListenerSwing;

public class WindowOne implements Window {
    
    private JFrame frame = new JFrame("Title");
    private JPanel panel = new JPanel();
    
    private JLabel label1 = new JLabel("LOL1");
    private JLabel label2 = new JLabel("LOL2");
    private JButton button1 = new JButton("Button1");
    private JButton button2 = new JButton("Button2");
    
    private Component[] components = {label1, label2, button1, button2};
    
    private PullLogic pull = new PullLogic(components, panel);
    
    private LogicListenerSwing logic = new LogicListenerSwing(components);
    
    public WindowOne(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pull.logicStart();
    }
    
    @Override
    public void render(){
        frame.setSize(512, 512);
        frame.add(panel);
        frame.setVisible(true);
        
        logic();
        
    }
    
    private void logic(){
        logic.logicStart();
    }
    
    @Override
    public void dispose(){
        frame.dispose();
    }
    
}
