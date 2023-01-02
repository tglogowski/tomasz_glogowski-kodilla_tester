import java.util.Random;

public class RndMinMax {
    private int minNumber;
    private int maxNumber;
    Random rnd = new Random();

    public int getMinNumber() {
        return minNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void process() {
        int sumMax = 5000;
        int sumOfDrawn = 0;
        int tempDrawn;

        minNumber = 31;
        maxNumber = -1;

        while (sumOfDrawn < sumMax) {
            tempDrawn = rnd.nextInt(31);
            sumOfDrawn += tempDrawn;

            if (tempDrawn < minNumber) {
                minNumber = tempDrawn;
            }

            if (tempDrawn > maxNumber) {
                maxNumber = tempDrawn;
            }
        }
    }
}
