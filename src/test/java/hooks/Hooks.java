package hooks;

import com.baseclass.com.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{
	
	@Before
	private void beforeHooks() {
//		String name = scenario.getName();
		System.out.println("----------------");

	}
	
	@After
	private void afterHooks() throws Exception {
//		Status status = scenario.getStatus();
		System.out.println("----------------");
		

	}

}
