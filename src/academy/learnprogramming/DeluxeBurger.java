package academy.learnprogramming;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Wagyu", 14.54, "White");
        super.addHamburgerFirstAdd("Chips",2.75);
        super.addHamburgerSecondAdd("Lentils",3.41);
    }

    @Override
    public void addHamburgerFirstAdd(String name, double price) {
        System.out.println("Cannot add additional item to deluxe burger");
    }

    @Override
    public void addHamburgerSecondAdd(String name, double price) {
        System.out.println("Cannot add additional item to deluxe burger");
    }

    @Override
    public void addHamburgerThirdAdd(String name, double price) {
        System.out.println("Cannot add additional item to deluxe burger");
    }

    @Override
    public void addHamburgerFourthAdd(String name, double price) {
        System.out.println("Cannot add additional item to deluxe burger");
    }
}
