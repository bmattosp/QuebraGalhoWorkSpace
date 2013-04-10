package dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Profissao
{
	@Id
	@GeneratedValue
	private long id;
	
	private String nome;
	
	private String descricao;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String _nome) {
		this.nome = _nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String _descricao) {
		this.descricao = _descricao;
	}
	
	
	
}
