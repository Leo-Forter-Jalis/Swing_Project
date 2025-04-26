package com.LFJ.Swing.main.Window.Windows.WindowController;

import com.LFJ.Swing.main.Window.Interface.Controller;
import com.LFJ.Swing.main.Window.Interface.Window;
import com.LFJ.Swing.main.Window.Windows.Windows.WindowOne;

public class ControllerWindow implements Controller {
    @Override
    public WindowOne init(){
        return new WindowOne();
    }
    
    @Override
    public void render(Window window){
        window.render();
    }
    
    @Override
    public void close(Window window){
        window.dispose();
    }
    
}
