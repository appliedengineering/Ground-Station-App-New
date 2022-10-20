package gui;

import javax.swing.*;
import java.awt.*;

public class AppWindow {

    private static final int INIT_APP_WIDTH = 500, INIT_APP_HEIGHT = 500;
    private JFrame frame;

    public AppWindow(){
    }

    public void init(){
        frame = new JFrame();
        frame.setSize(new Dimension(INIT_APP_WIDTH, INIT_APP_HEIGHT));
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(false);
        frame.add(new JLabel("Hello there!"));
        frame.setVisible(true);
    }
}
