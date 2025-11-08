import Visitor.*;

public class Demo {
    public void demo() {
        Cafe tea = new Tea();
        Cafe coffee = new Coffee();
        DrinkVisitor cafeMaster = new TakeDrink();
        coffee.accept(cafeMaster);
        tea.accept(cafeMaster);
        DrinkVisitor cafeEspresso = new DoDrink();
        tea.accept(cafeEspresso);
        coffee.accept(cafeEspresso);
    }
}

