package org.itstep.service.impl;

import java.util.List;

import org.itstep.dao.StoreDAO;
import org.itstep.dao.pojo.Store;
import org.itstep.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl implements StoreService {

	@Autowired
	private StoreDAO storeDAO;
	
	@Override
	public Store createOrUpdate(Store store) {
		return storeDAO.saveAndFlush(store);
	}

	@Override
	public void delete(long id) {
		storeDAO.delete(id);
	}

	@Override
	public Store getOne(long id) {
		return storeDAO.getOne(id);
	}
	
	@Override
	public Store getOne(String name) {
		return storeDAO.getOneByName(name);
	}

	@Override
	public List<Store> getAll() {
		return storeDAO.findAll();
	}
}
