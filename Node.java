package segundaFase;

	public class Node<Web> {
		public Web data; 			// dato del nodo
		public Node<Web> next; 	// puntero al siguiente nodo de la lista
		// -------------------------------------------------------------

		public Node(Web dd) 		// constructor
		{
			data = dd;
			next = null;

		}
	}
