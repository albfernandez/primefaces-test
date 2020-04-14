package org.primefaces.test;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class TestInputNumber  implements Serializable {
	
	private static final long serialVersionUID = -578794668648782036L;
	
	private BigDecimal number;
	
	public TestInputNumber() {
		super();
	}
	
	public BigDecimal getNumber() {
		return number;
	}
	public void setNumber(BigDecimal number) {
		this.number = number;
	}

	
}
