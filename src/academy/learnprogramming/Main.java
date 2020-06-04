package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "sausage", 3.56, "white");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerFirstAdd("tomato",0.27);
        hamburger.addHamburgerSecondAdd("lettuce", 0.75);
        hamburger.addHamburgerThirdAdd("cheese", 1.13);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Sirloin",5.67);
        healthyBurger.addHamburgerFirstAdd("egg",5.43);
        healthyBurger.addHealthAddition1("Lentils",3.41);
        System.out.println("Total healthy burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxe = new DeluxeBurger();
        deluxe.addHamburgerThirdAdd("This should not be allowed",13.45);
        deluxe.itemizeHamburger();
    }
}
