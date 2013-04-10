package dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Endereco
{
	@Id
	@GeneratedValue
	private long id;
	
	private String endereco;
	private String complemento;
	private int tipoEndereco;
	
	@ManyToOne()
	@JoinColumn (name ="id", updatable=false, insertable=false)
	private Cidade cidade;
	
	@ManyToOne
	@JoinColumn (name ="id", updatable=false, insertable=false)
	private Bairro bairro;

}
