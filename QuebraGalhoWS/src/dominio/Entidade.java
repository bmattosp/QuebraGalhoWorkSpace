package dominio;

abstract class Entidade
{
	private int _id;

	protected int getId() {
		return _id;
	}

	protected void setId(int id) {
		this._id = id;
	}
		
}
