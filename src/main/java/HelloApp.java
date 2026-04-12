public class HelloApp {
    public static void main(String[] args) {
        
        String names = "World"; // Default value [cite: 802]
        
        // Check if arguments are provided [cite: 785]
        if (args.length > 0) {
            // Efficiently join all arguments with a comma and space [cite: 787]
            names = String.join(", ", args);
        }
        
        // Display the final personalized or default greeting [cite: 788]
        System.out.println("Hello, " + names + "!");
    }
}