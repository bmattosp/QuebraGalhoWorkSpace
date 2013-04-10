package dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Cidade 
{
	@Id
	@GeneratedValue
	private long id;
	
	private String nome;
	
}
