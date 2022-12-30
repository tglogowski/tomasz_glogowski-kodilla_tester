import java.util.Random;

public class RndMinMax {
    private int minNumber;
    private int maxNumber;

    public int getMinNumber() {
        return minNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void process() {
        int sumMax = 5000;
        int sumDrNums = 0;
        int tempDrawn = 0;

        RndMinMax rndMinMax = new RndMinMax();

        minNumber = 31;
        maxNumber = -1;

        while (sumDrNums < sumMax) {
            tempDrawn = draw();
            sumDrNums += tempDrawn;

            if (tempDrawn < minNumber) {
                minNumber = tempDrawn;
            }

            if (tempDrawn > maxNumber) {
                maxNumber = tempDrawn;
            }
        }
    }
    private static int draw() {
        Random rnd = new Random();
        int result;
        return result = rnd.nextInt(31);
    }
}
