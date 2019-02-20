package com.cg.ems.dto;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="supplier_masterr")
public class Supplier {
	@Id
	@Column(name="supp_id",length=10)
	private int supplierId;
	@Temporal(value=TemporalType.DATE)
	private Date supplyDate;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="prod_supply",
		joinColumns= {
				@JoinColumn(name="supp_id")},
				inverseJoinColumns= {@JoinColumn(name="prod_code")})
		
	Set<Product> productSet=new HashSet();
	
	
	public Set<Product> getProductSet() {
		return productSet;
	}
	public void setProductSet(Set<Product> productSet) {
		this.productSet = productSet;
	}
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public Date getSupplyDate() {
		return supplyDate;
	}
	public void setSupplyDate(Date supplyDate) {
		this.supplyDate = supplyDate;
	}
	public Supplier(int supplierId, Date supplyDate) {
		super();
		this.supplierId = supplierId;
		this.supplyDate = supplyDate;
	}
	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", supplyDate=" + supplyDate + ", productSet=" + productSet + "]";
	}
	
	
	

}
