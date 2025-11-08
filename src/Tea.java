public class Tea implements Drinks{
    @Override
    public void drinks(CreateDrink createDrink){
        createDrink.create(this);
    }
    @Override
    public void type(CreateDrink createDrink){
        createDrink.create(this);
    }
}
