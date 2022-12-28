import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args) {
        int sumMax = 5000;
        int sumDrNums = 0;
        int drawCount = 0;
        int actMinNumb;
        int actMaxNumb;
        int tempDrawn = losuj();

        drawCount++;
        actMinNumb = checkMin(tempDrawn, tempDrawn);
        actMaxNumb = checkMax(tempDrawn, tempDrawn);


        while (sumDrNums < sumMax) {
            tempDrawn = losuj();
                sumDrNums += tempDrawn;
                actMinNumb = checkMin(tempDrawn, actMinNumb);
                actMaxNumb = checkMax(tempDrawn, actMaxNumb);
                drawCount++;
        }
        System.out.println("Wylosowano " + drawCount + " liczb.");
        System.out.println("Suma wszystkich wylosowanych liczb wynosi: " + sumDrNums + " przy progu sumy: " + sumMax);
        System.out.println("Najmniejszą wylosowaną liczbą jest: " + actMinNumb);
        System.out.println("Największą wylosowaną liczbą jest: " + actMaxNumb);
    }
    public static int losuj () {
        Random rnd = new Random();
        int result;
        return result = rnd.nextInt(31);
    }
    public static int checkMin ( int numToCheck, int actMinNumb){
        if (numToCheck < actMinNumb) {
            return numToCheck;
        }
        return actMinNumb;
    }
    public static int checkMax ( int numToCheck, int actMaxNumb){
        if (numToCheck > actMaxNumb) {
            return numToCheck;
        }
        return actMaxNumb;
    }
}
