package jpaMapeamentos;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;

@Entity
public class Livro {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO INCREMENTO DO ID
	
	private int ISBN;
	private String Titulo;
	private String Ano;
	
	@ManyToOne
	private Editora Editora;
	private Categoria ID_Cat_FK;
	private Autor ID_Autor_FK;
	
	public Livro(int ISBN, String Titulo, String Ano, Editora Editora, Categoria categoria_fk, Autor autor_fk) {
		super();
		this.ISBN = ISBN;
		this.Titulo = Titulo;
		this.Ano = Ano;
		this.Editora = Editora;
		this.ID_Cat_FK = categoria_fk;
		this.ID_Autor_FK = autor_fk;
	}

	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIsbn() {
		return ISBN;
	}

	public void setIsbn(int isbn) {
		this.ISBN = isbn;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		this.Titulo = titulo;
	}
	
	
	public String getAno() {
		return Ano;
	}

	public void setAno(String ano) {
		Ano = ano;
	}

	public Editora getEditora_fk() {
		return Editora;
	}

	public void setEditora_fk(Editora editora_fk) {
		this.Editora = editora_fk;
	}

	public Categoria getCategoria_fk() {
		return ID_Cat_FK;
	}

	public void setCategoria_fk(Categoria categoria_fk) {
		this.ID_Cat_FK = categoria_fk;
	}

	public Autor getAutor_fk() {
		return ID_Autor_FK;
	}

	public void setAutor_fk(Autor autor_fk) {
		this.ID_Autor_FK = autor_fk;
	}
	
	
}
