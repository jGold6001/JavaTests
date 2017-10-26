package org.itstep.java_tests.jackson;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.itstep.java_tests.pojo.User;
import org.springframework.util.ResourceUtils;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperManager {
	
	private ObjectMapper objectMapper = new ObjectMapper(); 
	
	public void readJSON() throws JsonParseException, JsonMappingException, IOException {
		objectMapper.readValue(ResourceUtils.getFile("classpath:users.json"), User.class);
		
	}
}
