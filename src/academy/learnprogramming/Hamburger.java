package academy.learnprogramming;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String firstAddName;
    private double firstAddPrice;

    private String secondAddName;
    private double secondAddPrice;

    private String thirdAddName;
    private double thirdAddPrice;

    private String fourthAddName;
    private double fourthAddPrice;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerFirstAdd(String name, double price) {
        this.firstAddName = name;
        this.firstAddPrice = price;
    }

    public void addHamburgerSecondAdd(String name, double price) {
        this.secondAddName = name;
        this.secondAddPrice = price;
    }

    public void addHamburgerThirdAdd(String name, double price) {
        this.thirdAddName = name;
        this.thirdAddPrice = price;
    }

    public void addHamburgerFourthAdd(String name, double price) {
        this.fourthAddName = name;
        this.fourthAddPrice = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with " + this.meat + ", price is " + this.price );
        if (this.firstAddName != null) {
            hamburgerPrice += this.firstAddPrice;
            System.out.println("Added " + this.firstAddName + " for an extra " + this.firstAddPrice);
        }
        if (this.secondAddName != null) {
            hamburgerPrice += this.secondAddPrice;
            System.out.println("Added " + this.secondAddName + " for an extra " + this.secondAddPrice);
        }
        if (this.thirdAddName != null) {
            hamburgerPrice += this.thirdAddPrice;
            System.out.println("Added " + this.thirdAddName + " for an extra " + this.thirdAddPrice);
        }
        if (this.fourthAddName != null) {
            hamburgerPrice += this.fourthAddPrice;
            System.out.println("Added " + this.fourthAddName + " for an extra " + this.fourthAddPrice);
        }
        return hamburgerPrice;
    }
}
