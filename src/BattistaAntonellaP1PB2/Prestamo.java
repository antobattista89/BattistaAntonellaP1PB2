package BattistaAntonellaP1PB2;

public class Prestamo {

	private Integer iD;
	private Libro libro;
	private Estudiante estudiante;
	
	public Prestamo(Integer iD, Libro libro, Estudiante estudiante) {
		this.iD = iD;
		this.libro = libro;
		this.estudiante = estudiante;
	}
	
	public Libro getLibro()
	{

		return libro;
		
	}
	
	public Estudiante getEstudiante()
	{

		return estudiante;
		
	}
	
}
