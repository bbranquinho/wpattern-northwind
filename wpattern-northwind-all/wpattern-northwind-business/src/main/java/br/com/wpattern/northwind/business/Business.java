package br.com.wpattern.northwind.business;

import javax.inject.Named;

import org.apache.log4j.Logger;

import br.com.wpattern.northwind.business.interfaces.IBusiness;

@Named
public class Business implements IBusiness
{
	private final Logger logger = Logger.getLogger(this.getClass());

	@Override
	public void print() {
		if (this.logger.isDebugEnabled()) {
			this.logger.info("Business Test");
		}
	}

}
