package pizza;

public class PizzaCheese extends pizza implements Cola{
	
	public PizzaCheese(String name) {
        super(name);
    }
	
	@Override
    public void ordered() {
        System.out.println("Paket 2 Ordered!");
    }

    @Override
    public void Colaordered() {
        System.out.println(this.name + " with Cola! (Paket 2)");

    }
}
