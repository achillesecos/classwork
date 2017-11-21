package javaTheHardWay;

public class Wilderness extends Habitat {

	private String description;
	
	public Wilderness(String description, int livingCapacity) {
		super(livingCapacity);
		this.description = description;
	}
	
	public static void main(String[] args) {
		Wilderness w = new Wilderness("An empty dessert", 10);
	}

}
