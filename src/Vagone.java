
public class Vagone {
		private String classe;
		private int postoccupati,postdisponibili,postitot;

		public Vagone(String classe, int postitot) {
			this.classe = classe;
			this.postitot = postitot;
		}

		public int getPostoccupati() {
			return postoccupati;
		}

		public void setPostoccupati(int postoccupati) {
			this.postoccupati = postoccupati;
		}

		public String getClasse() {
			return classe;
		}

		public int getPostdisponibili() {
			return postdisponibili;
		}

		public int getPostitot() {
			return postitot;
		}
		public String toString() {
			String s="Freccia Rossa\n";
			s+=classe+"\n";
			s+="postitotali\n";
			return s;
			
		}
		
		
	

	public static void main(String[] args) {
		Vagone v=new Vagone("Freccia rossa",30);
    //Vagone v1 =new Vagone("Freccia azzura",30);
    //Vagone v2 =new Vagone("Regionale",25);
    v.setVagone("Freccia bianca",25);
    v.setVagone("Regionale",27);
    System.out.println(v);


	}

}
