package registrase;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class RegistrationScreen extends JFrame{
	
	private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton registerButton;

    public RegistrationScreen() {
        
        setTitle("Register");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        registerButton = new JButton("Register");

        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        mainPanel.add(usernameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        mainPanel.add(usernameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        mainPanel.add(passwordLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        mainPanel.add(passwordField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        mainPanel.add(registerButton, gbc);

        registerButton.addActionListener(e -> {
           
            String username = usernameField.getText();
            char[] password = passwordField.getPassword();

          
            createUserAccount(username, password);

        
            dispose();
        });

      
        add(mainPanel);

     
        setVisible(true);
    }

    private void createUserAccount(String username, char[] password) {
       
        System.out.println("Creating user account for " + username);
       
        java.util.Arrays.fill(password, '0');
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RegistrationScreen::new);
    }
}

