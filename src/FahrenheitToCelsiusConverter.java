import java.util.Scanner;

public class FahrenheitToCelsiusConverter {
    public static void main(String[] args) {
        System.out.print("Indtast Fahrenheit: ");
        Scanner input = new Scanner(System.in);
        double fahrenheit = input.nextDouble();
        double celsiusRes = (5.0/9) * (fahrenheit - 32);
        System.out.println("Fahrenheit valgt: " + fahrenheit);
        System.out.println(fahrenheit + " fahrenheit i celsius er " + celsiusRes + " grader!");
    }
}
