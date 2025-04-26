package com.LFJ.Swing.main.Window.Functions;

import com.LFJ.Swing.main.Window.Interface.Logic;
import com.LFJ.Swing.main.Window.Windows.WindowController.ControllerWindow;
import com.LFJ.Swing.main.Window.Windows.Windows.WindowOne;
import javax.swing.*;

public class WindowLogic implements Logic {
    
    private ControllerWindow controller = new ControllerWindow();
    private WindowOne window;
    @Override
    public void logicStart(){
        mainLogic();
    }
    
    private void mainLogic(){
        window = controller.init();
        
        controller.render(window);
        
    }
    
    @Override
    public void logicClose(){
        controller.close(window);
    }
    
}
