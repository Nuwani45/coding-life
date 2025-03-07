import java.util.Scanner;

public class VehicleTaxCalculator { //main class
    
    //main method
    public static double calculateTax(int capacity, int year, String vehicleType, String fuelType, double price) { 
        double baseTaxRate = 0.0;//used double type so that the final answer is also received in decimal
        double fuelTax = 0.0;
        double ageDepreciation = 0.0;
        double importDutyRate = 0.2; 

       // initialising baseTaxRate based on the vehicleType
        if (vehicleType.equalsIgnoreCase("car")) {//ignores the upper and lower case user inpput
            baseTaxRate = 0.15; 
        } else if (vehicleType.equalsIgnoreCase("bike")) {
            baseTaxRate = 0.08; 
        } else if (vehicleType.equalsIgnoreCase("truck")) {
            baseTaxRate = 0.20; 
            baseTaxRate = 0.12; 
        }
    
        if (capacity < 1000) {
            baseTaxRate += 0.05; 
        } else if (capacity >= 1000 && capacity <= 2000) {
            baseTaxRate += 0.10; 
        } else {
            baseTaxRate += 0.15; 
        }

       
        if (fuelType.equalsIgnoreCase("petrol")) {
            fuelTax = 0.10; 
        } else if (fuelType.equalsIgnoreCase("diesel")) {
            fuelTax = 0.12; 
        } else if (fuelType.equalsIgnoreCase("electric")) {
            fuelTax = -0.05; 
        } else if (fuelType.equalsIgnoreCase("hybrid")) {
            fuelTax = 0.05; 
        } else {
            fuelTax = 0.0; 
        }

        
        int currentYear = 2025; 
        int vehicleAge = currentYear - year;

        if (vehicleAge > 10) {
            ageDepreciation = 0.50; 
        } else if (vehicleAge > 5) {
            ageDepreciation = 0.30; 
        } else if (vehicleAge > 3) {
            ageDepreciation = 0.10; 
        } else {
            ageDepreciation = 0.0; 
        }

      
        double taxRate = baseTaxRate + fuelTax - ageDepreciation;
        if (taxRate < 0) taxRate = 0; 

        double importDuty = price * importDutyRate;
        double totalTax = (price* taxRate) + importDuty;

        return totalTax;
    }
     //second method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //getting the users input from the keyboard
        System.out.print("Enter Engine Capacity (CC): ");
        int capacity = scanner.nextInt();

        System.out.print("Enter Manufacturing Year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Vehicle Type (Car/Bike/Truck/Other): ");
        String vehicleType = scanner.nextLine();

        System.out.print("Enter Fuel Type (Petrol/Diesel/Electric/Hybrid): ");
        String fuelType = scanner.nextLine();

        System.out.print("Enter FOB (Freight on Board) Price: ");
        double price = scanner.nextDouble();

        //calling the totalTax variable
        double totalTax = calculateTax(capacity, year, vehicleType, fuelType, price);

    
        System.out.println("\n=============================");
        System.out.println("Vehicle Tax Calculation");
        System.out.println("=============================");
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Engine Capacity: " + capacity + " CC");
        System.out.println("Manufacturing Year: " + year);
        System.out.println("FOB Price: $" + price);
        System.out.println("Total Tax: $" + totalTax);
		System.out.println("Total price: $" +(price + totalTax));
		System.out.println("Total price in SL: LKR" +((price + totalTax)*295));//total price in sri lankan ruppees
        System.out.println("=============================");

        scanner.close();
    }
}
