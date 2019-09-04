
/**
 * This program prompts the user to enter a score between 1-100 then prints a corresponding
 * letter grade. Part 1 uses if else statements and will print an error message for out of bounds entries and close the program.
 * Part 2 uses switch statements and will prompt the user to enter a score again if out of bounds.
 * @Cat Schnelle
 * 
 */
import java.util.Scanner;
public class CatherineSchnelle_Project03
{
    public int score; //declare score
    
    public static void main(String[] args)
    {
      
      Scanner console = new Scanner(System.in); //user input
      
      System.out.print("Enter your score (0--100):"); //prompt
      
      int score = console.nextInt(); //sets input as score
      /**
           if(score > 100 || score < 1) 
            {
                System.out.println("Error: not a valid number between 1-100."); //error message 
                System.exit(1); //program quits                        
            }
            if(score >= 90 && score <=100) //score between 90-100 prints grade A
            {
                System.out.println("Your grade is: A");
            }
            else if(score >80 && score < 90) //score between 80-89 prints grade B
            {
                System.out.println("Your grade is: B");
            }
            else if(score >= 70 && score < 80) //score between 70-79 prints grade C
            {
                System.out.println("Your Grade is: C");
            }
            else if(score <70) //score less than 70 prints F
            {
                System.out.println("Your grade is: F");
            }
       */ 
      
      switch(score /10)
      {
          case 9: 
          case 10: System.out.println("Your grade is:A");
          break;
          case 8: System.out.println("Your grade is:B");
          break;
          case 7: System.out.println("Your grade is:C");
          break;
          case 6:
          case 5:
          case 4:
          case 3:
          case 2:
          case 1:
          System.out.println("Your grade is:F");
          break;
          default:System.out.println("Enter your score (1--100):"); //if score out of bounds, prompts user to enter score
      }
  }
}
