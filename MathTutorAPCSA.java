/*
* Math Tutor Project Main
* Vince Long
* Purpose: To solve 3 types of math problems by which the user chooses one of them
*/ 
import java.util.Scanner;
public class MathTutorAPCSA{

    public static void main(String []args){

        Scanner input = new Scanner(System.in);
        int choice = 0;
        boolean repeatQuestion = true;

        while(repeatQuestion){
         //Asks user what problem they want to solve
        System.out.println("\nWhat type of problem do you want to solve? (only provide the listed number)"+ "\n1. Area of a circle \n2. Area of a trapezoid \n3. Slope between 2 points");
        //checks if the user input is valid and if it is not, it will ask the user to try again
        if(input.hasNextInt()){
            choice = input.nextInt();
            //checks if the user input is a valid number option; if not it restarts again;
           if(choice <=3 && choice >=1){
            repeatQuestion = false;
           } else{
            System.out.println("\nThat's not a valid input, please try again");
           }
        }
        else {
            System.out.println("\nThat's not a valid input, please try again");
            input.nextLine();
        }
        }

        //Selects a problem to solve based on what the user inputs1
        if(choice == 1){
            //solves a circle area problem
            
            Circle.radiusAndCalculate(input);
        }   else if(choice == 2){
            //solves a trapezoid area problem
            Trapezoid.sidesAndCalculate(input);
        }   else if(choice == 3){
            //Solves a slope problem
            Slope.slopeCalculate(input);
        }   
        input.close();
    } 
    
}

 