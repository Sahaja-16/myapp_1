public class StringExample {
    public static void main(String[] args) {
        // Create a string
        String str = "Hello, Java World!";
        
        // Print the string
        System.out.println(str);
        
        // Get the length of the string
        System.out.println("Length: " + str.length());
        
        // Get a character at a specific index
        System.out.println("Character at index 7: " + str.charAt(7));
        
        // Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());
        
        // Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());
        
        // Check if the string contains a substring
        System.out.println("Contains 'Java'? " + str.contains("Java"));
        
        // Replace a substring
        String replaced = str.replace("Java", "World");
        System.out.println("After replace: " + replaced);
        
        // Concatenate two strings
        String newStr = str + " Let's code!";
        System.out.println("Concatenated: " + newStr);
        
        // Substring
        System.out.println("Substring (7, 11): " + str.substring(7, 11));
    }
}