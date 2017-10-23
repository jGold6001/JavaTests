package org.itstep.dao;

import org.itstep.dao.pojo.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreDAO extends JpaRepository<Store, Long>{

}
