package org.itstep.service;

import java.util.List;

import org.itstep.dao.pojo.Product;

public interface ProductService {
	public Product createOrUpdate(Product product);
	public void delete(long id);
	public Product getOne(long id);
	public Product getOne(String name);
	public List<Product> getAll();
	public List<Product> findByCategory(String category);
}
