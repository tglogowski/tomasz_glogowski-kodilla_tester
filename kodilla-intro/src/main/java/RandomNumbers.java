public class RandomNumbers {
    public static void main(String[] args) {

        RndMinMax rndMinMax = new RndMinMax();

        rndMinMax.process();

        System.out.println("The smallest drawn number :" + rndMinMax.getMinNumber());
        System.out.println("The largest drawn number :" + rndMinMax.getMaxNumber());
    }
}
