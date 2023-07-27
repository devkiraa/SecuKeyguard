import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class appintro extends JFrame {
    private JPanel contentPane;
    private CardLayout cardLayout;

    public appintro() {
        setUndecorated(true);
        setTitle("Password Manager");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the content pane with CardLayout
        contentPane = new JPanel();
        cardLayout = new CardLayout();
        contentPane.setLayout(cardLayout);

        // Create the loading page
        JPanel loadingPage = createLoadingPage();
        contentPane.add(loadingPage, "Loading");

        // Create the login page
        JPanel loginPage = createLoginPage();
        contentPane.add(loginPage, "Login");

        // Set the initial page to display
        cardLayout.show(contentPane, "Loading");

        // Add the content pane to the frame
        getContentPane().add(contentPane);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(500,300);
        setResizable(false);//While using this it will not allow to resize the frame
        
        // Simulate a loading delay and then switch to the login page
        simulateLoadingDelay();

    }

    private JPanel createLoadingPage() {
        JPanel loadingPanel = new JPanel();
        loadingPanel.setLayout(new BorderLayout());

        // Create a loading label or animation
        JLabel loginpageimage = new JLabel();
        ImageIcon imageIcon = new ImageIcon("src/Resources/blahh.jpg");
        loginpageimage.setIcon(imageIcon);
        loadingPanel.add(loginpageimage);
        add(loadingPanel);
        loadingPanel.setBounds(0,0,500,300);

        return loadingPanel;
    }


    private JPanel createLoginPage() {
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new BorderLayout());

        // Create the login components
        // ...

        return loginPanel;
    }

    private void simulateLoadingDelay() {
        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Switch to the login page
                cardLayout.show(contentPane, "Login");
            }
        });
        timer.setRepeats(false); // Only fire the event once
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new appintro();
            }
        });
    }
}
