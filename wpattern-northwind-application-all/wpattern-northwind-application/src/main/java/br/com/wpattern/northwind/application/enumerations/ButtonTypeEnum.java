package br.com.wpattern.northwind.application.enumerations;

public enum ButtonTypeEnum {

	INSERT("Adicionar"),

	UPDATE("Atualizar"),

	DELETE("Deletar"),

	FIND("Buscar");

	private final String text;

	private ButtonTypeEnum(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}

}
