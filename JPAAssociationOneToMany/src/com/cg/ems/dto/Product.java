package com.cg.ems.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="product_masterr")
public class Product {
	 
	@Id
	@Column(name="prod_code",length=10)
	private int productCode;
	@Column(name="prod_name",length=25)
	private String prodName;
	@Column(name="prod_price",length=10)
	private int productPrice;
	
	@ManyToMany(mappedBy="productSet")
	Set<Supplier> supSet=new HashSet();
	
	public Set<Supplier> getSupSet() {
		return supSet;
	}
	public void setSupSet(Set<Supplier> supSet) {
		this.supSet = supSet;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productCode, String prodName, int productPrice) {
		super();
		this.productCode = productCode;
		this.prodName = prodName;
		this.productPrice = productPrice;
	}
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", prodName=" + prodName + ", productPrice=" + productPrice
				+ ", supSet=" + supSet + "]";
	}
	
	
}
