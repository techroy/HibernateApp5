package com.javahome.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class ProductKey implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 173323654875128741L;

	
	@Column
	private int pid;

	@Column
	private String pname;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

}
