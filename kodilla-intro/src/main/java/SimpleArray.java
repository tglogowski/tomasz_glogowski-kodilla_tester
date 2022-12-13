public class SimpleArray {
    public static void main(String[] args){
        String[] fruits = new String[5];

        fruits[0] = "apple";
        fruits[1] = "orange";
        fruits[2] = "banana";
        fruits[3] = "strawberry";
        fruits[4] = "pineapple";

        String fruitToEat = fruits[3];
        System.out.println(fruitToEat);

        int numberOfElem = fruits.length;
        System.out.print("Moja tablica zawiera ");
        System.out.print(numberOfElem);
        System.out.print(" elementów");
    }
}
