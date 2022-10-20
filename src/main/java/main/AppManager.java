package main;

import data.Context;
import gui.AppWindow;

public class AppManager {
    private Context context = new Context();

    private AppWindow window = new AppWindow();

    public void init(){
        window.init();
    }

    public void run(){
        init();

    }


}
