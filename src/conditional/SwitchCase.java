package conditional;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
	      // score (0-100)
	      String grade = null;
	      System.out.print("Enter a number: ");  
	      Scanner sc = new Scanner(System.in); 
	      int score = sc.nextInt(); // Taking value from user at run time 
	 
	      switch(score/10) 
	      {
	        // for >= 90
	        case 10:
	        case 9:
	           grade = "A";
	           break;
	        // for >= 80 and <90
	        case 8:
	           grade = "B";
	           break;
	        // for >= 70 and <80
	        case 7:
	           grade = "C";
	           break;
	        // for >= 60 and <70
	        case 6:
	           grade = "D";
	           break;
	        // for >= 50 and <60
	        case 5:
	           grade = "E";
	           break;
	        // for < 50
	        default:
	           grade = "F";
	           break;
	      }
	      
	      // displaying result...
	      System.out.println("Your Grade is  = " + grade);
	   }
}
