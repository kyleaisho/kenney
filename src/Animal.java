
public class Animal {
	
	/**
	 * Fields for Animals
	 */
	private String name;
	private String sound;
	private String type;
	private int weight;
	
	
	/**
	 * Constructor
	 */
	
	public Animal(String dontPayAttentionToTheName, int newWeight) {
		name = dontPayAttentionToTheName;
		setWeight(newWeight);
	}
	
	// Add 25lbs every time you take it
	public void takeTestosteroneEnanthane() {
		weight += 25;
		System.out.println(name + " took some steroids!");
	}
	
	public void takeCreatine() {
		weight++;
		System.out.println(name + " took some creatine!");
	}
	
	public void printNameAndWeight() {
		System.out.println(name + "'s weight is " + weight);
	}
	
	
	
	/**
	 * Getters
	 */
	
	public String getName() {
		return name;
	}
	
	public String getSound() {
		return sound;
	}
	
	public String getType() {
		return type;
	}
	
	public int getWeight() {
		return weight;
	}
	
	/**
	 * Setters
	 */
	public void setWeight(int newWeight) {
		if (newWeight > 0) {
			weight = newWeight;
		}
	}
	

}


