public class Graph {
	private Case[] cases;
	private int[][] adjMatrix;
	
	public Graph(Case[] cases, int[][] adjMatrix) {
		// Initialisation
		this.cases = cases;
		this.adjMatrix = new int[cases.length][cases.length];
	}

	// M�thodes
	
	public void printResult() {
		int l=0;
		System.out.println(this.cases[0].getType());
		do {
			for(int c=0;c<this.adjMatrix.length;c++) {
				if(this.adjMatrix[l][c]!=0) {
					System.out.println("poids:"+this.adjMatrix[l][c]+" "+"vers:"+this.cases[c].getType()+l+" ");
					l=c;
					break;
				}
			}
		}while(l!=0);
	}
	
	// M�thode de r�olution du Traveling Salesman Problem (TSP)
	
}
