package src;

public class AnimalClient {
	public static void main(String[] args) {
		AnimalCreator animalCreator= new AnimalCreator();
		Animal[] animalFarm=new Animal[5];
		
		animalFarm[0]=animalCreator.retrieveAnimal("Chicken");
		animalFarm[1]=animalCreator.retrieveAnimal("Chicken");
		animalFarm[2]=animalCreator.retrieveAnimal("Chicken");
		animalFarm[3]=animalCreator.retrieveAnimal("Sheep");
		animalFarm[4]=animalCreator.retrieveAnimal("Sheep");

		
		System.out.println("===Animal Farm===\n ");
		System.out.println("Animals :\n");
		for(int i=0; i<5;i++) {
			System.out.println((i+1)+". " + animalFarm[i].helloAnimal());
		}
	}
}
