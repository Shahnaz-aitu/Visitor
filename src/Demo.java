import Visitor.*;

public class Demo {
    public void demo() {
        Cafe cafe1=new Coffee();
        cafe1.accept(new DoDrink());
        cafe1.accept(new TakeVisitor());
        Cafe cafe2=new Tea();
        cafe2.accept(new DoDrink());
        cafe2.accept(new TakeVisitor());

    }
}

