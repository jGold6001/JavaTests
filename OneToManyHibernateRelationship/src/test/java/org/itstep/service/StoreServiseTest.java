package org.itstep.service;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.itstep.App;
import org.itstep.dao.pojo.Product;
import org.itstep.dao.pojo.Store;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StoreServiseTest {

	@Autowired
	private StoreService storeService;
	
	@Autowired
	private ProductService productService;
	
	private Store store;
	private List<Product> products;
	
	@Before
	public void setData() {
		store = new Store("MobiDick");
		products = Arrays.asList(
				new Product("Lenovo VIBE", "Cellphone"),
				new Product("Apple iPone 5", "Cellphone"),
				new Product("Huawei MediaPad T3", "Table")
		);
		store.getProducts().add(products.get(0));
		store.getProducts().add(products.get(1));
		store.getProducts().add(products.get(2));
	}
	
	@Test
	public void test1CreateOrUpdateStore() {
		Store storeInDb = storeService.createOrUpdate(store);
		assertEquals(storeInDb.getName(), store.getName());
	}
	
	@Test
	public void test2FindAllAndDeleteProducts() {
		List<Product> productsInDb =  productService.getAll();
		int count=0;
		for (Product product : productsInDb) {
			assertEquals(product.getName(), products.get(count).getName());
			productService.delete(product.getId());
			count++;
		}
	}
	
	@Test
	public void test3DeleteStore() {
		List<Store> stores = storeService.getAll();
		Store storeInDb = stores.get(0);
		storeService.delete(storeInDb.getId());
	}
	
	
}
