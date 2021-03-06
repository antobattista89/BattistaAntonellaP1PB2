package BattistaAntonellaP1PB2;


public abstract class Libro {
	
	private String codigo;
	private String nombre;
	private String autor;
	private Boolean fuePrestado;
	
	Libro(String codigo, String nombre, String autor) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.autor = autor;
		this.fuePrestado=false;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Boolean getFuePrestado() {
		return fuePrestado;
	}

	public void setFuePrestado(Boolean fuePrestado) {
		this.fuePrestado = fuePrestado;
	}
	
}
