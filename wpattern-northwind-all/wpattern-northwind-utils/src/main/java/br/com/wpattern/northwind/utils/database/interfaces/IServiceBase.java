package br.com.wpattern.northwind.utils.database.interfaces;

import java.io.Serializable;
import java.util.List;

import br.com.wpattern.northwind.utils.beans.BaseBean;

public interface IServiceBase<T extends BaseBean, ID extends Serializable> {

	T findById(ID id);

	List<T> findAll();

	ID insert(T bean);

	void update(T bean);

	void delete(T bean);

}
