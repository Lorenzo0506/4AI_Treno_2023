

/**
* b>AreaCilindro</b>
* <p>EREDITARIETA'</p>
* <p>calcolo:</p>
* <UL>
* <LI>area cerchio alla base
* <LI>circonferenza cerchio alla base
* <LI>volume Cilindro
* </UL>
* 
*
@author lorenzo fabbiano
*
*versione 1
*/
public class Treno {
	/**
	 * nome = nome del treno
	 */
	private String nome,destinazione;
	private int nummaxvagoni;
	private Vagone[]vagoni;
	/**
	 * 
	 * @param nome
	 * @param destinazione
	 * @param nummaxvagoni
	 */
	
	public Treno(String nome, String destinazione, int nummaxvagoni) {
		super();
		this.nome = nome;
		this.destinazione = destinazione;
		this.nummaxvagoni = nummaxvagoni;
	}

	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}

	public int getNummaxvagoni() {
		return nummaxvagoni;
	}

	public void setNummaxvagoni(int nummaxvagoni) {
		this.nummaxvagoni = nummaxvagoni;
	}

	public String getNome() {
		return nome;
	}
	public String toString() {
		/**
		 * @retun metodo che restituisce il treno completo
		 */
		String s="Freccia Rossa\n";
		s+=nome+"\n";
		s+="destinazione"+"\n";
		return s;
		
	}
	/**
	 * 
	 * @param args
	 */

	

	public static void main(String[] args) {
		

	}

}
