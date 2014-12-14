package br.com.wpattern.northwind.database.utils;

import java.io.Serializable;
import java.util.List;

import br.com.wpattern.northwind.utils.beans.BaseBean;
import br.com.wpattern.northwind.utils.database.interfaces.IServiceBase;

public abstract class GenericService<T extends BaseBean, K extends BaseEntity, ID extends Serializable>
extends GenericServiceWithKey<T, K, ID, ID> implements IServiceBase<T, ID> {

	/////////////////////////////////////////////////////////////////////////////////
	// PUBLIC METHODS (IServiceBase)
	/////////////////////////////////////////////////////////////////////////////////

	@Override
	public T findById(ID id) {
		return parserEntity(this.getConcreteDao().findById(id));
	}

	@Override
	public List<T> findAll() {
		return parserEntity(this.getConcreteDao().findAll());
	}

	@Override
	public ID insert(T bean) {
		return getConcreteDao().save(parserBean(bean));
	}

	@Override
	public void update(T bean) {
		this.getConcreteDao().update(parserBean(bean));
	}

	@Override
	public void delete(T bean) {
		this.getConcreteDao().delete(parserBean(bean));
	}

}
