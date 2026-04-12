
public class HelloApp {
    public static void main(String[] args) {
        
        // If no arguments are provided, app sets greeting to "Hello, World!"
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            
            // Iterate through args using an enhanced for loop
            for (String name : args) {
                // Always append the same delimiter after each name, including the last one
                nameBuilder.append(name).append(", ");
            }
            
            String finalNames = "";
            // Check nameBuilder.length() > 0 before calling substring() to avoid errors
            if (nameBuilder.length() > 0) {
                // Extract all characters except the last two (the trailing ", ")
                finalNames = nameBuilder.substring(0, nameBuilder.length() - 2); 
            }
            
            // App prints the greeting: "Hello, <names>!"
            System.out.println("Hello, " + finalNames + "!");
        }
    }
}