
package firstprogram;

import java.util.Scanner;


public class FirstProgram {
        
    public static void main(String[] args) {
        
        Scanner scan= new Scanner (System.in);
        System.out.println("Enter first number");
        double dl = scan.nextDouble();
        
        System.out.println("Enter second number");
        double dl2 = scan.nextDouble();
            
        String prompt ="Enter 1 for addition ,2 for substraction ,3 for multiplication "
                + ",4 for division";
        
        System.out.println(prompt);
        
        int in =scan.nextInt();
        switch(in){
            case 1:
                System.out.println("Adding your numbers");
                System.out.println(dl + dl2);
                break;
            case 2:
                System.out.println("Substracting your numbers");
                System.out.println(dl - dl2);
                break;
            case 3:
                System.out.println("Multiplying your numbers");
                System.out.println(dl * dl2);
                break;
            case 4:
                System.out.println("Dividing your numbers");
                System.out.println(dl / dl2);
                break;
            default :
                System.out.println("Invalid input");
        }
          
        }
        
    
    }

    
    

