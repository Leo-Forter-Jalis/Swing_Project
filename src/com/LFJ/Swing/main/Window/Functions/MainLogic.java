package com.LFJ.Swing.main.Window.Functions;

import com.LFJ.Swing.main.Window.Interface.Logic;
import com.LFJ.Swing.main.Window.Functions.WindowLogic;

public class MainLogic implements Logic {
    
    private WindowLogic logic = new WindowLogic();
    
    @Override
    public void logicStart(){
        logic();
    } 
    
    private void logic(){
        logic.logicStart();
    }
    
    @Override
    public void logicClose(){
        
    }
    
}
