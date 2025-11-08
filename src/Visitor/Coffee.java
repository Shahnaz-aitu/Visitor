package Visitor;

public class Coffee implements Cafe {
    @Override
    public void accept(DrinkVisitor visit) {
        visit.drinkCoffee(this);
        System.out.println("coffee!");
    }
}
