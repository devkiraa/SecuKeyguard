import java.io.*;

public class UserData 
{
    private static final String FILE_PATH = "userdata.txt";

    public static void saveUserData(String email, String password) 
    {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_PATH))) 
        {
            writer.println(email);
            writer.println(password);
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }

    public static boolean checkUserData(String email, String password) 
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) 
        {
            String savedEmail = reader.readLine();
            String savedPassword = reader.readLine();
            return email.equals(savedEmail) && password.equals(savedPassword);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        return false;
    }
}
