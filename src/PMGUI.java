import javax.swing.*;
import java.awt.*;

class PMGUI extends JFrame
{
    //Buttons
    JButton userdatalogins = new JButton("LOGINS");
    JButton userdatanotes = new JButton("PRIVATE NOTES");
    JButton userdatacreditcards = new JButton("CREDIT CARDS");
    JButton userdataidentities = new JButton("IDENTITIES");
    JButton userdatatrash = new JButton("TRASH");
    //Search BAR
    JTextField search = new JTextField("Search",10);

    PMGUI()
    {
        //Button set bounds
        userdatalogins.setBounds(10, 120, 173, 36);
        add(userdatalogins);
        userdatalogins.setForeground(Color.decode("#000000")); // Set text color
        userdatalogins.setBackground(Color.decode("#8B634E")); // Set background color
        userdatalogins.setFont(new Font("Inter", Font.BOLD, 12)); // Set font

        userdatanotes.setBounds(10, 166, 173, 36);
        add(userdatanotes);
        userdatanotes.setForeground(Color.decode("#000000")); // Set text color
        userdatanotes.setBackground(Color.decode("#8B634E")); // Set background color
        userdatanotes.setFont(new Font("Inter", Font.BOLD, 12)); // Set font

        userdatacreditcards.setBounds(10, 212, 173, 36);
        add(userdatacreditcards);
        userdatacreditcards.setForeground(Color.decode("#000000")); // Set text color
        userdatacreditcards.setBackground(Color.decode("#8B634E")); // Set background color
        userdatacreditcards.setFont(new Font("Inter", Font.BOLD, 12)); // Set font

        userdataidentities.setBounds(10, 258, 173, 36);
        add(userdataidentities);
        userdataidentities.setForeground(Color.decode("#000000")); // Set text color
        userdataidentities.setBackground(Color.decode("#8B634E")); // Set background color
        userdataidentities.setFont(new Font("Inter", Font.BOLD, 12)); // Set font

        userdatatrash.setBounds(10, 420, 173, 36);
        add(userdatatrash);
        userdatatrash.setForeground(Color.decode("#000000")); // Set text color
        userdatatrash.setBackground(Color.decode("#8B634E")); // Set background color
        userdatatrash.setFont(new Font("Sora", Font.BOLD, 12)); // Set font

        //Search SetBounds
        search.setBounds(210,14, 210, 36);
        add(search);

        //Background Colour
        getContentPane().setBackground(Color.decode("#FFFFFF"));
        setLayout(null);
        setSize(800,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set color and draw a rectangle
        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(2f)); // Set the line thickness
        g2d.drawLine(200, 0, 200, 500);
        g2d.drawLine(440, 0, 440, 500);
        g2d.drawLine(200, 90, 440, 90);

        // Set color and draw a rounded rectangle
        Graphics2D g1 = (Graphics2D) g;
        g1.setColor(Color.RED);
        g1.setStroke(new BasicStroke(2f));
        g1.setColor(Color.decode("#8B634E"));
    }


        public static void main(String args[])
        {
            PMGUI logui = new PMGUI();
        }
}