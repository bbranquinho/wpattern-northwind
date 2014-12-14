package br.com.wpattern.northwind.web;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.wpattern.northwind.utils.service.interfaces.IServices;

@Named
public class Factory {

	private static IServices services;

	@Inject
	public Factory(IServices services) {
		Factory.services = services;
	}

	public static IServices getServices() {
		return services;
	}

}
