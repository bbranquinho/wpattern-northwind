package br.com.wpattern.northwind.test.business.utils;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/ctx-wpattern-northwind-test-business.xml" })
public abstract class AbstractBusinessTestBase {

}
