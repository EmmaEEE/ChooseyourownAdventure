/*
 * Emma Elliott
March 6, 2020
Choose your own adventure project
 */
package chooseyourownadventure;

import java.util.Scanner;
/**
 *
 * @author gregelliott
 */
public class ChooseyourownAdventure {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyedInput= new Scanner(System.in);
    
      
        System.out.println("You are going on vacation for 5 days and must decide what kind of vacation you would like to lead");
        
        System.out.println("Would you like to go on vacation to Switzerland or France?");
        Scanner scanner = new Scanner(System. in);
        String response1String = scanner. nextLine();
       
               
        if (response1String.equals("Switzerland"))
        {
            System.out.println("You want to go skiing in the Alps, however there is an avalanche warning. Do you want to go skiing anyways?");
            String response2String = scanner. nextLine();
           
            if (response2String.equals("yes"))
            {
                System.out.println("There are lots of people on the ski hills and it seems safe. You now have to choose if you want to go backcountry skiiing, down an easy green circle hill or down the black diamond hill. Input either Backcountry, Green or Black as your choice.");
                String response3String = scanner. nextLine();
                
                if (response3String.equals("Backcountry"))
                {
                    System.out.println("There is a big avalanche and you become trapped. Would you like to restart?");
                    String response4String = scanner. nextLine();
                    
                    if(response4String.equals("yes"))
                    {
                        System.out.println("Restart");
                    }
                    else
                    {
                        System.out.println("End of Game");
                    }
                }
                else if (response3String.equals("Black"))
                {
                    System.out.println("There are many difficult parts on the hill but you reach the bottom. Would you like to do another run?");
                }
                else 
                {
                    System.out.println("You safely reach the bottom of the hill. Would you like to do another run?");
                }
            }
            
            else
            {
                System.out.println("You return to your hotel and have a nice hot chocolate. The rest of your vacation is lots of fun!");
            }
        }
        
        else
        {
            System.out.println("You decide to go explore the city and it's many attractions. Would you like to visit the Eiffel Tower?");
            String response5String = scanner. nextLine();
            
            if (response5String.equals("yes"))
            {
                System.out.println("There is a huge line and you must wait for hours. Do you still want to climb it?");
                String response6String = scanner. nextLine();
                
                if (response6String.equals("yes"))
                {
                    System.out.println("When you reach the top you realise the views are worth it. Do you want to go out for lunch now?");
                    String response7String = scanner. nextLine();
                    
                    if (response7String.equals("yes"))
                    {
                        System.out.println("You decide to instead go for a nice lunch in a cafe. Would you like to order a steak or a baguette?");
                        String response8String = scanner. nextLine();
                        
                        if (response8String.equals("baguette"))
                        {
                            System.out.println("It is the best meal yoou've had in a long time and you return to your hotel in a great mood");
                        }
                        else
                        {
                           System.out.println("You become very sick from food poisoining. Would you like to restart?");
                           String response9String = scanner. nextLine();
                           
                           if (response9String.equals("yes"))
                           {
                               System.out.println("Restart");
                           }
                           else
                           {
                               System.out.println("End game");
                           }
                        }
                    }
                    else
                    {
                        System.out.println("You go home");
                    }
                }
                else
                {
                    System.out.println("You go home");
                }
            }
            else 
            {
              System.out.println("You find some other fun attraction. Would you like to restart?");
              String response10String = scanner. nextLine();
              
              if (response10String.equals("yes"))
              {
                  System.out.println("Restart");
              }
              else
              {
                  System.out.println("End game");
              }
            }
        }
        
        // TODO code application logic here
    }
    
}
