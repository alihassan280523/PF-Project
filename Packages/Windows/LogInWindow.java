package Packages.Windows;
import Packages.Panels.LogInPanel;
import java.awt.*;
import javax.swing.*;

public class LogInWindow extends JFrame{

    private final int width;
    private final int height;
    private LogInPanel panel;

    public LogInWindow(){
        width=500;
        height=400;
        panel=new LogInPanel();
        
        setSize(width,height);
        setTitle("Log in Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        add(panel,BorderLayout.CENTER);
        setVisible(false);
    }
    
}
