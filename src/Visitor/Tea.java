package Visitor;

public class Tea implements Cafe {
    @Override
    public void accept(DrinkVisitor visit) {
        visit.drinkTea(this);
        System.out.println("tea!");
    }
}
