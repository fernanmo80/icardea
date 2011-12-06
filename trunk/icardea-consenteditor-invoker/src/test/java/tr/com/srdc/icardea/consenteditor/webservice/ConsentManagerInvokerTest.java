/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.com.srdc.icardea.consenteditor.webservice;
import org.junit.Test;
import tr.com.srdc.icardea.consenteditor.webservice.client.ConsentManagerImplServiceTest;
/**
 *
 * @author yildiray
 */
public class ConsentManagerInvokerTest {

	public static void main(String args[]) {
		org.junit.runner.JUnitCore.main("tr.com.srdc.icardea.consenteditor.webservice.ConsentManagerInvokerTest");
	}
	
	@Test
	public void test1() {
		ConsentManagerImplServiceTest.grantRequest("191", "doctor", "condition");	
	}

	@Test
	public void test2() {
		ConsentManagerImplServiceTest.grantRequest("191", "doctor", "medication");	
	}

	@Test
	public void test3() {
		ConsentManagerImplServiceTest.grantRequest("191", "nurse", "medication");	
	}

	@Test
	public void test4() {
		ConsentManagerImplServiceTest.grantRequest("191", "nurse", "condition");	
	}
}
