/*
 * Copyright License 
 * ALL AVAILABLE CODE ON THE SOFTWARE IS PROVIDED "AS IS" WITHOUT WARRANTY 
 * OF ANY KIND, EXPRESS OR IMPLIED, AND ALL SUCH WARRANTIES ARE HEREBY 
 * DISCLAIMED. Middle East Technical University-Software Research&Development
 * Center,TURKEY, hereby grants users of this software permission to reproduce
 * code using this software for the sole purpose of non-profit application 
 * development. Any reproduction of any part of the code available in the
 * Mobile package must contain notice of copyright as follows. 
 * 
 * 
 * � Copyright [2005] Ozgur GULDEREN
 * Software Research and Development Center 
 * Department of Computer Engineering 
 * Middle East Technical University
 * 06531 Ankara TURKEY
 * e-mail: ozgur@srdc.metu.edu.tr
 * 
 * Except for these specified uses, no part of the code available in the package
 * may be copied, downloaded, stored in a retrievable system, further transmitted,
 * or otherwise reproduced, stored, disseminated, transferred, or used, in any
 * form or by any means, accept as permitted herein. Distribution for commercial
 * purposes is expressly prohibited. 
 */
package tr.com.srdc.icardea.careplanengine.agents.gui.graph;


import tr.com.srdc.icardea.careplanengine.glmodel.impl.DefaultGuideline;
import tr.com.srdc.icardea.careplanengine.entities.StatusInfo;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import tr.com.srdc.icardea.careplanengine.agents.gui.graph.history.GuidelineHistoryFrame;
import tr.com.srdc.icardea.careplanengine.agents.gui.util.ActionCompletionController;
import tr.com.srdc.icardea.careplanengine.agents.gui.PatientPanel;


import javax.swing.*;
import javax.swing.text.StyledDocument;
import javax.swing.text.BadLocationException;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.geom.Point2D;
import java.util.Vector;

import prefuse.Display;
import prefuse.Visualization;
import prefuse.action.ActionList;
import prefuse.action.RepaintAction;
import prefuse.action.layout.SpecifiedLayout;
import prefuse.render.DefaultRendererFactory;
import prefuse.render.LabelRenderer;
import prefuse.data.Graph;
import prefuse.data.Node;

/* Gunes ALUC, SRDC, 07 June 2007 *******************/
/*  extension to enable the Monitoring Agent/GUI ****/
/*  display messages in a more user-friendly way. ***/

import java.util.Hashtable;
import java.util.Date;
import java.net.URL;
import java.text.SimpleDateFormat;

import tr.com.srdc.icardea.careplanengine.agents.gui.tools.XSLTransformer;

/* END-OF-EXTENSION *********************************/




/**
 * @author yavuz
 *
 * yavuz@srdc.metu.edu.tr
 *
 * SRDC - METU 2005
 */
public class GuidelineMonitoringPanel extends JPanel{

	private DefaultGuideline defaultGuideline = null;


	private String URI = null;
	//    private String patientName = null;
	private JScrollPane descriptiveGraph;
	//    private JScrollPane guidelineScroll;
	private GuidelineGraph mGuidelineGraph;
	private PatientPanel patientPanel;
	private JTabbedPane console;

	//it may be more convenient to create historyTextPane as a JTable
	private JTextPane historyTextPane;
	private JTextArea notesTextArea;

	private boolean withDescriptives=false;
	private boolean isExecutingGraph=false;

	private ActionCompletionController actionCompletionController = null;


	public GuidelineMonitoringPanel() {
		this(false, false);
	}

	public GuidelineMonitoringPanel(boolean withDescriptives){
		this(withDescriptives, false);
	}

	public GuidelineMonitoringPanel(boolean withDescriptives, boolean isExecutingGraph){
		this(null, withDescriptives, false);
	}

	public GuidelineMonitoringPanel(PatientPanel patientPanel, boolean withDescriptives, boolean isExecutingGraph){
		super();

		this.patientPanel = patientPanel;
		this.withDescriptives = withDescriptives;
		this.isExecutingGraph = isExecutingGraph;

		actionCompletionController = new ActionCompletionController(this);

		if(withDescriptives){
			descriptiveGraph = getInformationGraph();
		}

		if(isExecutingGraph){
			console = createConsole();
		}

		this.setPreferredSize(new Dimension(800,600));
		this.setLayout(new BorderLayout());


		InputMap inputMap = this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);

		//Ctrl-s to save the layout of guideline graph
		KeyStroke key = KeyStroke.getKeyStroke(KeyEvent.VK_S, Event.CTRL_MASK);


		Action action = new AbstractAction() {
			public void actionPerformed(ActionEvent actionEvent) {
				mGuidelineGraph.saveGraphLayout();
			}
		};

		inputMap.put(key, "Save Layout");
		getActionMap().put("Save Layout", action);

		//        new Thread(){
		//            public void run(){
		//                URL url = this.getClass().getClassLoader().getResource("owl/coughOWL.owl");
		//                InstanceFactory.getInstance("file:"+url.getPath());
		//                InstanceFactory.loadProtegePlugins();
		//            }
		//        }.start();
	}

	private JTabbedPane createConsole() {
		JTabbedPane console = new JTabbedPane();
		console.setPreferredSize(new Dimension(800, 80));

		JScrollPane historyScrollPane = new JScrollPane();
		historyTextPane = new JTextPane();
		historyTextPane.setFont(new java.awt.Font("Courier", 0, 12));
		historyTextPane.setEditable(false);
		historyScrollPane.setViewportView(historyTextPane);

		JScrollPane notesScrollPane = new JScrollPane();
		notesTextArea = new JTextArea();
		notesTextArea.setRows(5);
		notesTextArea.setFont(new java.awt.Font("Courier", 0, 12));
		notesScrollPane.setViewportView(notesTextArea);

		console.addTab("Notes", notesScrollPane);
		console.addTab("Guideline History", historyScrollPane);
		console.setSelectedIndex(1);
		return console;
	}


	public void drawGuideline(DefaultGuideline guideline, String URI){
		setDefaultGuideline(guideline);
		setURI(URI);
		//        setPatientName(patientName);
		this.removeAll();
		System.gc();    // remove the unnecassary objects from the previous run
		mGuidelineGraph = new GuidelineGraph(this, isExecutingGraph);

		//TODO: [olduz] remove the below two lines, they are guideline-specific
		mGuidelineGraph.zoom(new Point2D.Double(300,300), 0.9);
		mGuidelineGraph.pan(160, -10);
		//        guidelineScroll = new JScrollPane(mGuidelineGraph);

		JComponent component = layoutComponents();

		this.add(component);
		this.validate();
	}

	/* public String getPatientName() {
	   return patientName;
	}

	public void setPatientName(String patientName) {
	this.patientName = patientName;
	}

*/
	private JComponent layoutComponents() {
		if(!isExecutingGraph){
			if(!withDescriptives){
				return mGuidelineGraph;
			}else{
				JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
						descriptiveGraph, mGuidelineGraph);
				splitPane.setOneTouchExpandable(true);
				splitPane.setResizeWeight(0.0);
				return splitPane;
			}
		}else{
			if(!withDescriptives){
				JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
						mGuidelineGraph, console);
				splitPane.setOneTouchExpandable(true);
				splitPane.setDividerLocation(500);
				splitPane.setResizeWeight(0.0);
				return splitPane;
			}else{
				JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
						mGuidelineGraph, console);
				splitPane.setOneTouchExpandable(true);
				splitPane.setDividerLocation(450);
				splitPane.setResizeWeight(1.0);

				JSplitPane mainSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
						descriptiveGraph, splitPane);
				mainSplitPane.setOneTouchExpandable(true);
				mainSplitPane.setDividerLocation(120);
				mainSplitPane.setResizeWeight(0.0);
				return mainSplitPane;
				/*
				   JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
				   descriptiveGraph, guidelineScroll);
				   splitPane.setOneTouchExpandable(true);
				   splitPane.setResizeWeight(0.0);

				   JSplitPane mainSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
				   splitPane, console);
				   mainSplitPane.setOneTouchExpandable(true);
				   mainSplitPane.setDividerLocation(480);
				   mainSplitPane.setResizeWeight(0.0);
				   return mainSplitPane;                */
			}
		}
	}

	private JScrollPane getInformationGraph() {
		Graph informativeGraph = new Graph(false);
		double xCor=60, yCor=60;

		informativeGraph.addColumn(GuidelineGraph.TYPE, int.class);
		informativeGraph.addColumn(GuidelineGraph.STATUS, int.class);
		informativeGraph.addColumn(GuidelineGraph.LABEL, String.class);
		informativeGraph.addColumn(GuidelineGraph.WIDTH, double.class);
		informativeGraph.addColumn(GuidelineGraph.X_POS, double.class);
		informativeGraph.addColumn(GuidelineGraph.Y_POS, double.class);

		Node title = informativeGraph.addNode();
		title.setInt(GuidelineGraph.TYPE, ShapeConstants.SIZE);
		title.setDouble(GuidelineGraph.X_POS, xCor);
		title.setDouble(GuidelineGraph.Y_POS, 10);
		title.setInt(GuidelineGraph.STATUS, 4);
		title.setString(GuidelineGraph.LABEL, "     Guideline Steps     ");

		for(int i=0; i< ShapeConstants.SIZE; i++){
			Node node = informativeGraph.addNode();
			node.setInt(GuidelineGraph.TYPE, i);
			node.setDouble(GuidelineGraph.X_POS, xCor);
			node.setDouble(GuidelineGraph.Y_POS, yCor);
			node.setString(GuidelineGraph.LABEL, ShapeConstants.STEP_TEXTS[i]);
			yCor += 60;
		}

		Display display = createDisplay(informativeGraph);
		display.setSize(115, 595);
		JScrollPane scrollPane = new JScrollPane(display);
		scrollPane.setPreferredSize(new Dimension(120, 600));

		return scrollPane;
	}


	private Display createDisplay(Graph informativeGraph){
		Display display = new Display(new Visualization());
		DefaultRendererFactory defaultRendererFactory = new DefaultRendererFactory();
		LabelRenderer labelRenderer = new LabelRenderer(GuidelineGraph.LABEL);
		labelRenderer.setRoundedCorner(8, 8);
		defaultRendererFactory.setDefaultRenderer(labelRenderer);
		GuidelineGraph.addStepRenderers(defaultRendererFactory);

		display.getVisualization().setRendererFactory(defaultRendererFactory);

		// add visual data groups
		display.getVisualization().addGraph(GuidelineGraph.GUIDELINE_GRAPH, informativeGraph);

		GuidelineGraph.setStepShapes(display.getVisualization());

		ActionList color = GuidelineGraph.getColorActions();

		ActionList layout = new ActionList(1);
		layout.add(new SpecifiedLayout(GuidelineGraph.GUIDELINE_GRAPH, GuidelineGraph.X_POS, GuidelineGraph.Y_POS));
		layout.add(new RepaintAction());

		// add the actions to the visualization
		display.getVisualization().putAction("color", color);
		display.getVisualization().putAction("layout", layout);

		display.getVisualization().run("color");  // assign the colors
		display.getVisualization().run("layout");
		return display;
	}

	public PatientPanel getPatientPanel() {
		return patientPanel;
	}

	public DefaultGuideline getDefaultGuideline() {
		return defaultGuideline;
	}

	public void setDefaultGuideline(DefaultGuideline defaultGuideline) {
		this.defaultGuideline = defaultGuideline;
	}

	public String getURI() {
		return URI;
	}

	public void setURI(String URI) {
		this.URI = URI;
	}

	private static void createAndShowGUI() {

		JFrame frame = new JFrame("Guideline Flow");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GuidelineMonitoringPanel lGuidelineMonitoringPanel = new GuidelineMonitoringPanel(true, true);

		Individual2ObjectFrame ind = new Individual2ObjectFrame(lGuidelineMonitoringPanel);
		ind.setVisible(true);

		frame.setContentPane(lGuidelineMonitoringPanel);

		//Display the window.
		frame.pack();
		frame.setLocationRelativeTo(null); //center it
		frame.setVisible(true);
	}
	/*
	   public void setTotalSize(Dimension dimension) {
	   guidelineScroll.getViewport().setViewSize(dimension);
	   guidelineScroll.updateUI();
	   }         */

	//Start the demo.
	public static void main(String[] args) {
		//Schedule a job for the event-dispatching thread:
		//creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

	public void updateStatus(String guidelineStep, String info) {
		int status = 0;
		if(info.equals(StatusInfo.STEP_STATUS_RUNNING)){
			status = 1;
		}else if(info.equals(StatusInfo.STEP_STATUS_COMMITTED)){
			status = 2;
			actionCompletionController.playCompletionSound();
		}else if(info.equals(StatusInfo.STEP_STATUS_ABORTED)){
			status = 3;
		}
		updateStepStatus(guidelineStep, status, info);
	}

	public void updateStepStatus(String guidelineStep, int status, String info){
		mGuidelineGraph.changeStatusOfStep(guidelineStep, status);
		showInHistory(guidelineStep, info);
	}

	public void displayInfo(String guidelineStep, String actionName, String displayName) {
		String whatHappened = displayName + " [" + actionName + "] "  + " completed.";
		showInHistory(guidelineStep, whatHappened);
		mGuidelineGraph.guidelineActionCompleted(guidelineStep, displayName);
	}

	private void showInHistory(String guidelineStep, String whatHappened){
		try {
			if(historyTextPane !=null){
				StyledDocument document = historyTextPane.getStyledDocument();
				String displayName = mGuidelineGraph.getDisplayNameOfStep(guidelineStep);
				document.insertString(0, displayName+ " [" + guidelineStep + "] " + whatHappened+"\n", null);
			}
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}

    public void showInHistory(String message){
		try {
			if(historyTextPane !=null){
				StyledDocument document = historyTextPane.getStyledDocument();
				document.insertString(0, message+"\n", null);
			}
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}

    private void showExpressionInHistory(String expression,String result) {
		try {
			if(historyTextPane !=null){
				StyledDocument document = historyTextPane.getStyledDocument();
				document.insertString(0, expression+ " evaluated to " +result+"\n", null);
			}

		}
		catch (BadLocationException e) {
			e.printStackTrace();
		}

	}

	/* Gunes ALUC, SRDC, 07 June 2007 *******************/
	/*  extension to enable the Monitoring Agent/GUI ****/
	/*  display messages in a more user-friendly way. ***/
	public void addHistoryEvent(Vector<String> stepInfo, String guidelineName) {
		int index = 1;
		String type = stepInfo.get(index++);
		String guidelineStepName = stepInfo.get(index++);
		String historyText="";
		int historyType = 100;
		long time = 0;

		// find a better way for this,
		// read this from a property file!!!
		XSLTransformer transformer = new XSLTransformer();
		URL xslFile = this.getClass().getClassLoader().getResource("transform.xsl");

		Hashtable<String, String> historyData = new Hashtable<String, String> (10,(float)0.5);

		try
		{
			
			// timestamp is always the last element of the vector
			int timestampLocation = stepInfo.size() - 1;
			
			historyData.put("GUIDELINE_ID", guidelineName);
			
			if(type.equalsIgnoreCase(GuidelineHistoryFrame.EXPRESSION_EVALUATED)){
				String expression = stepInfo.get(index++);
				String result = stepInfo.get(index++);
				String argumentValues = stepInfo.get(index++);
				historyText = 	expression + " has resulted in " + 
					result + " \n\n and has been called with values \n " + 
					argumentValues;
				historyType = GuidelineHistoryFrame.CASE_STEP_STYLE_TYPE;
				
				// timestamp is always the last element of the vector
				time = Long.parseLong(stepInfo.get(timestampLocation));

				//historyData.put ("EXPRESSION", expression);
				historyData.put ("NAME", getFunctionName(expression));
				historyData.put ("DESCRIPTION", getDescription(expression));
				historyData.put ("RETURN_DESCRIPTION", getReturnValueDescription(expression));
				historyData.put ("FUNCTION_BODY", getFunctionBody(expression));
				historyData.put ("RESULT", result);
				historyData.put ("ARGUMENT_VALUES", argumentValues);
				
				// to be used when messages are listed in full-history
				historyData.put ("SHORT_DESCRIPTION", getFunctionName(expression));
				
			}else if(type.equalsIgnoreCase(GuidelineHistoryFrame.EMR_DATA_RETRIEVED)){
				String variable = stepInfo.get(index++);
				String value = stepInfo.get(index++);

				String transformedValue = transformer.transform(value, xslFile);

				historyText = variable + " has value of \n'" + value + "'" + " \n\n " + transformedValue;
				historyType = GuidelineHistoryFrame.ACTION_STEP_DATA_STYLE_TYPE;
				
				// timestamp is always the last element of the vector
				time = Long.parseLong(stepInfo.get(timestampLocation));

				historyData.put ("VARIABLE_NAME", variable);
				historyData.put ("VALUE_XML", value);
				historyData.put ("TRANSFORMED_VALUE_XML", transformedValue);
				
				// to be used when messages are listed in full-history
				historyData.put ("SHORT_DESCRIPTION", variable);

			}else if(type.equalsIgnoreCase(GuidelineHistoryFrame.SENSOR_DATA_RETRIEVED)){
				String variable = stepInfo.get(index++);
				String value = stepInfo.get(index++);

				String transformedValue = transformer.transform (value, xslFile);

				historyText = variable + " has value of \n'" + value + "'"  + " \n\n " + transformedValue;
				historyType = GuidelineHistoryFrame.SENSOR_STYLE_TYPE;

				// timestamp is always the last element of the vector				
				time = Long.parseLong(stepInfo.get(timestampLocation));
				
				historyData.put ("VARIABLE_NAME", variable);
				historyData.put ("VALUE_XML", value);
				historyData.put ("TRANSFORMED_VALUE_XML", transformedValue);
				
				// to be used when messages are listed in full-history
				historyData.put ("SHORT_DESCRIPTION", variable);

			}else if(type.equalsIgnoreCase(GuidelineHistoryFrame.WAIT_PERFORMED)){
				int amount = Integer.parseInt(stepInfo.get(index++));
				historyText = "Wait for " + amount + " seconds";
				historyType = GuidelineHistoryFrame.ACTION_STEP_WAIT_STYLE_TYPE;
				
				// timestamp is always the last element of the vector
				time = Long.parseLong(stepInfo.get(timestampLocation));

				historyData.put ("WAIT_AMOUNT", Integer.toString(amount));
				
				// to be used when messages are listed in full-history
				historyData.put ("SHORT_DESCRIPTION", Integer.toString(amount));

			}else if(type.equalsIgnoreCase(GuidelineHistoryFrame.CONSULT_PERFORMED)){
				String variable = stepInfo.get(index++);
				String value = stepInfo.get(index++);

				String transformedValue = transformer.transform (value, xslFile);

				historyText = variable + " has value of \n'" + value + "'"  + " \n\n " + transformedValue;
				historyType = GuidelineHistoryFrame.CONSULT_STYLE_TYPE;
				
				// timestamp is always the last element of the vector				
				time = Long.parseLong(stepInfo.get(timestampLocation));

				historyData.put ("VARIABLE_NAME", variable);
				historyData.put ("VALUE_XML", value);
				historyData.put ("TRANSFORMED_VALUE_XML", transformedValue);
				
				// to be used when messages are listed in full-history
				historyData.put ("SHORT_DESCRIPTION", variable);

			}else if(type.equalsIgnoreCase(GuidelineHistoryFrame.WS_CALLED)){
				String operation = stepInfo.get(index++);
				String input = stepInfo.get(index++);

				String transformedValue = transformer.transform (input, xslFile);

				historyText = operation + " has been called with input \n\n " + input + " \n\n " + transformedValue;
				historyType = GuidelineHistoryFrame.ACTION_STEP_WS_STYLE_TYPE;
				
				// timestamp is always the last element of the vector
				time = Long.parseLong(stepInfo.get(timestampLocation));

				historyData.put ("OPERATION_NAME", operation);
				historyData.put ("INPUT_XML", input);
				historyData.put ("TRANSFORMED_INPUT_XML", transformedValue);
				
				// to be used when messages are listed in full-history
				historyData.put ("SHORT_DESCRIPTION", operation);				
			}
			// are we sure that this corresponds to DISPLAY_INFO??? (ALARM)
			else if(type.equalsIgnoreCase(GuidelineHistoryFrame.ALARM_GENERATED)){
				String urgency = stepInfo.get(index++);
				String content = stepInfo.get(index++);
				
				historyText = "urgency : " + urgency + "\n\n content : " + "\n\n" + content;
				historyType = GuidelineHistoryFrame.ACTION_STEP_ALARM_STYLE_TYPE;
				
				time = Long.parseLong(stepInfo.get(timestampLocation));
				
				historyData.put("ALARM_URGENCY", urgency);
				historyData.put("ALARM_CONTENT", content);
				
				// to be used when messages are listed in full-history
				historyData.put("SHORT_DESCRIPTION", content);
				
			}
            else if(type.equalsIgnoreCase(GuidelineHistoryFrame.NEW_CYCLE_STARTING)){

			}
            else if(type.equalsIgnoreCase(GuidelineHistoryFrame.CYCLE_COMPLETED)){
				time = Long.parseLong(stepInfo.get(timestampLocation));

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MMM-dd, HH:mm:ss");
                String date = simpleDateFormat.format(new Date(time));

                historyText = "The guideline execution cycle has been completed on " + date;
				historyType = GuidelineHistoryFrame.NEW_CYCLE_STYLE_TYPE;

				// to be used when messages are listed in full-history
				historyData.put("SHORT_DESCRIPTION", "End of Guideline Execution Cycle");
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		Logger.getLogger(this.getClass()).log(Level.DEBUG, ("::::::" + guidelineStepName));
		
		// mGuidelineGraph.putHistory( guidelineStepName, historyText, historyType, time);
		mGuidelineGraph.putHistory( guidelineStepName, historyData, historyType, time);
	}
	
	// IMPORTANT: Here you should place the functions
	// that parse the Expression, take out the comments
	// and enable you to extract the
	//		* function description
	//		* parameter descriptions (optional)
	//		* return value description
	
	private String getDescription(String expression){
		String description = "";
		if (expression.contains("/**") && expression.contains("*/")){
			int begin = expression.indexOf("/**");
			int end = expression.indexOf("*/");			
			if (begin < end){
				int splitIndex = expression.indexOf("@");				
				if (splitIndex >= 0){
					begin = begin + 3; 					// skip "/**"					
					splitIndex = splitIndex - 1;		// ignore "@"					
					description = expression.substring(begin, splitIndex);
					description = description.replace("*", "");
					description = description.trim();
				}				
			}
		}		
		return description;
	}
	
	private String getReturnValueDescription (String expression){
		String description = "";
		if (expression.contains("/**") && expression.contains("*/")){
			int begin = expression.indexOf("/**");
			int end = expression.indexOf("*/");			
			if (begin < end){
				int splitIndex = expression.indexOf("@return");				
				if (splitIndex >= 0){
					splitIndex = splitIndex + 7;		// skip "@return"
					end = end - 2;						// ignore "*/"					
					description = expression.substring(splitIndex, end);
					description = description.replace("*", "");
					description = description.trim();
				}
			}
		}		
		return description;
	}
	
	private String getParameterDescriptions (String expression){
		String description = "";
		if (expression.contains("/**") && expression.contains("*/")){
			int begin = expression.indexOf("/**");
			int end = expression.indexOf("*/");
			if (begin < end){
				int paramBegin = expression.indexOf("@param");				
				int paramEnd = expression.indexOf("@return");
				if (paramBegin < paramEnd){
					description = expression.substring(paramBegin, paramEnd);
					description = description.replace("*", "");
					description = description.replace("@param", "");
					description = description.trim();
				}
			}
		}		
		return description;
	}
	
	private String getFunctionBody (String expression){
		String description = expression;
		if (expression.contains("/**") && expression.contains("*/")){
			int begin = expression.indexOf("/**");
			int end = expression.indexOf("*/");			
			if (begin < end){
				end = end + 2; 				// skip "*/"				
				description = expression.substring(end);
			}
		}		
		return description.trim();
	}
	
	private String getFunctionName (String expression){
		expression = getFunctionBody(expression);
		
		String fnName = "";
		if (expression.contains("function")){
			int begin = expression.indexOf("function");
			int end = expression.indexOf ("{", begin);
			
			if (end >= 0)
			{
				begin = begin + 8;			// skip "function"
				end = end - 1;				// ignore "{"
				
				fnName = expression.substring(begin, end);
				fnName = fnName.trim();
			}
		}		
		return fnName;
	}
	
	/* Gunes ALUC, SRDC, 20 July 2007
     */        
    public GuidelineGraph getGuidelineGraph()
    {
    	return mGuidelineGraph;
    }
    /*
     * END-OF-EXTENSION
     */
	
	/* END-OF-EXTENSION *********************************/

    public void clearPreviousData() {
        try {
            StyledDocument document = historyTextPane.getStyledDocument();
            document.insertString(0, "----------------------guideline cycle completed----------------------\n", null);

//            historyTextPane.getStyledDocument().remove(0, historyTextPane.getStyledDocument().getLength());
            mGuidelineGraph.clearPreviousVisualData();
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }

    public void cycleCompleted() {
        mGuidelineGraph.generateSummaryReport();
    }
}
