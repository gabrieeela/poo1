package libros;

import java.util.Objects;

public class Libro {
	
	private String titulo;
	private String autor;
	private Genero genero;
	private int cantPaginas;

	public Libro(String titulo, String autor, Genero genero, int cantPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.cantPaginas = cantPaginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getCantPaginas() {
		return cantPaginas;
	}

	public Genero getGenero() {
		return genero;
	}
	
	public int getTiempoEnLeer() {
		return this.cantPaginas;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", cantPaginas=" + cantPaginas
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(titulo, autor, genero, cantPaginas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (cantPaginas != other.cantPaginas)
			return false;
		if (genero != other.genero)
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}


}
