package BattistaAntonellaP1PB2;

public class Historia extends Libro implements IFotocopiable {

	Historia(String codigo, String nombre, String autor) {
		super(codigo, nombre, autor);
	
	}

	@Override
	public Boolean esFotocopiable() {
		
		return true;
	}

	@Override
	public String Fotocopiar() {
		return "Fotocopiando Historia";
	}

}
