package org.itstep.java_tests.jackson;

import java.io.IOException;
import java.util.List;

import org.itstep.java_tests.pojo.User;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class JacksonManagerTest {

	
	@Test
	public void test() throws JsonParseException, JsonMappingException, IOException {
		JacksonManager jm = new JacksonManager();
		List<User> users = jm.getArraytFromJSON();
		for (User user : users) {
			System.out.println(user);
		}
	}

}
