package org.itstep.java_tests.jackson;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.Test;
import org.springframework.util.ResourceUtils;

public class ObjectMapperManagerTest {

	@Test
	public void test() throws FileNotFoundException {
		File file = ResourceUtils.getFile("classpath:users.json");	 
		System.out.println("File Found : " + file.exists());
	}

}
