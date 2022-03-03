package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        //we need a hamburguer standard to after this take another burguers;
        // mother class:
        //name;
        //itens;
        //aditional;
        //price

        // 2 subclasses

        //healthyburguer
        //---> brow rye bread roll + 2 additionals
        //can have 6 itens;

        //deluxe burguer
// comes with  chips and drinks like addition;
        //no extra additions is aalowed;

        //all classes must have method to show base price and the price of additional;
        //burguer = base price + additionals

        Hamburger hamburger = new Hamburger("Basic", "sausage", "white", 3.56);
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddittion1("Tomato", 0.27);
        hamburger.addHamburgerAddittion2("lettuce", 0.75);
        hamburger.addHamburgerAddittion3("cheese", 1.12);
        System.out.println("Total burger price is" + hamburger.itemizeHamburger());
        HealthyBurger healthyBurger = new HealthyBurger("bacon",5.67);
        healthyBurger.addHamburgerAddittion1("egg", 5.43);
        healthyBurger.addHealthyAddition1("lentils", 3.41);
        System.out.println(" Total healthy burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddittion3("should not do this", 50.53);
        db.itemizeHamburger();

    }
}
