package dominio;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;


abstract class Entidade
{
	@Id
	@GeneratedValue
	protected long _id;

	protected long getId() {
		return _id;
	}

	protected void setId(long id) {
		this._id = id;
	}
		
}
