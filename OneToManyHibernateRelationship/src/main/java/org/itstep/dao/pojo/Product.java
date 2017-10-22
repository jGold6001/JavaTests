package org.itstep.dao.pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name) {
		this.name = name;
	}
	
	
}
