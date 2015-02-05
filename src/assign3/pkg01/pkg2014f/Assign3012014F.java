package assign3.pkg01.pkg2014f;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author <ENTER YOUR NAME HERE>
 */
public class Assign3012014F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* =============================== *
         * DO NOT CHANGE THIS METHOD       *
         * Make changes in the sub-methods *
         * named for each exercise.        *
         * =============================== */
        int choice;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Which exercise would you like to run? [1,2,3] (0 to Exit)");
            choice = in.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Okay, goodbye!");
                    break;
                case 1:
                    doExercise1();
                    break;
                case 2:
                    doExercise2();
                    break;
                case 3:
                    doExercise3();
                    break;                
                default:
                    System.out.println("That is not a valid choice.");
                    break;
            }
        } while (choice != 0);
    }

    /* Exercise #1 - I/O Decisions
     * 
     * 1. Prompt the user for a number between 1-10.
     * 2. Store the number in an integer variable.
     * 3. If the number is over ten, output "That's too high!"
     * 4. If the number is under one, output "That's too low!"
     * 5. If the number is seven, output "Lucky number seven!"
     * 6. Otherwise, output "Thank you!"
     */
    public static void doExercise1() {
        // TODO: Complete Exercise #1 Below
         Scanner in=new Scanner(System.in);
        
        
        System.out.println("enter a number between one and ten");
        int number=in.nextInt();
        if(number>10)
        {
            System.out.println("That's too high!");
            
        }
        else if(number<1)
                {
                   System.out.println("That's too low!"); 
                }
        else if(number==7)
        {
            System.out.println("Lucky number seven!");
        }
        else
        {
            System.out.println("Thank you!");
        }
        
    }
        
    

    /* Exercise #2 - Nested Logic
     *
     * 1. Prompt the user for a letter and a number.
     * 2. Store the letter in a character variable, and the number as an integer.
     * 3. If the number is greater than or equal to one, and the number is
     *      less than or equal to 26, continue the program. Otherwise, 
     *      output "Please pick a number between 1-26." and end the program.
     * 4. Create two new integer variables called lowerNum and upperNum.
     * 5. Give lowerNum the value of (number + 'a' - 1).
     * 6. Give upperNum the value of (number + 'A' - 1).
     * 7. If lowerNum equals letter, or upperNum equals letter, then output
     *      "That's the right number/letter." Otherwise, output "Try again."
     */
    public static void doExercise2() {
        // TODO: Complete Exercise #2 Below
        Scanner in=new Scanner(System.in);
        System.out.println("enter a letter");
        char letter=in.next().charAt(0);
        
        
        System.out.println("enter a number");
        int num=in.nextInt();
        if(num>=1 && num<=26)
        {
            
           
           int lowerNum=num+'a'-1;
           int upperNum=num+'A'-1;
            
           if(lowerNum==letter || upperNum==letter)
            {
               
                System.out.println("That's the right number/letter.");
            }
            else
            {
                System.out.println("Try again.");
            }
        }
        else
        {
            System.out.println("Please pick a number between 1-26.");
        }
    }

    /* Exercise #3 - Output Formatting
     *
     * 1. Prompt the user for a price.
     * 2. Store the price as a double variable.
     * 3. Calculate and store the amount of taxes as price * 0.13.
     * 4. Calculate and store the total as price + taxes.
     * 5. Output on one line: "Taxes: $x.xx Total: $y.yy" where $x.xx is the
     *      amount of taxes to two decimal places, and $y.yy is the total
     *      price to two decimal places.
     */
    public static void doExercise3() {
        // TODO: Complete Exercise #3 Below
         Scanner in=new Scanner(System.in);
        System.out.println("please enter the price:");
        double price=in.nextDouble();
        double tax=price*.13;
        double total=price+tax;
        DecimalFormat dec= new DecimalFormat("#.00");
   
     System.out.println("taxes: $" +dec.format(tax)+ "Total: $" +dec.format(total));
     
    }
}
