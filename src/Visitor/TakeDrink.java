package Visitor;

public class TakeDrink implements DrinkVisitor {
    @Override
    public void drinkCoffee(Coffee coffee) {
        System.out.print("Take ");
    }
    @Override
    public void drinkTea(Tea tea) {
        System.out.print("Take ");
    }
}
