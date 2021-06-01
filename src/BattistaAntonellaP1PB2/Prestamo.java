package BattistaAntonellaP1PB2;

public abstract class Prestamo {

	private Integer iD;
	private Libro libro;
	private Estudiante estudiante;
	
	public Prestamo(Integer iD, Libro libro, Estudiante estudiante) {
		this.iD = iD;
		this.libro = libro;
		this.estudiante = estudiante;
	}
	
}
