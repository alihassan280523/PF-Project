package Packages.Panels;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class LogInPanel extends JPanel {
    
    private JButton signUpButton;
    private JButton LogInButton;
    private JLabel emailLabel;
    private JLabel passwordLabel;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JPanel emailPanel;
    private JPanel passwordPanel;
    private JPanel buttonPanel;

    public LogInPanel(){
        setLayout(new GridBagLayout());
        
        setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(20, 20, 20, 20, this.getBackground()), BorderFactory.createTitledBorder((BorderFactory.createLineBorder(Color.black, 1)),"User Log in",TitledBorder.CENTER,TitledBorder.BELOW_TOP)));
        emailLabel=new JLabel("Email");
        emailField=new JTextField(15);
        passwordLabel=new JLabel("Password");
        passwordField=new JPasswordField(15);
        signUpButton=new JButton("Sign Up");
        LogInButton=new JButton("Log in");

        GridBagConstraints c=new GridBagConstraints();
        GridBagConstraints c2=new GridBagConstraints();
        GridBagConstraints c3=new GridBagConstraints();

        c.gridx=0;
        c.gridy=0;

        c2.gridx=0;
        c2.gridy=1;
        c2.insets=new Insets(0,0,0,25);

        c3.gridx=0;
        c3.gridy=2;
        c3.insets=new Insets(20,0,0,0);
        
        emailPanel=new JPanel();
        passwordPanel=new JPanel();
        buttonPanel=new JPanel();

        emailPanel.add(emailLabel);
        emailPanel.add(emailField);
        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordField);
        buttonPanel.add(LogInButton);
        buttonPanel.add(signUpButton);


        signUpButton.addActionListener(new SignUpBtnListener());

        add(emailPanel,c);
        add(passwordPanel,c2);
        add(buttonPanel,c3);
    }

    

    private class SignUpBtnListener implements ActionListener{
        
        public void actionPerformed(ActionEvent e){
           
            
           
        }
    }
}
