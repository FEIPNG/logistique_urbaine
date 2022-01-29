public class Depot extends Case {
	private int x;
	private int y;
	private Type type;
	
	public Depot(int x, int y, Type type) {
		super(x, y, type);
	}
	
	//Getters
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public Type getType() {
		return this.type;
	}
	
	//Autres m�thodes
}
