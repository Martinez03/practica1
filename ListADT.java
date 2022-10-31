package segundaFase;

import java.util.Iterator;

public interface ListADT<Web> {

public void setDescr(String nom);
// Actualiza el nombre de la lista

public String getDescr();
// Devuelve el nombre de la lista

public Web removeFirst();
//Elimina el primer elemento de la lista

public Web removeLast();
//Elimina el último elemento de la lista

public Web remove(T elem);
//Elimina un elemento concreto de la lista

public Web first();
//Da acceso al primer elemento de la lista

public Web last();
//Da acceso al último elemento de la lista

public boolean contains(Web elem);
//Determina si la lista contiene un elemento concreto

public Web find(Web elem);
//Determina si la lista contiene un elemento concreto, y develve su referencia, null en caso de que no esté

public boolean isEmpty();
//Determina si la lista está vacía

public int size();
//Determina el número de elementos de la lista

public Iterator<Web> iterator();

}
