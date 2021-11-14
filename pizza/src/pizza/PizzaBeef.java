package pizza;

public class PizzaBeef extends pizza implements Coffe{
	
	public PizzaBeef(String name) {
        super(name);
    }
	

	@Override
    public void ordered() {
        System.out.println("Paket 1 Ordered!");
    }

    @Override
    public void Coffeordered() {
        System.out.println(this.name + " with coffe! (Paket 1) ");

    }
}
