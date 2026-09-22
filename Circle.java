import java.util.Scanner;
/*
* Math Tutor Project: Circle
* Vince Long
* Purpose: To solve area of a circle using user input
* Resource: Java documentation
*/ 
public class Circle {
private static double radius = 0;    

public static void radiusAndCalculate(Scanner input){
boolean check1 = true;
 System.out.println("Thank you for choosing to calculate the area of a circle.");
 //Repeats the prompt over and over until user inputs a valid input
while(check1){
 System.out.println("What should the radius of the circle be? ");
if (input.hasNextDouble()){
  radius = input.nextDouble();
  check1 = false;
}
else{
    System.out.println("That's not a valid input, please try again");
    input.nextLine();
}
}
 System.out.println("The area of your chosen circle using the formula pi * r^2 with your radius " +radius + " is " + (Math.pow(radius,2)*Math.PI) + " units squared");

}

}
