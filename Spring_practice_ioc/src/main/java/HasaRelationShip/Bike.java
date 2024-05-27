package HasaRelationShip;

public class Bike {
	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Bike [engine=" + engine + "]";
	}
	

}
