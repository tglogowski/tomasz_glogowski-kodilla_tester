import java.util.Scanner;

public class GuessTheColor {

    public static String getColour() {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the colour first letter: ");
            String colour = scanner.nextLine().trim();
            switch (colour) {
                case "w": return "White";
                case "b": return "Black";
                case "r": return "Red";
                case "g": return "Green";
                default:
                    System.out.println("I don't recognize your selection. Try again.");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Your colour is: " + getColour());
    }
}
