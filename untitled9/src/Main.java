import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your height (m): ");
        double height = scan.nextDouble();
        System.out.println("Enter your weight (kg): ");
        double weight = scan.nextDouble();

        double BMI = weight / (height*height);
        System.out.println("Your BMI: " + BMI);

        if (BMI < 18.5) {
            System.out.println("Underweight");
        }
        else if ((18.5<BMI) && (BMI<24.9)) {
            System.out.println("Normal weight");
        }
        else if ((25<BMI) && (BMI<29.9)) {
            System.out.println("Overweight");
        }
        else if (BMI>=30) {
            System.out.println("Obesity");
        }
        else {
            System.out.println("Wrong");
        }
    }

}