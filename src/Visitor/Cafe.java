package Visitor;

public interface Cafe {
    void accept(DrinkVisitor cafeVisitor);
}
