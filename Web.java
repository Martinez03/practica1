package Practica1;

public class Web {
	private String nombre;
	private int id;
	private ListaWebs listaWebs;
	
	public Web (String pNombre,int pId) 
	{
		this.id = pId;
		this.nombre = pNombre;
	}

	public String getNombre() {
		return nombre;
	}

	public int getId() {
		return id;
	}

	public ListaWebs getListaWebs() {
		return this.listaWebs;
	}
	
	

	
	
	
}
