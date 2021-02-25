import java.util.Scanner;
/**
 * Write a description of class JeffGrockowskiProject6 here.
 *
 * @author Jeff Grockowski
 * @version 10/10/2019
 */
public class JeffGrockowskiProject6
{
    /**
     * Program will run two tests:
     *      1. count the number of letters in a string
     *      2. search for a letter in a string
     *      
     * Program repeats with user input
     * 
     * 
     * 
     */
    public static int countLetters(String s){
        
        //iterate through each letter in the string
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (Character.isLetter(s.charAt(i))){
                count++;
            }
        }
        //returns the count after loop is completed
        return count;
    }
    
    public static int countLetters(String s, char c){
        //to prevent case mismatch, convert char input to uppercase and ensure it is a letter
        c = Character.toUpperCase(c);
        if (c < 'A' || c > 'Z')
            return -1;
        
        //convert string input to upper case to match char input, iterate through string 
        s = s.toUpperCase();
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            //add to count if target value is found is the string
            if(c == s.charAt(i))
                count++;
            }
        //return the count
        return count;
    }
    
    public static void main(String [] args){
        //create scanner for input / rerun variable
        Scanner input = new Scanner(System.in);
        char repeat, c;
        String s;

        System.out.println("This program will count your string first, then search a string for a character.");
        do {
            // read in user input for string and character
            System.out.println("Enter a String: ");
            s = input.nextLine();
            
            System.out.println("Enter a char: ");
            c = input.nextLine().charAt(0);
            
            //output methods for user 
            System.out.println("your string has " + countLetters(s));
            System.out.println("Your string contains the character " + c + ", " + countLetters(s,c) + " times.");
            
            //ask user to repeat if they want
            System.out.println("Would you like to run again?(y or n): ");
            repeat = input.nextLine().charAt(0);
            
        } while (repeat == 'Y' || repeat == 'y');
    }

}

/* Sample program output:
 * 
 *  This program will count your string first, then search a string for a character.
    Enter a String: 
    this is a test string
    Enter a char: 
    s
    your string has 17
    Your string contains the character s, 4 times.
    Would you like to run again?(y or n): 
    y
    Enter a String: 
    for the second run
    Enter a char: 
    r
    your string has 15
    Your string contains the character r, 2 times.
    Would you like to run again?(y or n): 
    n

 * 
 * 
 * 
 * /
 */
