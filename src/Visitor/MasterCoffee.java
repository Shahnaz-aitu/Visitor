package Visitor;

public class MasterCoffee implements DrinkVisitor {
    @Override
    public void drinkCoffee(Coffee coffee) {
        System.out.println("===MasterCoffee===");
    }
    @Override
    public void drinkTea(Tea tea) {
        System.out.println("===MasterCoffee===");
    }
}
