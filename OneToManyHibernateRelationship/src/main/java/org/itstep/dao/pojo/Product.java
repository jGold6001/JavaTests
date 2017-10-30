package org.itstep.dao.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PRODUCTS")
public class Product implements Serializable{

	private static final long serialVersionUID = 6486258280474363278L;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "ID", unique= true, nullable = false)
	private long id;
	
	@Column(name="NAME", length=60, nullable = false)
	private String name;
	
	@Column(name="CATEGORY", length=60, nullable = false)
	private String category;
	
	@ManyToOne
	@JoinColumn(name = "STORE_ID")
    private Store store;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, String category) {
		this.name = name;
		this.category = category;
	}
	
	
}
