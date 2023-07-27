import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class logingui extends JFrame implements ActionListener
{
    //Username
    JLabel username = new JLabel("Email ID: ");
    JTextField logusername = new JTextField(10);

    //Password
    JLabel password = new JLabel("Password: ");
    JPasswordField logpassword = new JPasswordField(10);

    //button
    JButton loginbutton = new JButton("LOGIN");
    JButton registerbutton = new JButton("REGISTER");

    //main label
    JLabel mainlabel = new JLabel("Login into your account");

    private Image originalImage; // Declare originalImage as a class-level field

    public logingui() {
        //add
        add(username);
        add(logusername);
        add(password);
        add(logpassword);
        add(loginbutton);
        add(registerbutton);
        add(mainlabel);

        //setbounds
        mainlabel.setBounds(550, 170, 150, 50);

        username.setBounds(450, 215, 100, 30);
        logusername.setBounds(450, 240, 318, 30);

        password.setBounds(450, 275, 100, 30);
        logpassword.setBounds(450, 300, 318, 30);

        loginbutton.setBounds(566, 340, 100, 30);
        registerbutton.setBounds(566, 380, 100, 30);

        //image01
        JLabel loginpageimage = new JLabel();
        ImageIcon imageIcon = new ImageIcon("src/Resources/01.jpg");
        loginpageimage.setIcon(imageIcon);

        // Add components to the panel
        JPanel image01 = new JPanel();
        image01.add(loginpageimage);
        add(image01);
        image01.setBounds(0, 0, 432, 500);


        //image02
        JLabel image02 = new JLabel();
        ImageIcon image2 = new ImageIcon("src/Resources/03.jpg");
        image02.setIcon(image2);

        // Add components to the panel
        JPanel image20 = new JPanel();
        image20.add(image02);
        add(image20);
        image20.setBounds(418, 0, 386, 170);

        //Background Colour
        getContentPane().setBackground(Color.decode("#FFFFFF")); // Set your desired color here
        //getContentPane().setBackground(Color.RED);

        //Text Field Styles
        logusername.setBackground(Color.decode("#8B634E")); // Set the background color to yellow
        logusername.setForeground(Color.BLACK); // Set the text color to red
        //logusername.setFont(new Font("Arial", Font.BOLD, 16)); // Set the font to Arial, bold, size 16

        logpassword.setBackground(Color.decode("#8B634E")); // Set the background color to yellow
        logpassword.setForeground(Color.BLACK); // Set the text color to red
        //logpassword.setFont(new Font("Arial", Font.BOLD, 16)); // Set the font to Arial, bold, size 16

        //Button Styles
        loginbutton.setForeground(Color.decode("#000000")); // Set text color
        loginbutton.setBackground(Color.decode("#8B634E")); // Set background color
        //loginbutton.setFont(new Font("Sora", Font.PLAIN, 12)); // Set font

        registerbutton.setForeground(Color.decode("#000000")); // Set text color
        registerbutton.setBackground(Color.decode("#8B634E")); // Set background color
        registerbutton.setFont(new Font("Sora", Font.PLAIN, 12)); // Set font

        //Button Actionlistener
        loginbutton.addActionListener(this);
        registerbutton.addActionListener(this);

        //Frame size
        setLayout(null);
        setSize(800, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    public void actionPerformed(ActionEvent e) 
    {
      if (e.getSource() == loginbutton) 
      {
          String email = logusername.getText();
          String password = new String(logpassword.getPassword());

          // Check if the entered email and password match the stored data
          if (UserData.checkUserData(email, password)) 
          {
              JOptionPane.showMessageDialog(this, "Login Successful");
              PMGUI passwordManagerGUI = new PMGUI();
              passwordManagerGUI.setVisible(true);
              setVisible(false);
          } 
          else 
          {
              JOptionPane.showMessageDialog(this, "Invalid email or password");
          }
      } else if (e.getSource() == registerbutton) 
      {
          String email = logusername.getText();
          String password = new String(logpassword.getPassword());

          // Save the entered email and password
          UserData.saveUserData(email, password);

          JOptionPane.showMessageDialog(this, "Registration Successful");
      }
    }    

}