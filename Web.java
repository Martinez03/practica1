package Practica1;


public class Web {
	private String nombre;
	private int id;
	private ListaWebs listaWebs;
	private ListaPalabrasClaves listaPalabras;
	
	public Web (String pNombre,int pId) 
	{
		this.id = pId;
		this.nombre = pNombre;
		this.listaWebs = new ListaWebs();
		this.listaPalabras = new ListaPalabrasClaves();
	}

	public String getNombre() {
		return nombre;
	}

	public int getId() {
		return id;
	}

	public ListaWebs getListaWebs() 
	{
		return this.listaWebs;
	}
	
	public void cargarListaPalabrasClave() 
	{
		
		this.listaPalabras =  PalabrasClave.getPalabrasClave().getLista().web2Words(nombre);
	}
	
	public ListaPalabrasClaves getListaPalabras() 
	{
		return this.listaPalabras;
	}
	

	
	
	
}
