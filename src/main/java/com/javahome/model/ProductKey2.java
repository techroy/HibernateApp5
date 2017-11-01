package com.javahome.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ProductKey2 implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3634630082536167133L;

	private int pid;

	private String pname;

	public ProductKey2(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}

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
