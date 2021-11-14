package src;

public class Chicken extends Animal {
	private int numberofClones=0;
	
	public String helloAnimal() {
		StringBuffer chickenTalk=new StringBuffer();
		
		chickenTalk.append("cluck cluck " + name + " have two legs! ");
		return chickenTalk.toString();
	}
	
	public Chicken clone() {
		Chicken clonedChicken=(Chicken)super.clone();
		String chickenName= clonedChicken.getName();
		numberofClones++;
		clonedChicken.setName(chickenName +" "+ numberofClones);
		return clonedChicken;
	}
	
}
