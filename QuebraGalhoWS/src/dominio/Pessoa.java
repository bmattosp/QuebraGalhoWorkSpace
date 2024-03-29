package dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)  
public class Pessoa
{
	@Id
	@GeneratedValue
	private long id;
	
	private String nome;
	
	private String nomeUsuario;

}
