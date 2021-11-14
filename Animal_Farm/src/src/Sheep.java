package src;

public class Sheep extends Animal{
private int numberofClones=0;
	
	public String helloAnimal() {
		StringBuffer sheepTalk=new StringBuffer();
		
		sheepTalk.append("meee meee " + name + " have four legs! ");
		return sheepTalk.toString();
	}
	
	public Sheep clone() {
		Sheep clonedSheep=(Sheep)super.clone();
		String sheepName= clonedSheep.getName();
		numberofClones++;
		clonedSheep.setName(sheepName +" "+numberofClones);
		return clonedSheep;
	}
}
