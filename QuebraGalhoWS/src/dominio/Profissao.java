package dominio;

public class Profissao extends Entidade
{
	private String _nome;
	private String _descricao;
	
	public String getNome() {
		return _nome;
	}
	public void setNome(String _nome) {
		this._nome = _nome;
	}
	public String getDescricao() {
		return _descricao;
	}
	public void setDescricao(String _descricao) {
		this._descricao = _descricao;
	}
	
	
	
}
