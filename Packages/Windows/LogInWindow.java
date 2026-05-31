package Packages.Windows;
import javax.swing.*;

public class LogInWindow extends JFrame{

    private final int width;
    private final int height;

    public LogInWindow(){
        width=500;
        height=400;
        
        setSize(width,height);
        setTitle("Log in Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }
    
}
