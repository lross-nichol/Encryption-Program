package encryptionprogram;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptionProgram {

    public static void main(String[] args) 
    {
     //create a new Scanner object to capture user input 
        Scanner input = new Scanner(System.in); 
         
        //build an array containing each letter of the alphabet 
        char [] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
 
        //prompt the user to enter a message
        System.out.println("Please enter a message to encrypt"); 
         
        //store the user's message into a string variable 
        String message = input.nextLine(); 
         
        //process the user input to remove white space and change all letters to lowercase 
     
         
        //get the length of the message as an int 
        int messageSize = message.length(); 
         
        //loop through the message getting each character in turn 
        for (int i = 0; i<messageSize; i++) 
        { 
            //get each character in turn 
            char letter = message.charAt(i); 
             
            //if the character is a space 
            if (letter == ' ') 
            { 
                System.out.print("!"); 
            } 
            else 
            { 
                //search for the character within the alphabet array and return the position within the alphabet 
                int position = Arrays.binarySearch(letters, letter); 
                 
                
                 
                //find the letter from the alphabet array at the given position 
                
                if (position == 0 || position == 4 || position == 8 || position == 14 || position == 20)
                {
                //change the position 
                position = ((position + 26) + 10) % 26;     
                }
                else
                {
                position = ((position + 26) + 17) % 26;
                }
                
                    
                    System.out.print(letters[position]);
            }
    }
    }
    
}
