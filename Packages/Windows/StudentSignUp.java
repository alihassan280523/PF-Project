package Packages.Windows;

import Packages.Panels.*;
import java.awt.*;
import javax.swing.*;

public class StudentSignUp extends JFrame{
    private final int windowWidth;
    private final int windowHeight;
    private StudentSignUpPanel panel;
    private static StudentSignUp obj;

    public StudentSignUp(){
        obj=this;
        windowWidth=500;
        windowHeight=400;
        panel=new StudentSignUpPanel();

        

        setSize(windowWidth,windowHeight);
        setTitle("My App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        add(panel,BorderLayout.CENTER);
        // add(new JPanel(),BorderLayout.WEST);
        // add(new JPanel(),BorderLayout.EAST);
        setVisible(false);
        
    }

    public static StudentSignUp getObject (){
        return obj;
    }

    public boolean getStatus(){
        // return panel.getSignUpStatus();
    
        return true;
    }
}
