import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj rok: ");
        int yearToCheck = scanner.nextInt();
        boolean isLeap = false;q

            if (yearToCheck%4 == 0 && yearToCheck%100 == 0 && yearToCheck%400 == 0){
                isLeap = true;
            } else if (yearToCheck%4 == 0 && yearToCheck%100 != 0){
            isLeap = true;
            }

            if (isLeap == true){
                System.out.print("Rok ");
                System.out.print(yearToCheck);
                System.out.println(" jest przestępny.");
            } else {
                System.out.print("Rok ");
                System.out.print(yearToCheck);
                System.out.println(" nie jest przestępny.");
            }
    }
}

