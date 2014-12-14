package br.com.wpattern.northwind.utils.database.interfaces;

import java.util.List;

import br.com.wpattern.northwind.utils.database.beans.SupplierBean;

public interface ISupplierService extends IServiceBase<SupplierBean, Long> {

	List<SupplierBean> findSuppliersByProductName(String productName);

}
