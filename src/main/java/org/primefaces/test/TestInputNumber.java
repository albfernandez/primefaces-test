package org.primefaces.test;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class TestInputNumber implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer example;
	
	public TestInputNumber() {
		super();
	}

	public Integer getExample() {
		return example;
	}

	public void setExample(Integer example) {
		this.example = example;
	}
	
}
