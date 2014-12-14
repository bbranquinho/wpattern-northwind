package br.com.wpattern.northwind.web;

import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import br.com.wpattern.northwind.utils.database.beans.CategoryBean;

@ManagedBean
public class CategoryConvertor implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value == null) {
			return null;
		}
		Long id = Long.parseLong(value);

		return Factory.getServices().findCategoryById(id);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value == null) {
			return null;
		}

		Long id = ((CategoryBean) value).getCategoryId();

		return (id != null) ? id.toString() : null;
	}

}
