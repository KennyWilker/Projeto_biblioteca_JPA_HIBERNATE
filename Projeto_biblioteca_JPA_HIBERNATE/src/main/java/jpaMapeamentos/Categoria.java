package jpaMapeamentos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;

@Entity
public class Categoria {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO INCREMENTO DO ID
	
	private int ID_Cat;
	private String Categoria, Descricao;
	
	@ManyToOne
	private Editora Editora_FK;
	
	public Categoria(String Categoria, String Descricao, Editora Editora_FK) {
		super();
		this.Categoria = Categoria;
		this.Descricao = Descricao;
		this.Editora_FK = Editora_FK;
	}
	
	
	public Categoria() {
		super();
	}


	public int getID_Categoria() {
		return ID_Cat;
	}
	public void setID_Categoria(int iD_Categoria) {
		ID_Cat = iD_Categoria;
	}
	public String getNome_categoria() {
		return Categoria;
	}
	public void setNome_categoria(String nome_categoria) {
		this.Categoria = nome_categoria;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		this.Descricao = descricao;
	}
	public Editora getEditora_FK() {
		return Editora_FK;
	}
	public void setEditora_FK(Editora editora_FK) {
		this.Editora_FK = editora_FK;
	}
	
	
}
