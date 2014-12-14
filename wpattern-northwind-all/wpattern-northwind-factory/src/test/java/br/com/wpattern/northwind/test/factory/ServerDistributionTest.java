package br.com.wpattern.northwind.test.factory;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.wpattern.northwind.factory.interfaces.IFactoryDistribution;
import br.com.wpattern.northwind.test.factory.base.AbstractFactoryTestBase;

public class ServerDistributionTest extends AbstractFactoryTestBase {

	private static final Logger logger = Logger.getLogger(ServerDistributionTest.class);

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
					logger.error(e.getMessage(), e);
				} catch (Exception e) {
					logger.error(waitObject);
				}
			}
		}
	}

}
