package dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Bairro 
{
	@Id
	@GeneratedValue
	private long id;
	
	private String nome;
	
	@ManyToOne
	@JoinColumn (name ="id", updatable=false, insertable=false)
	private Cidade cidade;
}
