package br.com.wpattern.northwind.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.wpattern.northwind.factory.interfaces.IFactoryDistribution;

public class NorthwindMain {

	private static final String BUSINESS_CONTEXT = "/ctx-wpattern-northwind-business.xml";

	private static final String DATABASE_CONTEXT = "/ctx-wpattern-northwind-database.xml";

	private static final String FACTORY_CONTEXT = "/ctx-wpattern-northwind-factory.xml";

	private static final String SERVICE_CONTEXT = "/ctx-wpattern-northwind-service.xml";

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(BUSINESS_CONTEXT, DATABASE_CONTEXT,
				FACTORY_CONTEXT, SERVICE_CONTEXT);

		IFactoryDistribution factoryDistribution = context.getBean(IFactoryDistribution.class);

		factoryDistribution.startApplication();
	}

}
