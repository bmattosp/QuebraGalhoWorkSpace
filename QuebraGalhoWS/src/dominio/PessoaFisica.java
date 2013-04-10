package dominio;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;



@Entity
@Inheritance(strategy=InheritanceType.JOINED) 
@PrimaryKeyJoinColumn(name="id")
public class PessoaFisica extends Pessoa 
{
	private BigDecimal rg;
	private BigDecimal cpf;
	
	@Enumerated(EnumType.STRING)
	private EnumEstadoCivil EstadoCivil;
	
	private char Sexo;
}
