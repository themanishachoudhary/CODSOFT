package codsoft_task;
import java.util.*;

public class codsofttask1 {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        boolean playagain = true;
        int totalscore =  0;
        int round = 1;
        int usernumber;
        
        while(playagain)
        {
            int mynumber = (int)(Math.random()*100)+1;
            int attempts = 0;
            int maxattempts = 10;
            boolean guessedcorrectly = false;

            System.out.println("Round"+round+": guess my number (1-100)");

            while(attempts < maxattempts)
            {
                System.out.println("Attempt"+(attempts + 1) + ": ");
                usernumber = sc.nextInt();
                attempts++;

                if(usernumber == mynumber)
                {
                    System.out.println("WWWWHHHHooo.....Correct number..! you do it");
                    guessedcorrectly = true;
                      // Score is based on remaining attempts plus one for the correct guess
                    totalscore += (maxattempts - attempts + 1);
                    break;
                }  else if(usernumber > mynumber) {
                    System.out.println("your number is too large");
                } else  {
                    System.out.println("your number is too small");
                }
            }
            
            if(!guessedcorrectly)
            {
                System.out.println("you've used all your attempts. Best luck for next time!");
            }

            System.out.println("my number was : "+ mynumber);

            System.out.println("Do you want to play another round? (yes/no): ");
            String response = sc.next();
            playagain = response.equalsIgnoreCase("yes");
            round++;
        }
           
        System.out.println("Game over! your total score is: "+ totalscore);
        sc.close();
        
    }
}
