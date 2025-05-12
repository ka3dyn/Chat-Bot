import java.util.Scanner;

public class BotTester
{
    public static void main(String[] args) {

        //Put your code here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Whats your name:");
        String name = input.nextLine();
        
        Bot chatBot = new Bot(name);
        
        chatBot.greeting();
        chatBot.help();
        
         System.out.println("\nTell me Bot, which countries use the imperial system?");
        chatBot.imperialCountries();
        
        System.out.println("\nTell me Bot, what was the first computer bug?");
        chatBot.firstBug();
        
        
        chatBot.goodbye();
        
    }
}