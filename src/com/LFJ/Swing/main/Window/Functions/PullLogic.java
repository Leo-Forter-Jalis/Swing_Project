package com.LFJ.Swing.main.Window.Functions;

import com.LFJ.Swing.main.Window.Interface.Logic;
import java.awt.Component;
import javax.swing.JPanel;

public class PullLogic implements Logic {
    
    private Component[] components;
    private JPanel panel;
    
    public PullLogic(Component[] comp, JPanel panel){
       this.components = comp;
       this.panel = panel;
    }
    
    @Override
    public void logicStart(){
        pulling();
    }
    
    private void pulling(){
        for(Component comp : components){
            panel.add(comp);
        }
        logicClose();
    }
    
    @Override
    public void logicClose(){
        
    }
    
}
