package abstarctfactory;

public class Cow implements Animals{
	private String name;
	public Cow(){
		this.name = "Cow";
		eats();
		makeSound();
		sleeps();
	}
	
	@Override
	public void eats() {
		// TODO Auto-generated method stub
		System.out.println("Cow is a Domestic Animal and is a Herbivor");
	}
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("The cow in the meadow goes moo ");
	}
	@Override
	public void sleeps() {
		// TODO Auto-generated method stub
		System.out.println("Cow sleeps for 4hrs");
	}
}
