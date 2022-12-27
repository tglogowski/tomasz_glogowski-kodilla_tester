public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 1000){
            System.out.println("This notebook is expensive.");
        } else {
            System.out.println("This price is good");
        }
    }

    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is light.");
        } else if (this.weight > 1900) {
            System.out.println("This notebook is very heavy.");
        } else {
            System.out.println("This notebook is not too heavy");
        }
    }

    public void checkPriceAndAge() {
        if (this.price <= 500 && this.year < 2015) {
            System.out.println("This notebook is very old but quite cheap.");
        } else if (this.price > 1500 && this.year >=2022) {
            System.out.println("This notebook is expensive because it is new!");
        } else if (this.price > 1000 && this.year >= 2019 && this.year < 2022){
            System.out.println("This notebook is expensive but almost new.");
        } else {
            System.out.println("This price is correlated with its age.");
        }
    }
}

