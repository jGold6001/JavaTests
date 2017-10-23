package org.itstep.dao;

import java.util.List;

import org.itstep.dao.pojo.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDAO extends JpaRepository<Product, Long>{
	
	@Query(value="SELECT * FROM PRODUCTS WHERE CATEGORY= ?1", nativeQuery=true)
	public List<Product> findByCategory(String category);

}
