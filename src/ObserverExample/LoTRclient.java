package ObserverExample;

/**
 *  Esta es la clase concreta LoTRclient, estos son los observadores interesados en los libros de
 *  Lord of the Rings.
 * @author Chac�n Campos
 *
 */
public class LoTRclient extends Cliente{

	public LoTRclient(Libreria subject) {
		this.subject = subject;
		this.subject.attach(this);
		this.cantidadActual = subject.getLordOfTheRings();
	}
	
	/**
	 * 
	 */
	public void update() {
		if (cantidadActual == 0 && subject.getLordOfTheRings() > 0) {
			System.out.println("LOTR Client: Great! I'll reserve a copy soon");
		} else if (cantidadActual != 0 && subject.getLordOfTheRings() == 0) {
			System.out.println("LOTR Client: I want to place an order for more Lord of the Rings books.");
		}
		this.cantidadActual = subject.getLordOfTheRings();
	}

	/**
	 * 
	 */
	@Override
	public void buyBook() {
		subject.sellLOTR();
		
	}

}
