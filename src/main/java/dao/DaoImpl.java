package dao;

public class DaoImpl implements Idao {

	/* (non-Javadoc)
	 * @see dao.Idao#Multiply(int, int)
	 */
	
	public int Multiply(int a, int b) {
		int resultat =a*b;
		return resultat;
		
	}

	/* (non-Javadoc)
	 * @see dao.Idao#chaineC()
	 */

	public String chaineC() {
		// TODO Auto-generated method stub
		String chaine="je suis une chaine de caractere";
		return chaine;
	}

}
