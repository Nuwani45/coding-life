import java.util.Scanner;

public class Chatbuddy{
	public static void main (String[]args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Chatbuddy: Hello, I'm your chatbot. type 'exit' to end chat.");
		System.out.print("Chatbuddy: what's your name?");
		
		String userName = scanner.nextLine();
		
		while (true){
			System.out.print(userName +": ");
			String userInput = scanner.nextLine();
			
			if (userInput.contains("hi")) {
				System.out.println("Chatbuddy:Hey!" +userName+  " whats up?");
			}else if (userInput.contains("I'm fine, thank you")){
                System.out.println("Chatbuddy:Glad to hear that,Need any help?");
            }else if (userInput.contains("yes")){
               System.out.println("Chatbuddy:what is it?");
			}else if (userInput.contains("I want to perform calculations.")){
               System.out.println("Chatbuddy:Yes, Select operation:");
               System.out.println("1 - Addition");
               System.out.println("2 - Subtraction");
               System.out.println("3 - Multiplication");
               System.out.println("4 - Division");
			   
			   int choice = scanner.nextInt();

                    System.out.print("Enter first number: ");
					double num1 = scanner.nextDouble();

					System.out.print("Enter second number: ");
					double num2 = scanner.nextDouble();
					
					scanner.nextLine();

					if (choice == 1) {
						System.out.println("Result: " + (num1 + num2));
					} else if (choice == 2) {
						System.out.println("Result: " + (num1 - num2));
					} else if (choice == 3) {
						System.out.println("Result: " + (num1 * num2));
					} else if (choice == 4) {
						System.out.println("Result: " + (num1 / num2));
					} else {
						System.out.println("Invalid choice");
					}
            
			}else if (userInput.contains("bye")){
               System.out.println("Chatbuddy:Goodbye! have a nice day.");
			}else if (userInput.contains("exit")){
               System.out.println("Chatbuddy:Chat ended. See you soon!");				
			   break;
			}else{
				System.out.println("Chatbuddy:Sorry, i didnt understand that.");
			}
        }
		scanner.close();
	}
}	