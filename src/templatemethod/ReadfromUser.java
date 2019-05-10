package templatemethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadfromUser extends BookReader {

    Scanner userInput = new Scanner(System.in);
    List<String> userText = new ArrayList();

    @Override
    void initialize() {
        System.out.println("Type whatever you want, you amazing author!\n");
        System.out.print("Please enter how many lines you'd like to write: ");
        try
        {
            int numOfLines = userInput.nextInt();
            userInput.nextLine();
            System.out.println("\n");
            for(int i = 0; i < numOfLines; i++)
            {
                String userLine = userInput.nextLine();
                userText.add(userLine);
            }
        }catch(Exception e)
        {
            System.out.println("\n=========================");
            System.out.println("Enter a number ya goof!");
            System.out.println("=========================\n");

            
        }
    }

    @Override
    void startReading() {
        System.out.println("\n\nPress enter when you're ready to see your lovely text:");
        userInput.nextLine();
        for(int i = 0; i < userText.size(); i++)
        {
            System.out.println(userText.get(i));
        }
    }

    @Override
    void stopReading() {
    }
}
