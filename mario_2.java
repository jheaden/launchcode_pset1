
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class mario {
		
	static boolean validateRange(int x) {	
		if((x > 0) && (x < 24)) {
			//mario(x);
			return true;
		} else {
			return false;
		}
	}
	
	static void mario(int n) {
        /*
         * Write your code here.
         */
    		int i = n+1; //length of the array
		char[] charArray;
		charArray = new char[i];
		
		//initialize the array
		// put 2 hashes into charArray
    		for(int x = 0; x < i ; x++ ) {
    			charArray[x] = '_';
    		}
    		
    		//end the array with two hashes
    		charArray[n] = '#';
    		charArray[n-1] = '#';
    			
    		// print out the first line
    		for(char element : charArray) {   	
    			System.out.print(element + " ");
    		}
    		System.out.print("\n");
    		
    		//start making changes 
    		for(int h = n-2 ; h >= 0 ; h--) {
    			charArray[h] = '#';
    			
    			//print what's happening
        		for(char element : charArray) {   
        			System.out.print(element + " ");	
        		}
        		System.out.print("\n");
    		}
    		
    	  		
    }// end mario

//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
     // prompt for a valid integer between 0 and 23        
    	   Scanner input = new Scanner(System.in);
    	   int number = 0;
    	   boolean isNumber = false;
    	   
    	   do {   	   
    		   System.out.print("Enter a number between 1 and 23, inclusive: ");
    		   
    		   if(input.hasNextInt()) {
    			   number = input.nextInt();
    			   isNumber = validateRange(number);
    			  // isNumber = true;
    		   } else {
    			   System.out.println("That's not right.");
    			   isNumber = false;
    			   input.next();
    		   }// end else
    	   } while (!(isNumber));
  		   
            //MADE IT!!!
            mario(number);
    	   
    	
    }// end main
}
