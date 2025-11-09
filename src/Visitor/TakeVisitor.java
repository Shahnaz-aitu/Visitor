package Visitor;

public class TakeVisitor implements DrinkVisitor {
    @Override
    public void drinkCoffee(Coffee cafe) {
        int milk = (int) (Math.random() * 100);
        int chocolate = (int) (Math.random() * 100);
        System.out.print("Take " + milk + "gr milk, " + chocolate + "gr chocolate");
    }
    @Override
    public void drinkTea(Tea tea) {
        int lemon = (int) (Math.random() * 100);
        int sugar = (int) (Math.random() * 100);
        System.out.print("Take " + lemon + "gr lemon, " + sugar + "gr sugar");
    }
}