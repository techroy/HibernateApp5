package com.javahome.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8468047904713468279L;

	@EmbeddedId
	ProductKey2 productKey2;

	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	

	

	public ProductKey2 getProductKey2() {
		return productKey2;
	}

	public void setProductKey2(ProductKey2 productKey2) {
		this.productKey2 = productKey2;
	}

	@Override
	public String toString() {
		return "Product [productKey=" + productKey2 + ", price=" + price + "]";
	}

	

}
