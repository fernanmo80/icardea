/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.com.srdc.icardea.careplanengine.agents.guidelineAgent;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
//import tr.com.srdc.icardea.careplanengine.glmodel.Medication;
import tr.com.srdc.icardea.ihe.cm.careManager.EHRPHRDataRetriever;
import tr.com.srdc.icardea.hibernate.Medication;

public class JavaScriptEngine {

	private static JavaScriptEngine instance = null;
	private static ScriptEngine jsEngine = null;

	// currently it is used from within ConsultStep
	public static Object execute(Object[] inputs, String script) {
		try {

			ResourceBundle properties = ResourceBundle.getBundle("icardea");
			String configuredDate = properties.getString("current.date");
			Date date = new Date();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
			if (!configuredDate.equals("system")) {
				date = simpleDateFormat.parse(configuredDate);
			}

			String currentDate = simpleDateFormat.format(date);
			String dateFunction = "function isActiveDate(dateString){ if(dateString == null || dateString == \"\" || dateString == \" \") return true; var currentDate = " + currentDate + "; dateString = dateString.substring(0, 8); if((parseInt(dateString)-parseInt(currentDate)) > 0) return true; else return false;} ";
			script = script.replaceAll("&lt;", "<");
			script = script.replaceAll("&gt;", ">");
			ScriptEngineManager mgr = new ScriptEngineManager();
			ScriptEngine jsEngine = mgr.getEngineByName("JavaScript");

			int start = script.indexOf("function ");
			int end = script.indexOf("(");
			String functionName = script.substring(start + 9, end);
			//System.out.println("$$$$$$ Function name:" + functionName);
			jsEngine.eval(dateFunction);
			jsEngine.eval(script);
			Invocable invocableEngine = (Invocable) jsEngine;
			Object resultObject = null;
			if (inputs.length == 1) {
				resultObject = invocableEngine.invokeFunction(functionName, inputs[0]);
			} else if (inputs.length == 2) {
				resultObject = invocableEngine.invokeFunction(functionName, inputs[0], inputs[1]);
			} else if (inputs.length == 3) {
				resultObject = invocableEngine.invokeFunction(functionName, inputs[0], inputs[1], inputs[2]);
			} else if (inputs.length == 4) {
				resultObject = invocableEngine.invokeFunction(functionName, inputs[0], inputs[1], inputs[2],
					inputs[3]);
			} else if (inputs.length == 5) {
				resultObject = invocableEngine.invokeFunction(functionName, inputs[0], inputs[1], inputs[2],
					inputs[3], inputs[4]);
			} else if (inputs.length == 6) {
				resultObject = invocableEngine.invokeFunction(functionName, inputs[0], inputs[1], inputs[2],
					inputs[3], inputs[4], inputs[5]);
			} else if (inputs.length == 7) {
				resultObject = invocableEngine.invokeFunction(functionName, inputs[0], inputs[1], inputs[2],
					inputs[3], inputs[4], inputs[5], inputs[6]);
			}
			return resultObject;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	private JavaScriptEngine() {
	}

	public static JavaScriptEngine getInstance() {
		if (instance == null) {
			instance = new JavaScriptEngine();
		}
		return instance;
	}

	public static Object refineValue(Object[] input, String refinementScript) throws ScriptException, NoSuchMethodException {
		if (refinementScript == null || refinementScript.trim().equals("")) {
			return input;
		}
		refinementScript = refinementScript.replaceAll("&lt;", "<");
		refinementScript = refinementScript.replaceAll("&gt;", ">");
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine jsEngine = mgr.getEngineByName("JavaScript");

		for (Object o : input) {
			System.out.println("++++++++++Input:" + o + "+++++++++");
		}

		ResourceBundle properties = ResourceBundle.getBundle("icardea");
		String configuredDate = properties.getString("current.date");
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
		if (!configuredDate.equals("system")) {
			try {
				date = simpleDateFormat.parse(configuredDate);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

		String currentDate = simpleDateFormat.format(date);

		String dateFunction = "function refineDate(dateString){var date = new Date(); date.setFullYear(parseInt(dateString.substring(0,4)));date.setMonth(parseInt(dateString.substring(4,6)) - 1);date.setDate(parseInt(dateString.substring(6,8)));date.setHours(parseInt(dateString.substring(8,10)));date.setMinutes(parseInt(dateString.substring(10,12)));date.setSeconds(parseInt(dateString.substring(12,14))); return date;} ";
		String dateFunction3 = "function refineDateYMD(dateString){var date = new Date(); date.setFullYear(parseInt(dateString.substring(0,4)));date.setMonth(parseInt(dateString.substring(4,6)) - 1);date.setDate(parseInt(dateString.substring(6,8))); return date;} ";
		String dateFunction4 = "function dayDifference(dateString){var currentDate=refineDateYMD(\""+currentDate+"\"); var today=refineDateYMD(dateString); var one_day=1000*60*60*24; var difference=Math.ceil((currentDate.getTime()-today.getTime())/(one_day)); return difference;} ";
		String second2day = "function second2day(seconds){var day = Math.ceil(seconds / (60*60*24)); return day;}";
		String second2hour = "function second2hour(seconds){var hour = Math.ceil(seconds / (60*60)); return hour;}";
		
		String dateFunction2 = "function isActiveDate(dateString){ if(dateString == null || dateString == \"\" || dateString == \" \") return true; var currentDate = " + currentDate + "; dateString = dateString.substring(0, 8); if((parseInt(dateString)-parseInt(currentDate)) > 0) return true; else return false;} ";
		List list = Arrays.asList(input);
		jsEngine.eval(dateFunction);
		jsEngine.eval(dateFunction2);
		jsEngine.eval(dateFunction3);
		jsEngine.eval(dateFunction4);
		jsEngine.eval(second2day);
		jsEngine.eval(second2hour);
		jsEngine.eval(refinementScript);
		Invocable invocableEngine = (Invocable) jsEngine;
		Object resultObject = invocableEngine.invokeFunction("refine", list);
		return resultObject;
	}

	public static void main(String argv[]) {
		Deneme d1 = new Deneme("1", "bir");
		Deneme d2 = new Deneme("2", "iki");
		Deneme d3 = new Deneme("3", "uc");
		Deneme d4 = new Deneme("1", "dort");
		Deneme[] input1 = new Deneme[3];
		Deneme[] input2 = new Deneme[1];
		input1[0] = d1;
		input1[1] = d2;
		input1[2] = d3;
		input2[0] = d4;

		Object[] inputs = new Object[2];
		inputs[0] = input1;
		inputs[1] = input2;
		/*String script = "var contraList = ['1', '3', '5'];\n";
		script += "function generate(ehrMeds, phrMeds) {\n";
		script += "var e;\n";
		script += "var p;\n";
		script += "var c;\n";
		script += "var output = '<tr>';\n";
		script += "for(e=0; e<ehrMeds.length;e++) {\n";
		script += "var ehrMed = ehrMeds[e];\n";
		script += "var useIt = 'No';\n";
		script += "for(p=0; p<phrMeds.length;p++) {\n";
		script += "var phrMed = phrMeds[p];	\n";
		script += "if(ehrMed.getCode() == phrMed.getCode()) {\n";
		script += "useIt = 'Yes';\n";
		script += "}\n";
		script += "}\n";
		script += "var contraindicates = 'No';\n";
		script += "for(c=0; c<contraList.length;c++) {\n";
		script += "var contaCode = contraList[c];	\n";
		script += "if(ehrMed.getCode() == contaCode) {\n";
		script += "contraindicates = '<b>Yes</b>';\n";
		script += "}\n";
		script += "}\n";
		script += "var line = '<td>' + ehrMed.getText() + '</td>' + '<td>' + useIt + '</td>' + '<td>' + contraindicates + '</td>';\n";
		script += "output = output + line;\n";
		script += "}\n";
		script += "output = output + '</tr>';\n";
		script += "return output;\n";
		script += "}\n";*/
		String script = "var contraList = ['103','161','376','455','519','677','719','1191','1202','1256','1598','2002','2178','2180','2184','2187','2189','2193','2344','2348','2356','2404','2409','2447','2541','2551','2594','2626','2878','3002','3102','3292','3327','3355','3356','3393','3554','3640','4053','4109','4118','4331','4450','4492','4493','4508','4719','4832','4903','5021','5093','5095','5224','5640','5657','5781','5806','6142','6371','6472','6693','6760','6835','6876','6901','6922','6932','7233','7240','7258','7299','7517','7623','7646','7779','7813','7833','7909','8013','8134','8160','8183','8339','8356','8640','8691','8703','8754','8785','8787','8794','9068','9071','9143','9384','9624','9997','10032','10106','10156','10179','10180','10205','10207','10237','10324','10395','10591','10594','10635','10689','10737','10831','11055','11256','11258','11289','15202','17128','18631','19860','21212','28031','29787','32385','32613','32937','35255','35827','36437','36567','40144','40254','40575','40790','41127','42355','42463','42635','60819','72143','82122','83367','114970','114979','140587','142448','194000','203114','207391','221126','232158','237057','278567','283742','328134','341248','5067008','8216003','9203006','9268004','14304000','27867009','30492008','36236003','41000005','47546008','49157004','49634009','51779009','60169008','63094006','65695006','67828004','71181003','80229008','87708000','96302009','103835000','105925009','108616001','108972005','111151007','112113009','178960009','255631004','255632006','255635008','255638005','255656005','260872001','264049007','286586005','324116004','349854005','372525000','372585002','372806008','372862008','373265006','373281001','373443008','387406002','387459000','413358002','428787002','C0000618','C0000970','C0001655','C0001975','C0002144','C0002555','C0002556','C0002640','C0002744','C0002771','C0003138','C0003232','C0003280','C0003286','C0003289','C0003360','C0003374','C0003392','C0004057','C0004147','C0004482','C0004745','C0005640','C0006464','C0006949','C0007541','C0007546','C0007552','C0007555','C0007557','C0007561','C0007732','C0008161','C0008168','C0008188','C0008287','C0008294','C0008402','C0008783','C0008809','C0009002','C0009079','C0010137','C0010583','C0010961','C0011824','C0012022','C0012091','C0012093','C0012228','C0012772','C0012798','C0013090','C0014806','C0014963','C0014987','C0015837','C0016277','C0016360','C0016365','C0016384','C0017120','C0017245','C0017687','C0017845','C0018242','C0018546','C0018549','C0019134','C0020591','C0020740','C0020823','C0021246','C0021403','C0022635','C0023556','C0024027','C0025152','C0025386','C0025644','C0025741','C0025810','C0025872','C0025942','C0026457','C0027324','C0027353','C0027396','C0027415','C0027603','C0028365','C0028902','C0028978','C0029995','C0030072','C0030125','C0030438','C0030899','C0031412','C0031463','C0031507','C0031955','C0031990','C0032952','C0033148','C0033228','C0033429','C0033493','C0033497','C0033511','C0034414','C0034417','C0034428','C0034665','C0035608','C0036077','C0036516','C0037982','C0038149','C0038317','C0038418','C0038633','C0038687','C0038689','C0038742','C0038745','C0038760','C0038792','C0039286','C0039644','C0039651','C0040125','C0040128','C0040193','C0040207','C0040374','C0040610','C0040616','C0040805','C0041044','C0041983','C0042071','C0042210','C0042874','C0042878','C0042890','C0043031','C0048470','C0050940','C0052796','C0054234','C0055856','C0064113','C0066282','C0069454','C0069739','C0070122','C0072916','C0073631','C0074393','C0074554','C0079691','C0080356','C0081408','C0081876','C0082608','C0085228','C0085542','C0085826','C0086140','C0086440','C0168273','C0205395','C0242903','C0243077','C0244404','C0282386','C0282563','C0286651','C0304403','C0304562','C0304945','C0358591','C0360105','C0360714','C0378466','C0378482','C0380028','C0442122','C0450442','C0521362','C0522860','C0528023','C0538927','C0546882','C0564420','C0573797 ','C0595726','C0671970','C0690770','C0700442','C0724636','C0745136','C0762662','C0772394','C0846670','C0913246','C0937846','C1122962','C1142985','C1289971','C1321567','C1548819','C1579362','C1579437','C2045867','C2064853','C2114759','C2248143','C2266924','C2267085','C2916905','C2917323','C2936462']; function generate(ehrMeds, phrMeds) { var e; var p; var c; var output=''; for(e=0; e&lt;ehrMeds.length;e++) { output = output + '&lt;tr&gt;'; var ehrMed = ehrMeds[e]; var useIt = 'No'; for(p=0; p&lt;phrMeds.length;p++) { var phrMed = phrMeds[p]; if(ehrMed.getDrugCode().equals(phrMed.getDrugCode())) { useIt = '&lt;font color=\"#880015\"&gt;&lt;b&gt;Yes!!!&lt;/b&gt;&lt;/font&gt;'; } } var contraindicates = 'No'; for(c=0; c&lt;contraList.length;c++) { var contaCode = contraList[c];	  if(ehrMed.getDrugCode() == contaCode) { contraindicates = '&lt;font color=\"#880015\"&gt;&lt;b&gt;Yes!!!&lt;/b&gt;&lt;/font&gt;'; } } var line = '&lt;td&gt;' + ehrMed.getText() + '&lt;/td&gt;' + '&lt;td&gt;' + useIt + '&lt;/td&gt;' + '&lt;td&gt;' + contraindicates + '&lt;/td&gt;'; output = output + line; output = output + '&lt;/tr&gt;';}  return output; }";

		script = "function generate(ehrMeds, phrMeds) { var e; var p; var output = ''; for(e=0; e&lt;ehrMeds.length;e++) { output = output + '&lt;tr&gt;'; var ehrMed = ehrMeds[e]; var effectiveTimeHighEHR = ehrMed.getEffectiveTimeHigh(); if(!isActiveDate(effectiveTimeHighEHR)) { continue; } var useIt = 'No'; for(p=0; p&lt;phrMeds.length;p++) { var phrMed = phrMeds[p];	var effectiveTimeHighPHR = phrMed.getEffectiveTimeHigh(); if(!isActiveDate(effectiveTimeHighPHR)) continue; if(ehrMed.getDrugCode().equals(phrMed.getDrugCode())) { useIt = '&lt;font color=\"#880015\"&gt;&lt;b&gt;Yes!!!&lt;/b&gt;&lt;/font&gt;'; }  } var line = '&lt;td&gt;' + ehrMed.getText() + '&lt;/td&gt;' + '&lt;td&gt;' + useIt + '&lt;/td&gt;' + '&lt;td&gt;'; output = output + line; output = output + '&lt;/tr&gt;'; }  return output; }";

		//Object objects[] = EHRPHRDataRetriever.retriveEHRPHRData("149202063490", true, "Medication", null, true, false);
		Object[] phrs = (new EHRPHRDataRetriever()).retriveEHRPHRData("149202063491", true, "Medication", null, true, true);
		System.out.println("PHRs:" + phrs.length);
		for (int i = 0; i < phrs.length; i++) {
			Medication med = (Medication) phrs[i];
			System.out.println("Medication PHR:" + med.getDrugCode());
		}
		Object[] ehrs = (new EHRPHRDataRetriever()).retriveEHRPHRData("149202063491", true, "Medication", null, true, false);
		System.out.println("EHRs:" + ehrs.length);
		for (int i = 0; i < ehrs.length; i++) {
			Medication med = (Medication) ehrs[i];
			System.out.println("Medication EHR:" + med.getDrugCode());
		}
		List argumentList = new ArrayList();
		argumentList.add(ehrs);
		argumentList.add(phrs);
		String output = (String) JavaScriptEngine.execute(argumentList.toArray(), script);
		System.out.println("RESULT:" + output);
	}

	public static class Deneme {

		private String code;
		private String text;

		public Deneme(String code, String text) {
			this.code = code;
			this.text = text;
		}

		public String getDrugCode() {
			return code;
		}

		public String getText() {
			return text;
		}
	}
}
