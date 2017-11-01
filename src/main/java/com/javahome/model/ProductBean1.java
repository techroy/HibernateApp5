package com.javahome.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class ProductBean1 {


	/**
	 * 
	 */
	private static final long serialVersionUID = 8468047904713468279L;

	@EmbeddedId
	private ProductKey ProductKey;
	
	@Column
	private int price;

	
	
	
	public ProductKey getProductKey() {
		return ProductKey;
	}

	public void setProductKey(ProductKey productKey) {
		ProductKey = productKey;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
	
	
	

}
