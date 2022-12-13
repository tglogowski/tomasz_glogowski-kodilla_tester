import java.util.Random;

public class Test {
   static Random random = new Random();
    public static void main(String[] args){
        int max = 100;
        Test test = new  Test();
        System.out.println(test.getCountOfRandom(max));

    }
    private int getCountOfRandom(int max) {

        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(10);
            sum = sum + temp;
            result++;
        }
        return result;
    }

}
