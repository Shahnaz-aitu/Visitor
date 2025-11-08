public class Demo {
    public void doDrink(){
        Cafe cafe = new Cafe();
        CreateDrink master=new MasterCoffee();

        System.out.println("===Master coffee===");
        cafe.drinks(master);
        cafe.type(master);
    }
}
