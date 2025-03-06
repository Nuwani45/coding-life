// Java code for a simple unit converter.
import java.util.Scanner;
public class Converter{
      public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Unit Converter");
	    System.out.print("Choose an option: ");
            System.out.println("1. Meters to Kilometers");
	    System.out.println("2. Kilometers to Meters");
            System.out.println("3. Grams to Kilograms");
            System.out.println("4. Kilograms to Grams");
            System.out.println("5. Minutes to Hours");
	    System.out.println("6. Hours to Minutes");
            System.out.println("7. Exit");
         
            int choice = scanner.nextInt();
            
            if (choice == 7) {
                System.out.println("Exiting...");
                break;
            }
            
            System.out.print("Enter value to convert: ");
            double value = scanner.nextDouble();
            double result = 0;
            
            switch (choice) {
                case 1:
                    result = value / 1000;
                    System.out.println(value + " meters = " + result + " kilometers");
                    break;
                case 2:
                    result = value * 1000;
                    System.out.println(value + " kilometers = " + result + " meters");
                    break;
                case 3:
                    result = value / 1000;
                    System.out.println(value + " grams = " + result + " kilograms");
                    break;
		case 4:
                    result = value * 1000;
                    System.out.println(value + " kilograms = " + result + " grams");
                    break;
		case 5: 
                    result = value / 60;
                    System.out.println(value + " minutes = " + result + " hours");
                    break;
		case 6:
                    result = value * 60;
                    System.out.println(value + " hours = " + result + " minutes");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
	}
}
