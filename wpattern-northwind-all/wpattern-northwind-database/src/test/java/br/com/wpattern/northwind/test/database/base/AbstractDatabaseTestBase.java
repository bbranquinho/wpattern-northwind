package br.com.wpattern.northwind.test.database.base;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/ctx-wpattern-northwind-test-database.xml" })
public abstract class AbstractDatabaseTestBase {

}
