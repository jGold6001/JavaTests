package org.itstep.java_tests.jackson;

import java.io.File;

import org.itstep.java_tests.pojo.User;

import com.alibaba.fastjson.JSON;

public class FastjsonManager {
	public User getFromJSON() {
//		ClassLoader classLoader = getClass().getClassLoader();
//		File file = new File(classLoader.getResource("users.json").getFile());
		return JSON.parseObject(file.getPath(), User.class);
	}
}
