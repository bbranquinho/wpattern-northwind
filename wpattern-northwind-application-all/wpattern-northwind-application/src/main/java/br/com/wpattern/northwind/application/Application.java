package br.com.wpattern.northwind.application;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.wpattern.northwind.application.utils.interfaces.IApplication;

@Named
public class Application implements IApplication {

	@Inject
	private MainApplication window;

	@Override
	public void start() {
		Application.this.window.start();
	}

}
