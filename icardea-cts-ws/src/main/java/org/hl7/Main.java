package org.hl7;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CodeMappingOperationsServiceSkeleton cmp = new CodeMappingOperationsServiceSkeleton();
		GetSupportedMaps gsm = new GetSupportedMaps();
		try {
			cmp.getSupportedMaps(gsm);
			System.out.println("FINISH");
		} catch (UnexpectedError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
