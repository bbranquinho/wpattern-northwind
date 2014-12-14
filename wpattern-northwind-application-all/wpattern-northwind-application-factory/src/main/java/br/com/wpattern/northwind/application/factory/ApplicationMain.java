package br.com.wpattern.northwind.application.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.wpattern.northwind.application.factory.interfaces.IFactoryDistribution;

public class ApplicationMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext( "/ctx-wpattern-northwind-application-factory.xml",
				"/ctx-wpattern-northwind-application.xml", "/ctx-wpattern-northwind-applicaton-service-client.xml" );

		IFactoryDistribution factoryDistribution = context.getBean(IFactoryDistribution.class);

		factoryDistribution.startApplication();
	}

}
