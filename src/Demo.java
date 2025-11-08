import Visitor.*;

import java.util.Locale;
import java.util.Scanner;

public class Demo {
    public void demo() {
        Cafe tea = new Tea();
        Cafe coffee = new Coffee();
        DrinkVisitor cafeMaster = new MasterCoffee();
        coffee.accept(cafeMaster);
        tea.accept(cafeMaster);
        DrinkVisitor cafeEspresso = new EspressoDay();
        tea.accept(cafeEspresso);
        coffee.accept(cafeEspresso);
    }
}

