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
        int sumMax = 500;
        int sumDrNums = 0;
        int drawCount = 0;
        int tempDrawn = 0;

        RndMinMax rndMinMax = new RndMinMax();

        while (sumDrNums < sumMax) {
            tempDrawn = draw();
            sumDrNums += tempDrawn;
            drawCount++;

            if (drawCount == 1) {
                minNumber = tempDrawn;
                maxNumber = tempDrawn;
            }

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
