package br.com.wpattern.northwind.application.test.factory;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"/ctx-wpattern-northwind-application-test-factory.xml",
		"/ctx-wpattern-northwind-applicaton-service-client-integration.xml",
		"/ctx-wpattern-northwind-application.xml"
})
public abstract class AbstractFactoryTestBase {

}
