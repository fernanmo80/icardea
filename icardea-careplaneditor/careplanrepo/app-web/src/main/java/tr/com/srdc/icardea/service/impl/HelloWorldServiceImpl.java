/**
 * Copyright Standard Chartered Bank Singapore.
 */
package tr.com.srdc.icardea.service.impl;

import tr.com.srdc.icardea.service.HelloWorldService;

/**
 * 
 * 
 */
public class HelloWorldServiceImpl implements HelloWorldService {

	/* (non-Javadoc)
	 * @see tr.com.srdc.icardea.app.service.HelloWorldService#say(java.lang.String)
	 */
	public String say(String name) {
		return "Hello " + name;
	}

}
