
public class Client extends Case{
	private int numero;
	public Client(int x, int y, Type type) {
		super(x, y, type);
		// TODO Auto-generated constructor stub
		this.numero=0;
	}
	public void setNumero(int i) {
		this.numero=i;
	}
	public int getNumero() {
		return this.numero;
	}
}
