package academy.learnprogramming;

class Hamburger {

    private String name;
    private int rollType;
    private int meat;
    private int price;
    private int extra;
    private String firstAdd;
    private String secondAdd;
    private String thirdAdd;
    private String fourthAdd;

    public Hamburger(int rollType, int meat, int price) {
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
        this.name = "Basic Burger";
        this.firstAdd = "Lettuce";
        this.secondAdd = "tomato";
        this.thirdAdd = "Carrot";
        this.fourthAdd = "Cheese";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getRollType() {
        return rollType;
    }

    public int getMeat() {
        return meat;
    }

    public int getPrice() {
        return price;
    }

    public String getFirstAdd() {
        return firstAdd;
    }

    public String getSecondAdd() {
        return secondAdd;
    }

    public String getThirdAdd() {
        return thirdAdd;
    }

    public String getFourthAdd() {
        return fourthAdd;
    }

//    public int totalPrice() {
//
//    }
}

class healthyBurger extends Hamburger {
    public healthyBurger(int rollType, int meat, int price) {
        super(rollType, meat, price);
        this.setName("Healthy Burger");
    }


}

class deluxeBurger extends Hamburger {
    public deluxeBurger(int rollType, int meat, int price) {
        super(rollType, meat, price);
        this.setName("Deluxe Burger");
    }
}

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger(1,1,100);
        System.out.println(hamburger.getName());
        System.out.println(hamburger.getMeat());
        System.out.println(hamburger.getPrice());
        System.out.println(hamburger.getRollType());
        System.out.println(hamburger.getFirstAdd());
        System.out.println(hamburger.getSecondAdd());
        System.out.println(hamburger.getThirdAdd());
        System.out.println(hamburger.getFourthAdd());
    }
}
