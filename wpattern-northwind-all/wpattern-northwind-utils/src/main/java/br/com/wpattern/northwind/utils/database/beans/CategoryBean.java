package br.com.wpattern.northwind.utils.database.beans;

import br.com.wpattern.northwind.utils.beans.BaseBean;

public class CategoryBean extends BaseBean {

	private static final long serialVersionUID = 6717824652105201927L;

	private Long categoryId;

	private String categoryName;

	private String description;

	private Byte[] picture;

	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Byte[] getPicture() {
		return this.picture;
	}

	public void setPicture(Byte[] picture) {
		this.picture = picture;
	}

}
