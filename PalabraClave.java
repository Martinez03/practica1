package segundaFaseEnPractica1;

public class PalabraClave 
{
	private String nombre;
	private UnorderedCircularLinked<String> lista;
	
	public PalabraClave(String pNombre)
	{
		this.nombre = pNombre;
		this.lista = new UnorderedCircularLinked<>();
	}

	public String getNombre() {
		return nombre;
	}
	
	public void cargarListaWebs()
	{
		this.lista = Webs.getWebs().getLista().word2Webs(nombre);
	}

	public UnorderedCircularLinked<String> getLista() {
		return lista;
	}

	

}
