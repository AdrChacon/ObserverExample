package ObserverExample;


/**
 *  Esta es la clase concreta DWclient, estos son los observadores interesados en los libros de
 *  Discworld.
 * @author Chac�n Campos
 *
 */
public class DWclient extends Cliente {
	/**
	 * 
	 */
	public DWclient(Libreria subject) {
		this.subject = subject;
		this.subject.attach(this);
		this.cantidadActual = subject.getDiscWorld();
	}
	/**
	 * 
	 */
	public void update() {
		if (cantidadActual == 0 && subject.getDiscWorld() > 0) {
			System.out.println("DW Client: Thank you! I'll be grabbing a copy soon");
		} else if (cantidadActual != 0 && subject.getDiscWorld() == 0) {
			System.out.println("DW Client: I want to place an order for more Discworld books.");
		}
		this.cantidadActual = subject.getDiscWorld();
	}

	/**
	 * 
	 */
	@Override
	public void buyBook() {
		subject.sellDW();
		
	}

}
