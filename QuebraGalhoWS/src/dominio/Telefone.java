package dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Telefone 
{
	@Id
	@GeneratedValue
	private long id;
	
	private long numero;
	private int ddd;
	private int ddi;

}
