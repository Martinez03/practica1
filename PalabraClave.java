package Practica1;

public class PalabraClave 
{
	private String nombre;
	private ListaWebs lista;
	
	public PalabraClave(String pNombre)
	{
		this.nombre = pNombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void cargarListaWebs()
	{
		this.lista = lista.word2Webs(this.nombre);
		this.lista.imprimirLista();
	}

}
