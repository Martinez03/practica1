package segundaFase;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CircularLinkedList<T> implements ListADT<T> {

	// Atributos
	protected Node<T> last; // apuntador al ultimo
	protected String descr;  // descripción
	protected int count;

	// Constructor
	public CircularLinkedList() {
	     last = null;
		descr = "";
		count = 0;
	}
	
	public void setDescr(String nom) {
	  descr = nom;
	}

	public String getDescr() {
	  return descr;
	}

	public T removeFirst() {
	// Elimina el primer elemento de la lista
        // Precondición: la lista tiene al menos un elemento
		// COMPLETAR EL CODIGO Y CALCULAR EL COSTE
		
		Node<T> res = last.next;
		if (this.last.next.equals(last)){last = null; count = count -1;} //un solo elemento
		else {this.last.next = this.last.next.next;}
		return res.data;
		
		//coste: constante
	}

	public T removeLast() {
	// Elimina el último elemento de la lista
        // Precondición: la lista tiene al menos un elemento
			// COMPLETAR EL CODIGO Y CALCULAR EL COSTE
			
		Node<T> res = last;
		if (this.last.next.equals(last)){last = null; count = count -1;} //un solo elemento
		else {
			Node<T> actual = last.next;
			
			while (actual.next != last) {
				actual = actual.next;
			}
			actual.next = last.next;
			last = actual.next;
			count = count -1;
		}
		return res.data;
	}


	public T remove(T elem) {
	//Elimina un elemento concreto de la lista
		// COMPLETAR EL CODIGO Y CALCULAR EL COSTE
		
		if (last.next.data.equals(elem)) {removeLast();}
		else {
			Node<T> actual = last.next;
			Node<T> prev = last;
			while (!actual.data.equals(elem)) {
				actual = actual.next;
				prev = prev.next;
			}
			prev.next = actual.next;
			count = count -1;
		}
		return elem;
		
		//coste: n
	}

	public T first() {
	//Da acceso al primer elemento de la lista
	      if (isEmpty())
	          return null;
	      else return last.next.data;
	      
	      //coste: 1
	}

	public T last() {
	//Da acceso al último elemento de la lista
	      if (isEmpty())
	          return null;
	      else return last.data;
	      
	      //coste: 1
	}

	public boolean contains(T elem) {
		Node<T> actual = last;
		if (actual == null) {return false;}
		else {
			boolean enc = false;
			if (actual.data == elem) {return true;}
			else {actual = actual.next;}
			while (actual != last && enc != true) {
				if (actual.data == elem) {
					enc = true;
				}
				else{actual = actual.next;}
			}
			return enc;
		}
		//coste: n
	}

	public T find(T elem) {
	//Determina si la lista contiene un elemento concreto, y develve su referencia, null en caso de que no esté
		// COMPLETAR EL CODIGO Y CALCULAR EL COSTE
		if (this.contains(elem)) {return elem;}
		else {return null;}
		
		//coste: n
	}

	public boolean isEmpty() 
	//Determina si la lista está vacía
	{ return last == null;};
	
	public int size() 
	//Determina el número de elementos de la lista
	{ return count;};
	
	/** Return an iterator to the stack that iterates through the items . */ 
	   public Iterator<T> iterator() { return new ListIterator(); } 

	   // an iterator, doesn't implement remove() since it's optional 
	   private class ListIterator implements Iterator<T> { 

		// COMPLETAR EL CODIGO Y CALCULAR EL COSTE



	   } // private class
		
		
         public void visualizarNodos() {
			System.out.println(this.toString());
		}

		@Override
		public String toString() {
			String result = new String();
			Iterator<T> it = iterator();
			while (it.hasNext()) {
				T elem = it.next();
				result = result + "[" + elem.toString() + "] \n";
			}	
			return "SimpleLinkedList " + result + "]";
		}

}
