package br.com.wpattern.northwind.application.factory;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.log4j.Logger;

import br.com.wpattern.northwind.application.factory.interfaces.IFactoryDistribution;
import br.com.wpattern.northwind.application.utils.interfaces.IApplication;

@Named
public class FactoryApplicationDistribution implements IFactoryDistribution {

	private final Logger logger = Logger.getLogger(this.getClass());

	@Inject
	private IApplication application;

	@Override
	public void startApplication() {
		try {
			this.application.start();
		} catch (Exception e) {
			this.logger.error(e.getMessage(), e);
		}
	}

}
