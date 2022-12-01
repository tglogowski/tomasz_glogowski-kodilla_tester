public class MainExtended {
    public static void main(String[] args) {
        String msgRecArea = "Pole prostokąta wynosi: ";
        int recHeight = 12;
        int recLength = 25;
        int recArea = recHeight * recLength;
        double piValue = 3.1415927;
        boolean isPiValueOK = true;
        char lastLetter = 'Z';

        System.out.println("Długość prostokąta:");
        System.out.println(recLength);
        System.out.println("Wysokość prostokąta:");
        System.out.println(recHeight);
        System.out.println(msgRecArea);
        System.out.println(recArea);
        System.out.println("");

        System.out.println(piValue);
        System.out.println("Czy to liczba pi?");
        System.out.println(isPiValueOK);
        System.out.println("");

        System.out.println("Ostatnia litera alfabetu to:");
        System.out.println(lastLetter);
    }
}
