import java.util.Random;

public class Loops {
    public static void main(String[] args) {
        String[] names = new String[]{"Zygfryd", "Gwidon", "Florentyna"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println();
        for (int j = names.length - 1; j >= 0; j--) {
            System.out.println(names[j]);
        }
        int[] numbers = new int[]{10, 20, 50, 100, 500, 2000};

        System.out.print("Suma wszytkich elementów tablicy wynosi: ");
        System.out.println(sumOfNumbers(numbers));

        int k = 1;
        while(k <= 10){
            System.out.println(k);
            k++;
        }
        int max = 10;
        System.out.println(getCountOfRandomNumber(max));
    }
        public static int sumOfNumbers(int[] numbers){

            int score = 0;

            for (int z = 0; z < numbers.length; z++) {
                score = score + numbers[z];
            }
            return score;
        }
        public static int getCountOfRandomNumber (int max){
             Random random = new Random();
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
