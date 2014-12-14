package br.com.wpattern.northwind.application.test.factory;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.wpattern.northwind.application.factory.interfaces.IFactoryDistribution;

public class ApplicationDistributionTest extends AbstractFactoryTestBase {

	private final Logger logger = Logger.getLogger(this.getClass());

	@Inject
	private IFactoryDistribution factoryDistribution;

	@Test
	public void startApplication() {
		this.factoryDistribution.startApplication();

		Object waitObject = new Object();

		synchronized (waitObject) {
			while (true) {
				try {
					waitObject.wait();
				} catch (InterruptedException e) {
					this.logger.error(e.getMessage(), e);
				} catch (Exception e) {
					this.logger.error(waitObject);
				}
			}
		}
	}

}
