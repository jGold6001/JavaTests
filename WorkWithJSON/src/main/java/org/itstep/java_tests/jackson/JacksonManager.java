package org.itstep.java_tests.jackson;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.itstep.java_tests.pojo.User;


import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonManager {
	public List<User> getArraytFromJSON() throws JsonParseException, JsonMappingException, IOException {
		return new ObjectMapper().readValue(new File(getClass().getClassLoader().getResource("users.json").getFile()), new TypeReference<List<User>>(){});
	}
}
