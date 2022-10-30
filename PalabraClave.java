package Practica1;

public class PalabraClave 
{
	private String nombre;
	private UnorderedCircularLinkedList lista;
	
	public PalabraClave(String pNombre)
	{
		this.nombre = pNombre;
		this.lista = new ListaWebs();
	}

	public String getNombre() {
		return nombre;
	}
	
	public void cargarListaWebs()
	{
		this.lista = Webs.getWebs().getLista().word2Webs(nombre);
	}

	public UnorderedCircularLinkedList getLista() {
		return lista;
	}

	

}
