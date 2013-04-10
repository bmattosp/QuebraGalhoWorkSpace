package dominio;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Profisional extends PessoaFisica
{
	private short avaliacao;
}
