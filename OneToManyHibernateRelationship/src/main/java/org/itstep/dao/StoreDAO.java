package org.itstep.dao;

import org.itstep.dao.pojo.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreDAO extends JpaRepository<Store, Long>{
	
	@Query(value="SELECT * FROM STORES WHERE NAME = ?1", nativeQuery=true)
	public Store getOneByName(String name);
	
}
