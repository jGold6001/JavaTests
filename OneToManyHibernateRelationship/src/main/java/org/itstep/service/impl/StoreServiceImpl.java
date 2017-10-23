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
	private StoreDAO stroreDAO;
	
	public Store createOrUpdate(Store store) {
		return stroreDAO.saveAndFlush(store);
	}

	public void delete(long id) {
		stroreDAO.delete(id);
	}

	public Store getOne(long id) {
		return stroreDAO.getOne(id);
	}

	@Override
	public List<Store> getAll() {
		return stroreDAO.findAll();
	}

}
