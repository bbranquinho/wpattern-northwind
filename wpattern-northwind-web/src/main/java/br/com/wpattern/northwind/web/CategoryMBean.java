package br.com.wpattern.northwind.web;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;

import br.com.wpattern.northwind.utils.database.beans.CategoryBean;
import br.com.wpattern.northwind.utils.service.interfaces.IServices;

@ManagedBean(name = "categoryMBean")
@SessionScoped
public class CategoryMBean extends CategoryBean implements Serializable {

	private static final long serialVersionUID = -6877942214523121226L;

	private Logger logger = Logger.getLogger(this.getClass());

	public List<CategoryBean> getCategories() {
		IServices services = Factory.getServices();

		this.logger.info(services);

		return services.findAllCategories();
	}

}