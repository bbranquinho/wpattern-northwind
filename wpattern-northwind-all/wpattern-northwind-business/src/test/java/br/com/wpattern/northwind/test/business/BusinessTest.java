package br.com.wpattern.northwind.test.business;

import javax.inject.Inject;

import org.junit.Test;

import br.com.wpattern.northwind.business.interfaces.IBusiness;
import br.com.wpattern.northwind.test.business.base.AbstractBusinessTestBase;

public class BusinessTest extends AbstractBusinessTestBase {

	@Inject
	private IBusiness business;

	@Test
	public void businessTest() {
		this.business.print();
	}

}
