public class Human {
    String name;
    double age1;
    double height1;

    public Human(String name, double age, double height){

        this.name = name;
        this.age1 = age;
        this.height1 = height;
    }
    public void checkParams() {
        if (age1 > 30 && height1 > 160) {
            System.out.println("User is older than 30 and taller than 160cm");
        } else {
            System.out.println("User is 30 (or younger) or 160cm (or shorter)");
        }
    }
}
