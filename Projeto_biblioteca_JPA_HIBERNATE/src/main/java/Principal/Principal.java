package Principal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import jpaMapeamentos.Autor;
import jpaMapeamentos.Editora;

public class Principal {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca_jpa_hibernate"); // CRIA UMA FÁBRICA GERENCIADORA DE ENTIDADES
		EntityManager em = emf.createEntityManager();//CRIA ENTIDADE
		
		em.getTransaction().begin();//ABRE TRANSACAO COM BD
		
		//CRIANDO INSTANCIAS AUTORES
		jpaMapeamentos.Autor autor1 = new jpaMapeamentos.Autor();
		
		//CRIANDO INSTANCIAS EDITORAS
		jpaMapeamentos.Editora editora1 = new jpaMapeamentos.Editora();
		
		//PREENCHENDO DADOS AUTORES
		//AUTOR 1
		autor1.setNome("Higor");
		autor1.setNacionalidade("Brasileiro");
		autor1.setID_Editora_FK(editora1);
		
		//PREENCHENDO DADOS EDITORAS
		//EDITORA 1
		editora1.setNome("Paper&Paper");
		editora1.setContato("paper@gmail.com");
		editora1.setEndereco("AV.Fedora");
		editora1.setID_Autor_FK(autor1);
		
		//ARMAZENANDO NO BANCO
		em.persist(autor1);
		em.persist(editora1);
		
		
		em.getTransaction().commit();//FECHA CONEXAO COM BD
		em.close();
		emf.close();
	}

}
