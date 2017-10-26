package org.itstep.java_tests.jackson;

import org.itstep.java_tests.pojo.User;
import org.junit.Test;

//@Slf4j
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = App.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FastjsonManagerTest {

	//@Autowired
	//FastjsonManager fm;
	
	@Test
	public void testGetFromJSON() {
		FastjsonManager fm = new FastjsonManager(); 
		User user = fm.getFromJSON();
	}

}
