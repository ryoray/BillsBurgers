package academy.learnprogramming;

//class Hamburger {
//
//    private String name;
//    private int rollType;
//    private int meat;
//    private int price;
//    private int extra;
//    private int firstAdd;
//    private int secondAdd;
//    private int thirdAdd;
//    private int fourthAdd;
//
//    public Hamburger(int rollType, int meat, int price) {
//        this.rollType = rollType;
//        this.meat = meat;
//        this.price = price;
//        this.name = "Basic Burger";
//        this.firstAdd = 0;
//        this.secondAdd = 0;
//        this.thirdAdd = 0;
//        this.fourthAdd = 0;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getRollType() {
//        return rollType;
//    }
//
//    public int getMeat() {
//        return meat;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public int getFirstAdd() {
//        return firstAdd;
//    }
//
//    public int getSecondAdd() {
//        return secondAdd;
//    }
//
//    public int getThirdAdd() {
//        return thirdAdd;
//    }
//
//    public int getFourthAdd() {
//        return fourthAdd;
//    }
//
//
//    public int totalPrice(int totalOrder, int firstAdd, int secondAdd,
//                          int thirdAdd, int fourthAdd, int fifthAdd, int sixthAdd) {
//        int basePrice = this.price;
//        if (totalOrder < 0 || firstAdd < 0 || secondAdd < 0 || thirdAdd < 0 ||
//                fourthAdd < 0 || fifthAdd < 0 || sixthAdd < 0) {
//            return -1;
//        }
//        return (totalOrder * (basePrice + (firstAdd * 1000) + (secondAdd * 1200) +
//                (thirdAdd * 1100) + (fourthAdd * 1300) + (fifthAdd * 1400) +
//                (sixthAdd * 1500)));
//    }
//}
//
//class HealthyBurger extends Hamburger {
//    public HealthyBurger(int rollType, int meat, int price) {
//        super(rollType, meat, price);
//        this.setName("Healthy Burger");
//    }
//
//    @Override
//    public int totalPrice(int totalOrder, int firstAdd, int secondAdd,
//                          int thirdAdd, int fourthAdd, int fifthAdd, int sixthAdd) {
//        return super.totalPrice(totalOrder, firstAdd, secondAdd, thirdAdd,
//                fourthAdd, fifthAdd, sixthAdd);
//    }
//}
//
//class DeluxeBurger extends Hamburger {
//    public DeluxeBurger(int rollType, int meat, int price) {
//        super(rollType, meat, price);
//        this.setName("Deluxe Burger");
//    }
//
//    @Override
//    public int totalPrice(int totalOrder, int firstAdd, int secondAdd,
//                          int thirdAdd, int fourthAdd, int fifthAdd, int sixthAdd) {
//        return super.totalPrice(totalOrder, firstAdd, secondAdd, 0,0,0,0);
//    }
//}

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "sausage", 3.56, "white");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerFirstAdd("tomato",0.27);
        hamburger.addHamburgerSecondAdd("lettuce", 0.75);
        hamburger.addHamburgerThirdAdd("cheese", 1.13);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());
    }
}
