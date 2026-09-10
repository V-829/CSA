import java.util.Scanner;

public class MathTutorAPCSA{

    public static void main(String []args){

        Scanner input = new Scanner(System.in);
        System.out.println("\nWhat type of problem do you want to solve? (only provide the listed number)"+ "\n1. Area of a circle \n2. Area of a trapezoid \n3. Slope between 2 points");
        int choice = input.nextInt();
        if(choice == 1){
            Circle area = new Circle();
            area.radiusAndCalculate(input);
        }   else if(choice == 2){
            
        }   else if(choice == 3){
            
        }   else{
            System.out.println("That is not a valid option, please try again by rerunning the program.");
        }
        input.close();
    } 
    
}

 class Circle{

public void radiusAndCalculate(Scanner input){
 System.out.println("Thank you for choosing to calculate the area of a circle.");
 System.out.println("What should the radius of the circle be? ");
 double radius = input.nextDouble();

 System.out.println("The area of your chosen circle" + " using your radius " +radius + " is " + (radius * radius *Math.PI));
}

}