package org.itstep.java_tests.jackson;

import org.itstep.java_tests.pojo.User;

import com.alibaba.fastjson.JSON;

public class FastjsonManager {
	public User getFromJSON() {
		return JSON.parseObject("", User.class);
	}
}
