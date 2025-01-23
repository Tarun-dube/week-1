import java.util.Scanner;

public class SubstringCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string and substring from the user
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the substring to count: ");
        String substring = scanner.nextLine();

        // Count occurrences of the substring
        int count = countOccurrences(mainString, substring);

        System.out.println("The substring '" + substring + "' occurs " + count + " time(s) in the main string.");

        scanner.close();
    }

    /**
     * Counts the number of times a substring occurs in a string.
     *
     * @param mainString The string in which to search for the substring.
     * @param substring  The substring to count.
     * @return The number of occurrences of the substring in the main string.
     */
    public static int countOccurrences(String mainString, String substring) {
        if (mainString == null || substring == null || mainString.isEmpty() || substring.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        // Use indexOf to find each occurrence of the substring
        while ((index = mainString.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length(); // Move the index forward to avoid counting overlapping substrings
        }

        return count;
    }
}
