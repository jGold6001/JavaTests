package org.itstep.service.impl;

import java.util.List;

import org.itstep.dao.ProductDAO;
import org.itstep.dao.pojo.Product;
import org.itstep.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productDAO;
	
	public Product createOrUpdate(Product product) {
		return productDAO.saveAndFlush(product);
	}

	public void delete(long id) {
		productDAO.delete(id);
	}

	public Product getOne(long id) {
		return productDAO.getOne(id);
	}
	
	@Override
	public List<Product> getAll() {
		return productDAO.findAll();
	}

	@Override
	public List<Product> findByCategory(String category) {
		return productDAO.findByCategory(category);
	}

	@Override
	public Product getOne(String name) {
		return productDAO.getOneByName(name);
	}
}
