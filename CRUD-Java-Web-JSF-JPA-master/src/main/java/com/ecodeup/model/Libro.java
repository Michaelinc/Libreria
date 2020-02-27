package com.ecodeup.model;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="libro")
public class Libro implements Serializable {
	@Id
	private String ISBN;
	@Column(name = "TITULO")
	private String titulo;
	@Column(name = "AUTOR")
	private String autor;
	@Column(name = "DESCRIPCION")
	private String descripcion;
	@Column(name = "PAGINAS")
	private Long paginas;
        @Column(name = "EDICION")
	private String edicion;

        public String getISBN() {
            return ISBN;
        }

        public void setISBN(String ISBN) {
            this.ISBN = ISBN;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public Long getPaginas() {
            return paginas;
        }

        public void setPaginas(Long paginas) {
            this.paginas = paginas;
        }

        public String getEdicion() {
            return edicion;
        }

        public void setEdicion(String edicion) {
            this.edicion = edicion;
        }
        
        

    @Override
    public String toString() {
        return "Cliente{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", descripcion=" + descripcion + ", paginas=" + paginas + '}';
    }
        
        
}
