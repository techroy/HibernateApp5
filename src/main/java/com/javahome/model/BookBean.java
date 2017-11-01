package com.javahome.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Book")
public class BookBean {

	@Id
	@Column(name = "bid")
	//@GenericGenerator(strategy="org.hibernate.id.IncrementGenerator",name="incr")
	//@GeneratedValue(generator="incr")
	
	/******/
	//@GeneratedValue(strategy=GenerationType.AUTO)
	/******/
	@GenericGenerator(strategy="org.hibernate.id.UUIDGenerator",name="uuidgen")
	@GeneratedValue(generator="uuidgen")
	private String Id;

	@Column(name = "name")
	private String bookName;

	@Column
	private int price;

	@Version
	@Column(name = "vercol")
	private int ver;

	@Transient
	private int avgPrice;

	public int getAvgPrice() {
		return avgPrice;
	}

	public void setAvgPrice(int avgPrice) {
		this.avgPrice = avgPrice;
	}

	/*public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}*/

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getVer() {
		return ver;
	}

	public void setVer(int ver) {
		this.ver = ver;
	}
	

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	@Override
	public String toString() {
		return "BookBean [Id=" + Id + ", bookName=" + bookName + ", price=" + price + "]";
	}

}
