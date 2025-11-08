public class Cafe implements Drinks{
    Drinks[] drinks;
    public Cafe(){
        this.drinks = new Drinks[]{
                new Tea()
        };
    }
    @Override
    public void drinks(CreateDrink createDrink) {
        for (Drinks element : drinks) {
            element.drinks(createDrink);
        }
    }
}
