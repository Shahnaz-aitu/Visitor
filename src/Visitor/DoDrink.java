package Visitor;

public class DoDrink implements DrinkVisitor {
    @Override
    public void drinkCoffee(Coffee coffee){
        double ml=0.3;
        System.out.print("Do " + ml +"ml ");
    }
    @Override
    public void drinkTea(Tea tea){
        double ml=0.4;
        System.out.print("Do " + ml +"ml ");
    }
}
