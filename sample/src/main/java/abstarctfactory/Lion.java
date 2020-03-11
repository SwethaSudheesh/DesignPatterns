package abstarctfactory;

public class Lion implements Animals{
	private String name;
	public Lion(){
		this.name="Lion King of Jungle";
		eats();
		makeSound();
		sleeps();
	}
	@Override
	public void eats() {
		System.out.println("Lion is a Wild Animal and is a Carnivor");
	}
	
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("The Lion Roars...");
	}
	
	@Override
	public void sleeps() {
		// TODO Auto-generated method stub
		System.out.println("Lion sleeps for 16hrs");
	}
	
}