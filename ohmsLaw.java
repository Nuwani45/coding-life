import java.util.Scanner;
public class ohmsLaw{
    public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);	
		
		System.out.println("Welcome, today you are going to do calculations using Ohm's law:");
		System.out.println("Please select what you need to calculate:");
		System.out.print("1-Voltage, 2-Resistance, 3-Current: ");
		
		double law =scanner.nextDouble();
					
		if (law == 1){
			calVoltage(scanner);
			
        }else if (law == 2){
			calResistance(scanner);
			
		}else if (law == 3){
			calCurrent(scanner);
			
		}else{
			System.out.println("Invalid choice");
		}
		
		scanner.close();
	}
	static void calVoltage(Scanner scanner){
		System.out.println("Please enter Current:");
			     double Current=scanner.nextDouble();
			System.out.println("Please enter Resistance:");
			     double Resistance=scanner.nextDouble();
				 double voltageValue=voltage(Current,Resistance);
		    System.out.println("Voltage is "+voltageValue);
    }
	static void calResistance(Scanner scanner){
		System.out.println("Please enter Voltage:");
			     double voltage=scanner.nextDouble();
			 System.out.println("Please enter Current:");
			     double Current=scanner.nextDouble();
				 double ResistanceValue=Resistance(voltage,Current);
		     System.out.println("Resistance is "+ResistanceValue);
	}
	static void calCurrent(Scanner scanner){
		System.out.println("Please enter Voltage:");
			     double voltage=scanner.nextDouble();
			System.out.println("Please enter Resistance:");
			     double Resistance=scanner.nextDouble();
				 double CurrentValue=Current(voltage,Resistance);
		    System.out.println("Current is "+CurrentValue);
    }
    static double voltage(double Current, double Resistance) {
        return Current * Resistance;
    }

    static double Resistance(double voltage, double Current) {
        return voltage / Current;
    }

    static double Current(double voltage, double Resistance) {
        return voltage / Resistance;
    }
}