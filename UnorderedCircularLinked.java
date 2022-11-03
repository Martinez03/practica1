package segundaFaseEnPractica1;

public class UnorderedCircularLinked<Web> extends CircularLinkedList<Web> implements UnorderedListADT<Web> {
	
	public void addToFront(Web elem) {
	// añade un elemento al comienzo
		// COMPLETAR EL CODIGO Y CALCULAR EL COSTE
		Node<Web> nuevo = new Node<Web>(elem);
		if (isEmpty()) {last = nuevo; nuevo.next = nuevo;}
		else {
			nuevo.next = last.next;
			last.next = nuevo;
		}
		
		//coste: 1
	}

	public void addToRear(Web elem) {
	// añade un elemento al final 
		// COMPLETAR EL CODIGO Y CALCULAR EL COSTE
		Node<Web> nuevo = new Node<Web>(elem);
		if (isEmpty()) {last = nuevo; nuevo.next = nuevo;}
		else {
			nuevo.next = last.next;
			last.next = nuevo;
			last = nuevo;
		}
		
		//coste: 1
	}
	
	public void addAfter(Web elem, Web target) {
	// Añade elem detrás de otro elemento concreto, target,  que ya se encuentra en la lista
		// ¡COMPLETAR OPCIONAL!
		Node<Web> nuevo = new Node<Web>(elem);
		if (last.next == null) {addToRear(elem);}
		else {
			Node<Web> actual = last;
			while (actual.data != target) {
				actual = actual.next;
			}
			nuevo = actual.next;
			actual.next = nuevo;
		}
		
		//coste: n
	}

}
