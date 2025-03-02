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
