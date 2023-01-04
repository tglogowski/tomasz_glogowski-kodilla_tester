import java.util.Random;

public class RndMinMax {

    private static final Random RANDOM = new Random();
    private static final int MAX_SUM = 5000;
    private static final int MAX_RANDOM_NUMBER = 31;
    private static final int MAX_INIT_VALUE = -1;
    private static final int MIN_INIT_VALUE = 31;

    private int minNumber;
    private int maxNumber;


    public int getMinNumber() {
        return minNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void process() {
        int sum = 0;
        int randomNumber;

        minNumber = MIN_INIT_VALUE;
        maxNumber = MAX_INIT_VALUE;

        while (sum < MAX_SUM) {
            randomNumber = RANDOM.nextInt(MAX_RANDOM_NUMBER);
            sum += randomNumber;

            if (randomNumber < minNumber) {
                minNumber = randomNumber;
            }

            if (randomNumber > maxNumber) {
                maxNumber = randomNumber;
            }
        }
    }
}
