package Packages.Panels;

import Packages.Windows.LogInWindow;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StudentSignUpPanel extends JPanel{
    
    private JLabel firstNameLabel;
    private JLabel lastNameLabel;
    private JLabel emailLabel;
    private JLabel passwordLabel;
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField emailField;
    private JTextField passwordField;
    private JButton submitButton;
    private JPanel firstNamePanel;
    private JPanel lastNamePanel;
    private JPanel emailPanel;
    private JPanel passwordPanel;
    private JPanel buttonPanel;
    private SpringLayout layout;
    private boolean signUpStatus;


    public StudentSignUpPanel(){
        signUpStatus=false;
        setLayout(new GridLayout(5,1));
        layout=new SpringLayout();

        setBorder(BorderFactory.createLineBorder(Color.black,5));

        firstNameLabel=new JLabel("First Name");
        lastNameLabel=new JLabel("Last Name");
        emailLabel=new JLabel("Email");
        passwordLabel=new JLabel("Password");

        firstNameField=new JTextField(15);
        lastNameField=new JTextField(15);
        emailField=new JTextField(18);
        passwordField=new JTextField(15);

        firstNamePanel=new JPanel();
        firstNamePanel.add(firstNameLabel);
        firstNamePanel.add(firstNameField);
        layout.putConstraint(SpringLayout.WEST, firstNameField, 5,SpringLayout.EAST,firstNameLabel);
        add(firstNamePanel);

        // layout.putConstraint(SpringLayout.NORTH, lastNameLabel, 5, SpringLayout.SOUTH, firstNameLabel);
        lastNamePanel=new JPanel();
        lastNamePanel.add(lastNameLabel);
        lastNamePanel.add(lastNameField);
        layout.putConstraint(SpringLayout.WEST, lastNameField, 5,SpringLayout.EAST,lastNameLabel);
        add(lastNamePanel);

        emailPanel=new JPanel();
        emailPanel.add(emailLabel);
        emailPanel.add(emailField);
        layout.putConstraint(SpringLayout.WEST, emailField,33 , SpringLayout.EAST, emailLabel);
        add(emailPanel);

        passwordPanel=new JPanel();
        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordField);
        layout.putConstraint(SpringLayout.WEST, passwordField,10, SpringLayout.EAST,passwordLabel);
        add(passwordPanel);
        

        submitButton=new JButton("Submit");
        submitButton.addActionListener(new SubmitButtonEventListener());
        buttonPanel=new JPanel();
        buttonPanel.add(submitButton);
        add(buttonPanel);
    }

    public boolean getSignUpStatus(){
        return signUpStatus;
    }

    private class SubmitButtonEventListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null,"Sign Up Successful");
            new LogInWindow();
            signUpStatus=true;
        }
    }
}
