package org.itstep.dao.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "STORES")
public class Store implements Serializable{

	private static final long serialVersionUID = 6579832572361398486L;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "ID", unique= true, nullable = false)
	private long id;
	
	@Column(name="NAME", length=60, nullable = false)
	private String name;
	
	@OneToMany(mappedBy = "store", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Product> products = new ArrayList<>();
	
	public Store() {
		// TODO Auto-generated constructor stub
	}

	public Store(String name) {
		this.name = name;
	}
	
}
