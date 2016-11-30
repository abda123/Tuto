package metier;

import dao.DaoImpl;
import dao.Idao;

public class metierImpl implements Imetier {
 
	Idao monDao = new DaoImpl();
	/* (non-Javadoc)
	 * @see metier.Imetier#calculTemperature()
	 */
	public int calculTemperature() {
		// TODO Auto-generated method stub
		int temperature= monDao.Multiply(3, 4);
		return temperature;
	}

	/* (non-Javadoc)
	 * @see metier.Imetier#salutation()
	 */
	
	public String salutation() {
		String salutation= monDao.chaineC();
		// TODO Auto-generated method stub
		return salutation;
	}

}
