public class Notebook {
      int weight;
      int price;
      int year;
      int curYear = 2022;
      int itemAge;
      public Notebook(int weight, int price, int year) {
            this.weight = weight;
            this.price = price;
            this.year = year;
      }

      public void checkPrice() {
            if (this.price < 600) {
                  System.out.println("This notebook is cheap. ");
            } else if (this.price >1000){
                  System.out.println("This notebook is expensive. ");
            } else {
                  System.out.println("The price is good. ");
            }
      }
      public void checkWeight() {
            if (this.weight < 1000) {
                  System.out.println("This notebook is lightweight. ");
            } else if (this.weight > 1900) {
                  System.out.println("This notebook is not too heavy. ");
            } else {
                  System.out.println("This notebook is very heavy. ");
            }
      }
      public void checkYearAndPrice(){
            itemAge = curYear - this.year;
            if (itemAge >= 5 && this.price > 600) {
                  System.out.println("It is too expensive for its age");
            } else if (itemAge >= 5 && this.price <=600) {
                  System.out.println("It is old but not too expensive");
            } else if (itemAge == 0 && this.price < 1000) {
                  System.out.println("It is profitable to buy");
            } else if (itemAge == 0 && this.price >= 1500) {
                  System.out.println("It is new but very expensive");
            } else if (itemAge < 5 && itemAge > 0 && this.price < 1500) {
                  System.out.println("It is a reasonable price");
            } else {
                  System.out.println("It is not good to buy");
            }
      }
}
