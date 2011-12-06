package tr.com.srdc.icardea.service;

import tr.com.srdc.icardea.service.impl.HelloWorldServiceImpl;

import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

public class HelloWorldServiceTest extends AbstractDependencyInjectionSpringContextTests {

	private HelloWorldService helloWorldService;
	
	public void setHelloWorldService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}
	
	protected String[] getConfigLocations() {
		return new String[] {"applicationContext-resource.xml", "applicationContext-service.xml"};
	}
	
	public void testSay() {
		assertTrue(helloWorldService.say("Trung").startsWith("Hello"));
	}

}

