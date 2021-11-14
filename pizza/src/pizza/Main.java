package pizza;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<pizza> Pizza = new ArrayList<>();

        ArrayList<Tea> tea = new ArrayList<>();
        tea.add(new PizzaMozarella("Pizza Mozarella"));
        tea.add(new PizzaMozarella("Pizza Mozarella"));

        ArrayList<Coffe> coffe = new ArrayList<>();
        coffe.add(new PizzaBeef("Pizza Beef"));
        coffe.add(new PizzaBeef("Pizza Beef"));
        coffe.add(new PizzaBeef("Pizza Beef"));
        
        ArrayList<Cola> cola = new ArrayList<>();
        cola.add(new PizzaCheese("Pizza Cheese"));
        cola.add(new PizzaCheese("Pizza Cheese"));
        cola.add(new PizzaCheese("Pizza Cheese"));

        for (Tea i : tea) {
            i.Teaordered();
            Pizza.add((pizza) i);
        }

        for (Coffe i : coffe) {
            i.Coffeordered();
            Pizza.add((pizza) i);
        }  
        for (Cola i : cola) {
            i.Colaordered();
            Pizza.add((pizza) i);
        }

        for (pizza i : Pizza) {
            i.ordered();
        }
    }
}

