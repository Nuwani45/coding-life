import java.util.Scanner;

public class MoodHabitTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Used to read input
        
        // Step 1: Get the user's mood
        System.out.println("Please enter your current mood (happy, sad, energetic, tired): ");
        String mood = scanner.nextLine().toLowerCase(); // Converts user input to lowercase if they enter in mixed format

        // Step 2: Display available habits
        System.out.println("Choose a habit to track:");
        System.out.println("1. Drink Water");
        System.out.println("2. Exercise");
        System.out.println("3. Study");
        System.out.println("4. Meditate");
        
        int habitChoice = scanner.nextInt(); // Reads and stores the habit choice
        scanner.nextLine();  // Consume the newline character after the number input

        String habit = getHabitName(habitChoice); // Calls getHabitName
        
        if (habit.equals("Invalid")) {
            System.out.println("Invalid habit choice."); // If it is invalid
            return;
        }

        // Step 3: Set a reminder time
        System.out.println("Set a reminder time (in 24-hour format, e.g., 8 for 8 AM, 15 for 3 PM): ");
        int reminderTime = scanner.nextInt(); // Time in 24-hour format
        
        // Format the reminder time to 12-hour format
        String formattedTime = formatTime(reminderTime);
        
        // Display personalized message based on mood
        String moodMessage = getMoodMessage(mood);
        
        // Step 4: Output summary of the setup
        System.out.println("\n--- Summary ---");
        System.out.println("Mood: " + mood);
        System.out.println("Habit to track: " + habit);
        System.out.println("Reminder set for: " + formattedTime); // Display formatted time (AM/PM)
        System.out.println("Mood-based suggestion: " + moodMessage);
    }

    // Method to get habit name
    public static String getHabitName(int choice) {
        switch (choice) {
            case 1: return "Drink Water";
            case 2: return "Exercise";
            case 3: return "Study";
            case 4: return "Meditate";
            default: return "Invalid"; // If the choice is invalid
        }
    }

    // Method to return a motivational message based on mood
    public static String getMoodMessage(String mood) {
        switch (mood) {
            case "happy": return "Keep up the positive energy! You're doing great!";
            case "sad": return "Take a break and relax, you've got this!";
            case "energetic": return "Let’s use that energy! Go exercise or meditate!";
            case "tired": return "Take it slow today, maybe just a small habit to start!";
            default: return "Stay positive, everything will get better!";
        }
    }

    // Method to format the time from 24-hour to 12-hour format with AM/PM
    public static String formatTime(int hour) {
        String period;  // Declare a variable to hold "AM" or "PM"
        
        // Determine if it's AM or PM
        if (hour >= 12) {
            period = "PM";  // If hour >= 12, it's PM
        } else {
            period = "AM";  // Otherwise, it's AM
        }
        
        int formattedHour;  // Declare a variable for the hour in 12-hour format
        
        // Convert hour to 12-hour format
        if (hour == 0) {
            formattedHour = 12;  // If hour is 0 (midnight), it's 12 AM
        } else if (hour > 12) {
            formattedHour = hour - 12;  // If hour is greater than 12, subtract 12 (e.g., 15 -> 3)
        } else {
            formattedHour = hour;  // Otherwise, the hour remains unchanged
        }

        // Return the formatted time with the period (AM/PM)
        return formattedHour + " " + period;
    }
}
