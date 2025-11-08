package Visitor;

public class EspressoDay implements DrinkVisitor {
    @Override
    public void drinkCoffee(Coffee coffee){
        System.out.println("===Espresso Day===");
    }
    @Override
    public void drinkTea(Tea tea){
        System.out.println("===Espresso Day===");
    }
}
