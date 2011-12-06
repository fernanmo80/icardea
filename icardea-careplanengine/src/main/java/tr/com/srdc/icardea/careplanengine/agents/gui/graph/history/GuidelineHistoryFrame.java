/*
 * GuidelineHistoryFrame.java
 *
 * Created on July 26, 2006, 2:51 PM
 */

package tr.com.srdc.icardea.careplanengine.agents.gui.graph.history;

import prefuse.Display;
import prefuse.visual.tuple.TableNodeItem;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyledDocument;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyleConstants;
import javax.swing.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;
import java.util.Date;
import java.awt.*;
import java.text.SimpleDateFormat;

import tr.com.srdc.icardea.careplanengine.agents.gui.graph.GuidelineGraph;

/**
 *
 * @author  mehmet olduz [mehmet@srdc.metu.edu.tr]
 */
public class GuidelineHistoryFrame extends javax.swing.JFrame {

    public static Vector<SimpleAttributeSet> styles = new Vector<SimpleAttributeSet>();

    public static final int ACTION_STEP_WS_STYLE_TYPE = 0,
                            ACTION_STEP_DATA_STYLE_TYPE = 1,
                            ACTION_STEP_ALARM_STYLE_TYPE = 2,
                            ACTION_STEP_WAIT_STYLE_TYPE = 3,
                            CASE_STEP_STYLE_TYPE = 4,
                            CONSULT_STYLE_TYPE = 5,
                            SENSOR_STYLE_TYPE = 6,
                            NEW_CYCLE_STYLE_TYPE = 7;

    public static final String  UPDATE_STATUS = "0",
                                DISPLAY_INFO = "1",
                                EXPRESSION_EVALUATED = "2",
                                EMR_DATA_RETRIEVED = "3",
                                WAIT_PERFORMED = "4",
                                CONSULT_PERFORMED = "5",
                                WS_CALLED = "6",
                                SENSOR_DATA_RETRIEVED = "7",
                                SUBGUIDELINE_STARTING = "8",
    							ALARM_GENERATED = "9",
    							CYCLE_COMPLETED = "10",
    							NEW_CYCLE_STARTING = "11";

    private Font normalFont = null;
    private Font selectedFont = null;

    private String guidelineStepName;

    private Vector<StyledText> historyRows;
    private Vector<Vector<String>> filteredRows;
    private Vector<Vector<String>> unfilteredRows;
    private boolean advancedDisplay;
    private boolean enableSubguidelineMessages = false;
    
    private int prevColToSort = 0;
    private int colToSort = 0;
    private Vector<Boolean> sortCriteria; 
    
    private String guidelineName;
    
    private GuidelineGraph guidelineGraph;
    
    private int cycleCounter = 0;
    
    

    /** Creates new form GuidelineHistoryFrame */
    public GuidelineHistoryFrame() {
        initComponents();
        jSplitPane2.setDividerLocation(0.7);
        jSplitPane2.setResizeWeight(0.8);

        prepareStyles();

        historyRows = new Vector<StyledText>();
        filteredRows = new Vector<Vector<String>>();
        unfilteredRows = new Vector<Vector<String>>();
        sortCriteria = new Vector<Boolean> ();
        for (int i=0; i<pairTable.getColumnCount(); i++)
        {
        	sortCriteria.add(new Boolean(true));
        }
        
        advancedDisplay = false;        
        addListeners();
    }
    
    public void setGuidelineGraph (GuidelineGraph associatedGuidelineGraph){
    	this.guidelineGraph = associatedGuidelineGraph;
    }
    
    private void addListeners ()
    {    	
    	// pairTable.addMouseListener(new GuidelineHistoryFrameMouseListener 
    	//	(pairTable, historyPane, historyRows, styles ));
    	
    	// pairTable.addKeyListener(new GuidelineHistoryFrameKeyListener
    	//	(pairTable, historyPane, historyRows, styles ));
    	
    	pairTable.addMouseListener(new GuidelineHistoryFrameMouseListener(this, pairTable));
    	pairTable.getTableHeader().addMouseListener
    		(new GuidelineHistoryFrameMouseListener(this, pairTable.getTableHeader()));
    	pairTable.addKeyListener(new GuidelineHistoryFrameKeyListener(this, pairTable));

    	jButton1.addActionListener(new java.awt.event.ActionListener()
    	{
    		public void actionPerformed(java.awt.event.ActionEvent evt){
    			changeAdvancedDisplaySetting (false);
    		}
    	});
    	
    	jButton2.addActionListener(new java.awt.event.ActionListener()
    	{
    		public void actionPerformed(java.awt.event.ActionEvent evt){
    			changeAdvancedDisplaySetting (true);
    		}
    	});
    	
    	jButton3.addActionListener(new java.awt.event.ActionListener()
    	{
    		public void actionPerformed(java.awt.event.ActionEvent evt){
    			displayMonitoringReport();
    		}
    	});
    	
    	enableSubguidelineMessagesCheckBox.addActionListener(new java.awt.event.ActionListener()
    	{
    		public void actionPerformed(java.awt.event.ActionEvent evt){
    			
    			JCheckBox cb = (JCheckBox)evt.getSource();
    			if (cb.isSelected())
    			{
    				enableMessageFlowToParentHistoryPanel (true);
    			}
    			else
    			{
    				enableMessageFlowToParentHistoryPanel (false);
    			}
    		}
    	});  	    	
    }
    
    private void changeAdvancedDisplaySetting (boolean flag)
    {
    	advancedDisplay = flag;
    	
    	// so that the new display settings are active
    	this.signalRowSelection(pairTable.getSelectedRow());
    }
    
    private void enableMessageFlowToParentHistoryPanel(boolean flag)
    {
    	enableSubguidelineMessages = flag;
    	
    	DefaultTableModel tableModel = (DefaultTableModel) pairTable.getModel();
    	
    	int colNo = this.getColumnToSort();
    	sortAllRowsBy(tableModel, colNo, this.sortCriteria.elementAt(colNo).booleanValue());
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        pairTableScrollPane = new javax.swing.JScrollPane();
        pairTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        historyPane = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        closeButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        enableSubguidelineMessagesCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Guideline History");
        jSplitPane1.setResizeWeight(1.0);
        jSplitPane1.setOneTouchExpandable(true);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "History of the Guideline"));
        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        pairTable.setFont(new java.awt.Font("Tahoma", 0, 10));
        pairTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
		    
	    },
	    new String [] {
		    "Sequence Number", "Timestamp", "MessageType", "Short Description", "Guideline Name"
	    }
	    ) {
		boolean[] canEdit = new boolean [] {
			false, false, false, false, false, false, false, false
		};

		public boolean isCellEditable(int rowIndex, int columnIndex) {
			return canEdit [columnIndex];
		}
	});
	pairTableScrollPane.setViewportView(pairTable);

	jSplitPane2.setLeftComponent(pairTableScrollPane);

	historyPane.setEditable(false);
	jScrollPane1.setViewportView(historyPane);

	jSplitPane2.setRightComponent(jScrollPane1);

	org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
	jPanel1.setLayout(jPanel1Layout);
	jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
			.add(jSplitPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
			);
	jPanel1Layout.setVerticalGroup(
			jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
			.add(jSplitPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
			);
	jSplitPane1.setLeftComponent(jPanel1);

	jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "History Types"));
	jLabel1.setText("Medical WS");

	jTextField1.setBackground(new java.awt.Color(0, 0, 255));
	jTextField1.setEditable(false);

	jLabel2.setText("EHR Data");

	jTextField2.setBackground(new java.awt.Color(0, 255, 0));
	jTextField2.setEditable(false);

	jLabel3.setText("ALARM");

	jTextField3.setBackground(new java.awt.Color(255, 0, 0));
	jTextField3.setEditable(false);

	jLabel4.setText("Waiting");

	jTextField4.setBackground(new java.awt.Color(255, 153, 255));
	jTextField4.setEditable(false);

	jLabel5.setText("Decision Made");

	jTextField5.setBackground(new java.awt.Color(0, 0, 0));
	jTextField5.setEditable(false);

	jLabel6.setText("Consult");

	jTextField6.setBackground(new java.awt.Color(204, 204, 0));
	jTextField6.setEditable(false);

	jLabel7.setText("Sensor WS");

	jTextField7.setBackground(new java.awt.Color(153, 153, 153));
	jTextField7.setEditable(false);

	org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
	jPanel2.setLayout(jPanel2Layout);
	jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
			.add(jPanel2Layout.createSequentialGroup()
				.addContainerGap()
				.add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
					.add(jPanel2Layout.createSequentialGroup()
						.add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
						.add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
					.add(jPanel2Layout.createSequentialGroup()
						.add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
						.add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
					.add(jPanel2Layout.createSequentialGroup()
						.add(jTextField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
						.add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
					.add(jPanel2Layout.createSequentialGroup()
						.add(jTextField4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
						.add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
					.add(jPanel2Layout.createSequentialGroup()
						.add(jTextField5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
						.add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
					.add(jPanel2Layout.createSequentialGroup()
							.add(jTextField6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
							.add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
					.add(jPanel2Layout.createSequentialGroup()
							.add(jTextField7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
							.add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							);
	jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
			.add(jPanel2Layout.createSequentialGroup()
				.addContainerGap()
				.add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
					.add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
					.add(jLabel1))
				.add(14, 14, 14)
				.add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
					.add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
					.add(jLabel2))
				.add(14, 14, 14)
				.add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
					.add(jTextField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
					.add(jLabel3))
				.add(14, 14, 14)
				.add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
					.add(jTextField4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
					.add(jLabel4))
				.add(15, 15, 15)
				.add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
					.add(jTextField5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
					.add(jLabel5))
				.add(14, 14, 14)
				.add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
						.add(jTextField6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
						.add(jLabel6))
				.add(15, 15, 15)
				.add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
						.add(jTextField7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
						.add(jLabel7))
				.addContainerGap(238, Short.MAX_VALUE))
				);
	jSplitPane1.setRightComponent(jPanel2);

	closeButton.setText("Close");
	closeButton.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			closeButtonActionPerformed(evt);
		}
	});

	jButton1.setText("Basic");

	jButton2.setText("Advanced");
	
	jButton3.setText("Display Monitoring Summary Report");

	enableSubguidelineMessagesCheckBox.setText("View messages from sub-guidelines.");
	enableSubguidelineMessagesCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
	enableSubguidelineMessagesCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));

	org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
	getContentPane().setLayout(layout);
	layout.setHorizontalGroup(
			layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
			.add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
				.addContainerGap()
				.add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
					.add(layout.createSequentialGroup()
						.add(10, 10, 10)
						.add(jButton1)
						.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
						.add(jButton2)
						.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
						.add(enableSubguidelineMessagesCheckBox)
						.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
						.add(jButton3)
						.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 219, Short.MAX_VALUE)
						.add(closeButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 143, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
					.add(org.jdesktop.layout.GroupLayout.LEADING, jSplitPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE))
				.addContainerGap())
			);
	layout.setVerticalGroup(
			layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
			.add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
				.addContainerGap()
				.add(jSplitPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
				.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
				.add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
					.add(closeButton)
					.add(jButton1)
					.add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
					.add(enableSubguidelineMessagesCheckBox)
					.add(jButton3))
				.addContainerGap())
			);
	pack();
    }// </editor-fold>                        


    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
	    this.setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed
    
    public void displayMonitoringReport ()
    {
    	if ( guidelineGraph != null ){
    		guidelineGraph.getMonitoringReport().displayReport(guidelineGraph);
    	}
    }

    public void addLineToHistory(StyledText styledText){
	    int type = styledText.getType();
	    
	    if (type==GuidelineHistoryFrame.NEW_CYCLE_STYLE_TYPE){
	    	cycleCounter++;
	    }

	    int seqNo = this.historyRows.size();
	    styledText.setSequenceNumber(seqNo);
	    this.historyRows.add(styledText);

	    DefaultTableModel tableModel = (DefaultTableModel)pairTable.getModel();

	    Date date = new Date(styledText.getTime());
	    SimpleDateFormat dateFormat = new SimpleDateFormat("'['EEE, d MMM yyyy HH:mm:ss']'\n");

	    Vector<String> currentLine = new Vector<String>();

	    currentLine.add( Integer.toString(styledText.getSequenceNumber()) );
	    currentLine.add( dateFormat.format(date) );
	    currentLine.add( styledText.getTypeString() );
	    currentLine.add( styledText.getShortDescription() );
	    currentLine.add( styledText.getGuidelineID() );
	    
	    // [@30.10.2007, gunes]
	    // invisible column: make sure that it does not appear on the table
	    currentLine.add(Integer.toString(cycleCounter));
	    
	    unfilteredRows.add(currentLine);

	    //tableModel.addRow(currentLine);	    
	    
		// it means that messages from subguideline should
		// be filtered out
	    int colToCompare = 4;
		if ( currentLine.elementAt(colToCompare).equalsIgnoreCase(guidelineName) ){
				filteredRows.add(currentLine);				
		}

	    int colNo = getColumnToSort();
	    sortAllRowsBy(tableModel, colNo, this.sortCriteria.elementAt(colNo).booleanValue());
    }

    //  Regardless of sort order (ascending or descending), null values always appear last.
    // colIndex specifies a column in model.
    public void sortAllRowsBy(DefaultTableModel model, int colIndex, boolean ascending) {

	    int lastSelectedRow = pairTable.getSelectedRow();
	    String sequenceNoStr = "";
	    if (lastSelectedRow >= 0 && lastSelectedRow < pairTable.getRowCount())
	    {
		    // obtain the sequence number
		    // of the last selected row
		    sequenceNoStr = (String)model.getValueAt(lastSelectedRow, 0);    		
	    }

	    
    	Vector<String> colIdentifiers = new Vector<String> ();
    	colIdentifiers.add("Sequence Number");
    	colIdentifiers.add("Timestamp");
    	colIdentifiers.add("Message Type");
    	colIdentifiers.add("Short Description");
    	colIdentifiers.add("Guideline Name");    	
	    
    	if (this.enableSubguidelineMessages == true){
    		Collections.sort(unfilteredRows, new ColumnSorter(colIndex, ascending));
    		Vector<Vector<String>> rawData = new Vector<Vector<String>>();
    		Iterator<Vector<String>> rowsItr = unfilteredRows.iterator();
    		while (rowsItr.hasNext()){
    			Vector<String> tmp = (Vector<String>) rowsItr.next().clone();
    			rawData.add(tmp);
    		}
    		// model.setDataVector((Vector<Vector<String>>) unfilteredRows.clone(), colIdentifiers);
    		model.setDataVector(rawData, colIdentifiers);
    	}
    	else {
    		Collections.sort(filteredRows, new ColumnSorter(colIndex, ascending));
    		Vector<Vector<String>> rawData = new Vector<Vector<String>>();
    		Iterator<Vector<String>> rowsItr = filteredRows.iterator();
    		while (rowsItr.hasNext()){
    			Vector<String> tmp = (Vector<String>) rowsItr.next().clone();
    			rawData.add(tmp);
    		}
	    	// model.setDataVector((Vector<Vector<String>>) filteredRows.clone(), colIdentifiers);
    		model.setDataVector(rawData, colIdentifiers);
	    }
	    
	    Vector data = model.getDataVector();
	    // Collections.sort(data, new ColumnSorter(colIndex, ascending));

	    // it means that you have to manually 
	    // find and reset the previously selected
	    // row
	    int counter = 0;
	    Iterator<Vector<String>> dataItr = data.iterator();
	    while (dataItr.hasNext()){
		    if (dataItr.next().elementAt(0) == sequenceNoStr){
			    pairTable.setRowSelectionInterval(counter, counter);
		    }
		    counter++;
	    }
    }

    // This comparator is used to sort vectors of data
    public class ColumnSorter implements Comparator {
	    int colIndex;
	    boolean ascending;
	    ColumnSorter(int colIndex, boolean ascending) {
		    this.colIndex = colIndex;
		    this.ascending = ascending;
	    }
	    public int compare(Object a, Object b) {
		    Vector v1 = (Vector)a;
		    Vector v2 = (Vector)b;
		    Object o1 = v1.get(colIndex);
		    Object o2 = v2.get(colIndex);
		    
		    Integer cycleCount_a = Integer.parseInt((String)v1.lastElement());
		    Integer cycleCount_b = Integer.parseInt((String)v2.lastElement());
		    

		    if (cycleCount_a.equals(cycleCount_b)){		    
			    try{
				    Integer i1 = Integer.parseInt((String)o1);
				    Integer i2 = Integer.parseInt((String)o2);	
				    // so that both of the above two
				    // lines pass the exception test
				    o1 = i1;
				    o2 = i2;
			    }
			    catch (Exception e){	
			    }
	
			    // Treat empty strains like nulls
			    if (o1 instanceof String && ((String)o1).length() == 0) {
				    o1 = null;
			    }
			    if (o2 instanceof String && ((String)o2).length() == 0) {
				    o2 = null;
			    }
	
			    // Sort nulls so they appear last, regardless
			    // of sort order
			    if (o1 == null && o2 == null) {
				    return 0;
			    } else if (o1 == null) {
				    return 1;
			    } else if (o2 == null) {
				    return -1;
			    } else if (o1 instanceof Comparable) {
				    if (ascending) {
					    return ((Comparable)o1).compareTo(o2);
				    } else {
					    return ((Comparable)o2).compareTo(o1);
				    }
			    } else {
				    if (ascending) {
					    return o1.toString().compareTo(o2.toString());
				    } else {
					    return o2.toString().compareTo(o1.toString());
				    }
			    }
		    }
		    else{
		    	if (ascending){
		    		return cycleCount_a.compareTo(cycleCount_b);
		    	}
		    	else {
		    		return cycleCount_b.compareTo(cycleCount_a);
		    	}
		    }
		    
		    
		    
	    }
    }

    private void prepareStyles() {
	    styles.add( createStyle("Monospaced", 12, Color.white, Color.blue, true, false) );
	    styles.add( createStyle("Monospaced", 12, Color.white, Color.green, false, false) );
	    styles.add( createStyle("Monospaced", 15, Color.lightGray, Color.red, true, false) );
	    styles.add( createStyle("Monospaced", 12, Color.white, Color.magenta, false, false) );
	    styles.add( createStyle("Monospaced", 12, Color.white, Color.black, true, true) );
	    styles.add( createStyle("Monospaced", 12, Color.white, Color.orange, true, false) );
	    styles.add( createStyle("Monospaced", 12, Color.white, Color.darkGray, false, true) );
	    styles.add( createStyle("Monospaced", 12, Color.white, Color.black, true, false) );

	    normalFont = jLabel1.getFont();
	    selectedFont = new Font(normalFont.getName(), Font.BOLD, normalFont.getSize());
	    normalFont = new Font(normalFont.getName(), Font.PLAIN, normalFont.getSize()-2);
    }

    private SimpleAttributeSet createStyle(String fontFamily, int fontSize,
		    Color backgroundColor, Color foregroundColor,
		    boolean isBold, boolean isItalic){

	    SimpleAttributeSet style = new SimpleAttributeSet();
	    StyleConstants.setFontFamily(style, fontFamily);
	    StyleConstants.setFontSize(style, fontSize);
	    StyleConstants.setBackground(style, backgroundColor);
	    StyleConstants.setForeground(style, foregroundColor);
	    StyleConstants.setBold(style, isBold);
	    StyleConstants.setItalic(style, isItalic);

	    return style;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
	    java.awt.EventQueue.invokeLater(new Runnable() {
		    public void run() {
			    new GuidelineHistoryFrame().setVisible(true);
		    }
	    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JCheckBox enableSubguidelineMessagesCheckBox;
    private javax.swing.JTextPane historyPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTable pairTable;
    private javax.swing.JScrollPane pairTableScrollPane;
    // End of variables declaration//GEN-END:variables

    public void setFont(JLabel label, boolean isSelected){
	    label.setFont( isSelected ? selectedFont : normalFont );
    }

    /* Gunes ALUC, SRDC, 07 June 2007 *******************/
    /*  extension to enable the Monitoring Agent/GUI ****/
    /*  display messages in a more user-friendly way. ***/

    public void displayHistory(JComponent owner, Vector<StyledText> histories, String guidelineStep){

	    // [GUNES]
	    // You have to clear previous entries in the list
	    flushAll();

	    historyPane.setContentType("text/html");

	    this.guidelineStepName = guidelineStep;

	    StyledDocument doc = historyPane.getStyledDocument();
	    try {
		    doc.remove(0,doc.getLength());//clear previous text
	    } catch (BadLocationException e) {
		    e.printStackTrace();
	    }
	    setLocationRelativeTo(owner);
	    if(histories != null){
		    for (int i = 0; i < histories.size(); i++) {
			    StyledText styledText = histories.elementAt(i);
			    addLineToHistory(styledText);
		    }
	    }

	    setVisible(true);
    }

    public synchronized void signalRowSelection (int selectedRow)
    {
	    if (selectedRow >= 0)
	    {			
		    // clear the old text
		    historyPane.setText("");
		    historyPane.setContentType("text/html");

		    Logger.getLogger(this.getClass()).log(Level.DEBUG, ("historyPane's text cleared"));

		    DefaultTableModel tableModel = (DefaultTableModel) pairTable.getModel();
		    String sequenceNumberStr = (String) tableModel.getValueAt(selectedRow, 0);
		    int sequenceNumber = Integer.parseInt(sequenceNumberStr);			

		    // replace it with the new
		    StyledDocument doc = historyPane.getStyledDocument();

		    StyledText styledText = historyRows.elementAt(sequenceNumber);
		    int type = styledText.getType();
		    String strToBeAdded = styledText.getText(advancedDisplay);

		    Logger.getLogger(this.getClass()).log(Level.DEBUG, ("styledText = " + strToBeAdded));

		    Date date = new Date(styledText.getTime());
		    SimpleDateFormat dateFormat = new SimpleDateFormat("'['EEE, d MMM yyyy HH:mm:ss']'\n");

		    Logger.getLogger(this.getClass()).log(Level.DEBUG, ("styles = " + styles));

		    try {
			    doc.insertString(0, "-----------------------------------------------------------\n", styles.get(GuidelineHistoryFrame.SENSOR_STYLE_TYPE));
			    doc.insertString(0, dateFormat.format(date) + strToBeAdded + "\n", styles.get(type));
		    } catch (BadLocationException e) {
			    Logger.getLogger(this.getClass()).log(Level.DEBUG, ("in bad location exception..."));
			    e.printStackTrace();
		    }
	    }
    }

    public synchronized void setColumnToSort (int colIndex)
    {
	    if (colIndex >= 0)
	    {
		    if (colIndex == prevColToSort)
		    {
			    Boolean curCriteria = this.sortCriteria.elementAt(colIndex);
			    curCriteria = new Boolean (!curCriteria.booleanValue());
			    this.sortCriteria.insertElementAt(curCriteria, colIndex);
		    }

		    prevColToSort = colIndex; 

		    this.colToSort = colIndex;
		    DefaultTableModel tableModel = (DefaultTableModel)pairTable.getModel();
		    sortAllRowsBy(tableModel, colToSort, this.sortCriteria.elementAt(colToSort).booleanValue());
	    }
    }

    public synchronized int getColumnToSort ()
    {
	    return this.colToSort;
    }

    private void flushAll()
    {
	    historyRows.removeAllElements();
	    filteredRows.removeAllElements();
	    unfilteredRows.removeAllElements();
	    
	    DefaultTableModel tableModel = (DefaultTableModel)pairTable.getModel();
	    tableModel.setRowCount(0);
    }
    
    public void setGuidelineName (String name)
    {
    	this.guidelineName = name;
    	this.setTitle(guidelineName);
    }
    /* END-OF-EXTENSION *********************************/

    public void appendLiveHistory(String newStep, StyledText text) {
	    if(newStep == null)
		    return;
	    if(guidelineStepName==null)
		    return;
	    if(guidelineStepName.equals(GuidelineGraph.FULL_GUIDELINE_HISTORY) || guidelineStepName.equals(newStep))
		    addLineToHistory(text);
    }
}
