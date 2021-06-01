package BattistaAntonellaP1PB2;

public class Geografia extends Libro implements IFotocopiable{

	Geografia(String codigo, String nombre, String autor) {
		super(codigo, nombre, autor);
	
	}

	@Override
	public Boolean esFotocopiable() {

		return null;
	}

}
