package section8;

public class Burger {


    private String burgerType;

    public Burger() {

        this.burgerType = "";
    }

    private Burger(String type) {
        this.burgerType = type;
    }

    public Burger addVeggies() {
        System.out.println("Adding vegies to the burger");
        return new Burger(this.burgerType += " Veggie");
    }

    public Burger addCheese() {
        System.out.println("Adding cheese to the burger");
        return new Burger(this.burgerType += " Cheese");
    }

    public Burger addASausage() {
        System.out.println("Adding sausage to the burger");
        return new Burger(this.burgerType += " Sausage");
    }

    public String toString() {
        return String.format("%s", burgerType + " burger");
    }
}
