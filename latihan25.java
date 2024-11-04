import java.util.Scanner;

public class latihan25 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input their first name
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        String name = scanner.nextLine();

        // Spell out the name
        System.out.println("Ejaan untuk \"" + name + "\" adalah :");

        // Loop through each letter in the name and print its position
        for (int i = 0; i < name.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + name.charAt(i));
        }

        // Close the scanner object
        scanner.close();
    }
}
