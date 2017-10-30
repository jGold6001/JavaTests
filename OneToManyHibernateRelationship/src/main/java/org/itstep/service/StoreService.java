package org.itstep.service;

import java.util.List;

import org.itstep.dao.pojo.Store;

public interface StoreService {
	public Store createOrUpdate(Store store);
	public void delete(long id);
	public Store getOne(long id);
	public Store getOne(String name);
	public List<Store> getAll();
}
