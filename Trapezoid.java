/*
* Math Tutor Project: Trapezoid
* Vince Long
* Purpose: To solve area of a trapezoid using user input
* Resource: Java documentation
*/ 
import java.util.Scanner;
public class Trapezoid {
private static double base1 = 0;
private static double base2 = 0;
private static double height = 0;
    public static  void sidesAndCalculate(Scanner input){
boolean check2 = true;

System.out.println("Thank you for choosing to calculate the area of a trapezoid.");

//Repeats the prompt over and over until user inputs a valid input
while(check2){
System.out.println("What should be the top base of the trapezoid? ");
if (input.hasNextDouble()){
 base1 = input.nextDouble();
check2 = false;
} else{
    System.out.println("That's not a valid input, please try again");
    input.nextLine();
}
}
//Repeats the prompt over and over until user inputs a valid input
 check2 = true;
while(check2){
System.out.println("What should be the bottom base of the trapezoid? ");
if (input.hasNextDouble()){
 base2 = input.nextDouble();
check2 = false;
} else{
    System.out.println("That's not a valid input, please try again");
    input.nextLine();

}
}
//Repeats the prompt over and over until user inputs a valid input
check2 = true;
while(check2){
System.out.println("What should be the height of the trapezoid? ");
if (input.hasNextDouble()){
 height = input.nextDouble();
check2 = false;
} else{
    System.out.println("That's not a valid input, please try again");
    input.nextLine();
}
}
System.out.println("The area of your trapezoid using the formula (b1 + b2)/2 * h is " + (base1 + base2)/2 * height + " units squared");
    }
}