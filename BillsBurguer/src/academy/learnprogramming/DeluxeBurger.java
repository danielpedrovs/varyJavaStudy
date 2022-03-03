package academy.learnprogramming;

public class DeluxeBurger extends Hamburger{


    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", "white", 14.54);
        super.addHamburgerAddittion1("Chips", 2.75);
        super.addHamburgerAddittion2("drinks", 1.81);
    }

    @Override
    public void addHamburgerAddittion1(String name, double price) {

        System.out.println("Cannot not add additional items to a deluxe burger ");
    }

    @Override
    public void addHamburgerAddittion2(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger ");
    }

    @Override
    public void addHamburgerAddittion3(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger ");
    }

    @Override
    public void addHamburgerAddittion4(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger ");
    }
}
