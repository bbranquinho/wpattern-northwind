package br.com.wpattern.northwind.test.service.base;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { AbstractServiceTestBase.SERVICE_TEST_CONTEXT })
public abstract class AbstractServiceTestBase {

	public static final String SERVICE_TEST_CONTEXT = "/ctx-wpattern-northwind-test-service.xml";

}
