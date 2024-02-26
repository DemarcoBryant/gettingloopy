import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperature;
        char choice;
        do {
            System.out.print("Enter a temperature value: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next();
            }
            temperature = scanner.nextDouble();
            System.out.print("Convert to Fahrenheit (F) or Celsius (C)? Enter 'F' or 'C': ");
            choice = scanner.next().charAt(0);
            if (choice == 'F' || choice == 'f') {
                double fahrenheit = celsiusToFahrenheit(temperature);
                System.out.println("Converted temperature: " + fahrenheit + " °F");
            } else if (choice == 'C' || choice == 'c') {
                double celsius = fahrenheitToCelsius(temperature);
                System.out.println("Converted temperature: " + celsius + " °C");
            } else {
                System.out.println("Invalid choice! Please enter 'F' or 'C'.");
            }
            System.out.print("Do you want to convert another temperature? (Y/N): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');
        System.out.println("Thank you for using the temperature converter!");
    }
    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}