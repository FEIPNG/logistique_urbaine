public class Case {
	private int x;
	private int y;
	private Type type;
	
	public Case(int x, int y, Type type) {
		this.x = x;
		this.y = y;
		this.type = type;
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
	
	//Autres méthodes
}
