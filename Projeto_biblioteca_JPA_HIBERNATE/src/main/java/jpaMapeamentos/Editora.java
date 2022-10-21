package jpaMapeamentos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//BIBLIOTECA ADICIONAL PARA FAZER A CHAVE ESTRANGEIRA NA CARDINALIDADE MUITOS PARA UM
import javax.persistence.ManyToOne;

@Entity
public class Editora{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//AUTO INCREMENTO DO ID
	
	private int ID_Editora;
	private String nome;
	private String contato;
	private String endereco;
	
	//FAZENDO MAPEAMENTO DE CHAVE ESTRANGEIRA
	@ManyToOne
	private Autor ID_Autor_FK;//REFERÊNCIANDO O OBJETO QUE SERÁ CHAVE ESTRANGEIRA
	
	/*//NAO APAGAR ESTE TRECHO
	@ManyToOne
	private Livro ISBN_FK;
	*/
	
	//CONSTRUTOR PASSANDO VALORES
	public Editora(String nome, String contato, String endereco, Autor ID_Autor_FK/*, Livro ISBN_FK*/) {
		super();
		this.nome = nome;
		this.contato = contato;
		this.endereco = endereco;
		this.ID_Autor_FK = ID_Autor_FK;
		/*this.ISBN_FK = ISBN_FK;*///NAO APAGAR ESTE TRECHO
	}

	//CONSTRUTOR SEM VALORES
	public Editora() {
		super();
	}

	//Getters and Setters
	public int getID_Editora() {
		return ID_Editora;
	}

	public void setID_Editora(int ID_Editora) {
		ID_Editora = ID_Editora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Autor getID_Autor_FK() {
		return ID_Autor_FK;
	}

	public void setID_Autor_FK(Autor ID_Autor_FK) {
		ID_Autor_FK = ID_Autor_FK;
	}
	
	/*//NAO APAGAR ESTE TRECHO
	
	public Livro getISBN_FK() {
		return ISBN_FK;
	}

	public void setISBN_FK(Livro ISBN_FK) {
		ISBN_FK = ISBN_FK;
	}
	 
	*/
	
	
}
