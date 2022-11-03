package segundaFaseEnPractica1;

public interface UnorderedListADT<Web> extends ListADT<Web> {
	
	public void addToFront(Web elem);
	// añade un elemento al comienzo 

	public void addToRear(Web elem);
	// añade un elemento al final 
	
	public void addAfter(Web elem, Web target);
	// Añade elem detrás de otro elemento concreto, target,  que ya se encuentra en la lista

}
