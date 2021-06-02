package BattistaAntonellaP1PB2;

public class Biblioteca {

	private Libro libros[];
	private Prestamo prestamo[];
	
	
	public Biblioteca(Integer totalLibros) {
		this.libros = new Libro[totalLibros];
		this.prestamo = new Prestamo[totalLibros];
	}
	
	public Boolean prestarLibro(Libro libro, Estudiante estudiante, Integer indice) {

		if (this.puedeRetirar(estudiante))
		{
			if (!libro.getFuePrestado())
			{
				this.prestamo[indice] = new Prestamo(indice, libro,estudiante);
				this.libros[indice].setFuePrestado(true);
				
				return true;
				
			}
		}		
		return false;
	}
	
	public void agregarLibro(Integer index, Libro libro)
	{
		this.libros[index] = libro;
		
	}
	
	public void recibirLibro(Libro libro) {

		if (libro.getFuePrestado())
		{
	         for ( Integer i = 0; i < this.prestamo.length; i++) {
	             
	             if (this.prestamo[i] != null)
	             {
	                 if (this.prestamo[i].getLibro().getCodigo() == libro.getCodigo() )
	                 {
	                     this.prestamo[i] = null;
	                     this.libros[i].setFuePrestado(false);
	                     
	                 }
	             }
	         }
		}
		
	}
	
	public Boolean puedeRetirar(Estudiante estudiante) {
	 Integer contadorDePrestamos=0;
	 
     for ( Integer i = 0; i < this.prestamo.length; i++) {
         
         if (this.prestamo[i] != null)
         {
             if (this.prestamo[i].getEstudiante().getDni() == estudiante.getDni() )
             {
            	 contadorDePrestamos++;                 
             }
         }
     }
     
     return (contadorDePrestamos <2);
	}

	public String imprimir(Libro libro) {

		String texto = "";
		
		if (libro instanceof Historia)
		{
			texto = ((Historia) libro).Fotocopiar();
		}
		

		if (libro instanceof Geografia)
		{
			texto = ((Geografia) libro).Fotocopiar();
		}
		
		return texto;
	}
	
	
	
	
}
