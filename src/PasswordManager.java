public class PasswordManager {

    public static void main(String[] args) {
        // Create an instance of the AppIntro class
        appintro intro = new appintro();

        // Display the app intro
        intro.setVisible(true);

        // Delay before showing the login GUI (in milliseconds)
        int delay = 2000; // Adjust the delay time as needed

        try {
            // Pause the execution for the specified delay
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the app intro window
        intro.dispose();

        // Create an instance of the LoginGUI class
        logingui loginGUI = new logingui();
        loginGUI.setVisible(true);
    }
}
