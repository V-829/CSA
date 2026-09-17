/*
* Math Tutor Project: slope
* Vince Long
* Purpose: To solve slope between 2 points using user input
*/ 
import java.util.Scanner;
public class Slope {
    private static double x1 = 0;
    private static double x2 = 0; 
    private static double y1 = 0;
    private static double y2 = 0;
 public static void slopeCalculate(Scanner input){
boolean check3 = true;
System.out.println("Thank you for choosing to calculate the slope between 2 points.");

while(check3){
System.out.println("What should be your first y coordinate? ");
if (input.hasNextDouble()){
 y1 = input.nextDouble();
check3 = false;
} else{
    System.out.println("That's not a valid input, please try again");
    input.nextLine();
}
}

 check3 = true;
System.out.println("What should be your second y coordinate? ");
while(check3){
if (input.hasNextDouble()){
 y2 = input.nextDouble();
check3 = false;
} else{
    System.out.println("That's not a valid input, please try again");
    input.nextLine();

}
}

check3 = true;
System.out.println("What should be your first x coordinate? ");
while(check3){
if (input.hasNextDouble()){
 x1 = input.nextDouble();
check3 = false;
} else{
    System.out.println("That's not a valid input, please try again");
    input.nextLine();
}
}

check3 = true;
System.out.println("What should be your second x coordinate? ");
while(check3){
if (input.hasNextDouble()){
 x2 = input.nextDouble();
check3 = false;
} else{
    System.out.println("That's not a valid input, please try again");
    input.nextLine();
}
}
System.out.println("The slope of your two points using the formula (y1-y2)/(x1-x2) with your coordinates (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is " + ((y2-y1)/(x2-x1)));
 }

}