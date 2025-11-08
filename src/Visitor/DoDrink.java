package Visitor;

public class DoDrink implements DrinkVisitor {
    @Override
    public void drinkCoffee(Coffee coffee){
        System.out.print("Do ");
    }
    @Override
    public void drinkTea(Tea tea){
        System.out.print("Do ");
    }
}
