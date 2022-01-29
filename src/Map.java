public class Map {
	private Case[][] map;
	private int width;
	private int height;
	
	public Map(int width, int height) {
		// Initialisation du plateau � vide
	}
	
	public void setCase(int indexX, int indexY, Type type) {
		// Setter
	}
	
	public String toString() {
		/*	- - - - - 
		 * |D| | | |O|
		 *  - - - - -  
		 * | | |3| |O|
		 *  - - - - - 
		 * | |1|O| | |
		 *  - - - - - 
		 * | |O|O|2| |
		 *  - - - - - 
		 */
		String l = " ";
		for(int i=0;i<this.width;i++)
			l+="- ";
		String res = null;
		for(int i=0;i<this.width;i++) {
			res+=l+'\n';
			for(int j=0;j<this.height;j++) {
				res+=('|');
				switch(this.map[i][j].getType()){
				case DEPOT:res+=('D');break;
				case CLIENT:res+=(((Client) this.map[i][j]).getNumero());break;
				case OBSTACLE:res+=('O');break;
				case NULL:res+=(' ');break;
				default:
					System.out.println("Il n'existe pas ce type de case");
				}
				res+=('|');
			}
			res+='\n';
		}
		return res+l;
	}
	
	public int[][] floydWarshall() {
		//
		int len = this.width * this.height;
		int[][] dist =  new int[len][len];
		
		int ix, iy, jx, jy, md;
		//
		for(int j = 0; j < len; j++) {
			for(int i = 0; i < len; i++) {
				ix = i % this.width;
				iy = i - ix * this.width;
				jx = j % this.width;
				jy = j - jx * this.width;
				
				if(this.map[iy][ix].getType() == Type.OBSTACLE || this.map[jy][jx].getType() == Type.OBSTACLE) {
					dist[i][j] = -1;
				} else {
					md = Math.abs(ix - jx) + Math.abs(iy - jy);
					if(md <= 1) {
						dist[i][j] = md;
					} else {
						dist[i][j] = -1;
					}
				}
			}
		}
		
		for(int k = 0; k < len; k++) {
			for(int j = 0; j < len; j++) {
				for(int i = 0; i < len; i++) {
					md = dist[i][k] + dist[k][k];
					if(dist[i][j] > md) {
						dist[i][j] = md;
					}
				}
			}
		}
		
		return dist;
	}
}
