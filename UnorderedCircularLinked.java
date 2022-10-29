package segundaFase;

public class UnorderedCircularLinkedList<T> extends CircularLinkedList<T> implements UnorderedListADT<T> {
	
	public void addToFront(T elem) {
	// añade un elemento al comienzo
		// COMPLETAR EL CODIGO Y CALCULAR EL COSTE
		Node<T> nuevo = new Node<T>(elem);
		if (isEmpty()) {last = nuevo; nuevo.next = nuevo;}
		else {
			nuevo.next = last.next;
			last.next = nuevo;
		}
		
		//coste: 1
	}

	public void addToRear(T elem) {
	// añade un elemento al final 
		// COMPLETAR EL CODIGO Y CALCULAR EL COSTE
		Node<T> nuevo = new Node<T>(elem);
		if (isEmpty()) {last = nuevo; nuevo.next = nuevo;}
		else {
			nuevo.next = last.next;
			last.next = nuevo;
			last = nuevo;
		}
		
		//coste: 1
	}
	
	public void addAfter(T elem, T target) {
	// Añade elem detrás de otro elemento concreto, target,  que ya se encuentra en la lista
		// ¡COMPLETAR OPCIONAL!
		Node<T> nuevo = new Node<T>(elem);
		if (last.next == null) {addToRear(elem);}
		else {
			Node<T> actual = last;
			while (actual.data != target) {
				actual = actual.next;
			}
			nuevo = actual.next;
			actual.next = nuevo;
		}
		
		//coste: n
	}

}
