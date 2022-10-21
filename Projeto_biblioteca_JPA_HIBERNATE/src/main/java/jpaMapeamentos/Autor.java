package jpaMapeamentos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//BIBLIOTECA ADICIONAL PARA FAZER A CHAVE ESTRANGEIRA NA CARDINALIDADE MUITOS PARA UM
import javax.persistence.ManyToOne;

@Entity
public class Autor{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO INCREMENTO DO ID
	
	private int ID_Autor;
	private String nome;
	private String nacionalidade;
	
	//FAZENDO MAPEAMENTO DE CHAVE ESTRANGEIRA
	@ManyToOne
	private Editora ID_Editora_FK;//REFERÊNCIANDO O OBJETO QUE SERÁ CHAVE ESTRANGEIRA 
	
	//CONSTRUTOR PASSANDO VALORES
	public Autor(String nome, String nacionalidade, Editora ID_Editora_FK) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.ID_Editora_FK = ID_Editora_FK;
	}
	
	//CONSTRUTOR SEM VALORES
	public Autor() {
		super();
	}

	//GETTERS AND SETTERS
	public int getID_Autor() {
		return ID_Autor;
	}

	public void setID_Autor(int ID_Autor) {
		ID_Autor = ID_Autor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public Editora getID_Editora_FK() {
		return ID_Editora_FK;
	}

	public void setID_Editora_FK(Editora ID_Editora_FK) {
		ID_Editora_FK = ID_Editora_FK;
	}

}
