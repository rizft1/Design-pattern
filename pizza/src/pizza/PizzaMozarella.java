package pizza;

public class PizzaMozarella extends pizza implements Tea {
	public PizzaMozarella(String name) {
        super(name);
    }
	

	@Override
    public void ordered() {
        System.out.println("Paket 3 Ordered!");
    }

    @Override
    public void Teaordered() {
        System.out.println(this.name + " with Tea! (Paket 3)");

    }
	
}
