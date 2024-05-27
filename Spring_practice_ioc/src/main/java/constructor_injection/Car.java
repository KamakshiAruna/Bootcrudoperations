package constructor_injection;

public class Car {
	private int id;
	private String color;
	public Car(int id, String color) {
		super();
		this.id = id;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", color=" + color + "]";
	}
	

}
