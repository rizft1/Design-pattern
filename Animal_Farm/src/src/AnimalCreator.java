package src;

public class AnimalCreator {
	private Animal sheep = new Sheep();
	private Animal chicken = new Chicken();
	
	public AnimalCreator() {
		sheep.setName("Sheep");
		chicken.setName("Chicken");
	}
	
	public Animal retrieveAnimal(String kindofAnimal) {
		if("Chicken".equals(kindofAnimal)) {
			return(Animal)chicken.clone();
		}
		else if("Sheep".equals(kindofAnimal)) {
			return(Animal)sheep.clone();
		}
		return null;
	}
}
