package br.com.wpattern.northwind.application.interfaces;

public interface ICategoryData {

	public void clearFields();

	public Long getCategoryId();

	public String getCategoryName();

	public String getCategoryDescription();

	public Byte[] getPicture();

}
