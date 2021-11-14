package src;

public abstract class Animal implements Cloneable{
	protected int numberOfLegs=0;
	protected String description="";
	protected String name="";
	
	public abstract String helloAnimal();
	
	public Animal clone() {
		Animal clonedAnimal=null;
		try {
			clonedAnimal=(Animal)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clonedAnimal.setName(name);
		return clonedAnimal;
	}
	
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name=name;
		
	}
}
