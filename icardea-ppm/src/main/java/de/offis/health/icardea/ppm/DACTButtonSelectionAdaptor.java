package de.offis.health.icardea.ppm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;



public class DACTButtonSelectionAdaptor extends SelectionAdapter {
	String viewname="empty";
	int position=0;
	PPMDataset ppmDataset;
	TabFolder tabFolder=PPMMain.mainTabFolder;
	Table table;
	TableViewer tableViewer;

	public DACTButtonSelectionAdaptor() {
		System.out.println(viewname + "EMPTY DACT Tab created");

	}


//	public DACTButtonSelectionAdaptor(String viewname){
//		super();
//		ppmDataset= PPMDataset.getInstance();
//		this.viewname=viewname;
//		tabFolder=PPMMain.mainTabFolder;
//		//		System.out.println(viewname + "created");
//		//Crete an fill the tab
//	}
	public DACTButtonSelectionAdaptor(String viewname,TabFolder myTabfolder){
		super();
		ppmDataset= PPMDataset.getInstance();
		this.viewname=viewname;
		this.tabFolder=myTabfolder;

				System.out.println(viewname + " created inkl Tabfolder:"+myTabfolder);

	}
	
	public void widgetSelected(SelectionEvent e){
		//	super.widgetSelected(e);
//		System.out.println(viewname + " selected");
if (tabFolder==null){
	tabFolder=PPMMain.mainTabFolder;
}
		position=tabFolder.getSelectionIndex();
		Composite composite;
// Found for identifieng, if the Tab already exist 
		boolean found=false;
		int i;
		TabItem tbarray[] = tabFolder.getItems();
		for ( i=0; i< tbarray.length;i++){
			if (tbarray[i].getText().equalsIgnoreCase(viewname)){
				found=true;
				tabFolder.setSelection(i);
				if (table!=null){
					//existing, but from annother Buttun
					table.clearAll();
					// FillTable is the call populating the excel
					fillTable();
				}
				tabFolder.pack(true);
				tabFolder.redraw();
				return;
			}
		}

		TabItem tbtm = new TabItem(tabFolder, SWT.NONE);
		//tbtm.setControl(table);
		
		tbtm.setText(viewname);
		
		composite = new Composite(tabFolder, SWT.NONE);
		tbtm.setControl(composite);
		
		TableColumnLayout layout = new TableColumnLayout();

		composite.setLayout(layout);
		tableViewer = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION|SWT.V_SCROLL);
		table = tableViewer.getTable();


		//	table = new Table(composite, SWT.BORDER |SWT.V_SCROLL);

		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		// Hier werden die Zeilen kreiert!
		//0. spalte
				{
					TableColumn column ;
					//			column = new TableColumn(table, SWT.LEFT);
					TableViewerColumn vcolumn =new TableViewerColumn(tableViewer, SWT.LEFT);
					column = vcolumn.getColumn();
					column.setWidth(20);
					//			column.setResizable(false);
					layout.setColumnData(column, new ColumnWeightData( 20,10,true ));

					column.setText("ID");
				}

		
		//1. spalte
		{
			TableColumn column ;
			//			column = new TableColumn(table, SWT.LEFT);
			TableViewerColumn vcolumn =new TableViewerColumn(tableViewer, SWT.LEFT);
			column = vcolumn.getColumn();
			column.setWidth(150);
			//			column.setResizable(false);
			layout.setColumnData(column, new ColumnWeightData( 50,20,true ));

			column.setText("Prerequisuite");
		}
		//2. spalte
		{
			TableColumn column ;
			//			column = new TableColumn(table, SWT.LEFT);
			TableViewerColumn vcolumn =new TableViewerColumn(tableViewer, SWT.LEFT);
			column = vcolumn.getColumn();
			//			column.setWidth(50);
			//			column.setResizable(false);
			layout.setColumnData(column, new ColumnWeightData( 20,50,false  ));
			//layout.setColumnData(column,  )
			column.setText("Conclusion");
			//			column.pack();
		}
		//3. spalte 
		{	
			TableColumn column ;
			//			column = new TableColumn(table, SWT.LEFT);
			TableViewerColumn vcolumn =new TableViewerColumn(tableViewer, SWT.LEFT);
			column = vcolumn.getColumn();

			column.setWidth(100);
			column.setResizable(true);
			layout.setColumnData(column, new ColumnWeightData( 100 ));
			column.setText("Confidence");
		}
		//4. spalte 
				{	
					TableColumn column ;
					//			column = new TableColumn(table, SWT.LEFT);
					TableViewerColumn vcolumn =new TableViewerColumn(tableViewer, SWT.LEFT);
					column = vcolumn.getColumn();

					column.setWidth(100);
					column.setResizable(true);
					layout.setColumnData(column, new ColumnWeightData( 200 ));
					column.setText("Support");
				}
				//5. spalte 
				{	
					TableColumn column ;
					//			column = new TableColumn(table, SWT.LEFT);
					TableViewerColumn vcolumn =new TableViewerColumn(tableViewer, SWT.LEFT);
					column = vcolumn.getColumn();

					column.setWidth(20);
					column.setResizable(true);
					layout.setColumnData(column, new ColumnWeightData( 200 ));
					column.setText("PAtternID");
				}

		fillTable();

		tabFolder.setSelection(i);
		
		
		composite.addFocusListener(new FocusListener(){

			public void focusGained(FocusEvent event) {
				// TODO Auto-generated method stub
				System.out.println("Got Focus."+event);
			}

			public void focusLost(FocusEvent event) {
				// TODO Auto-generated method stub
				
				
			}});
	}
/*
 * At this method the Tab-Excel is filled propabbly using hidden SQL statemens	
 */
	void fillTable(){
		System.out.println("DACT Button Test - filltable");
// The database access is done via the ppmDataset. I should use the DactPatternDataSEt
		int currentItems=table.getItemCount();
		boolean noHightime=true;
		int nextItem=0;
		String sqlQuery="";		
			//TODO keep in mind, that parameter is NOT unique withhin one patid, may be sheet have to be added
		ResultSet rs = null;
		DactPatternDataSet curPattern = new DactPatternDataSet();
		sqlQuery = "SELECT "+ 
		  " pattern_id, "+
		  " prerequisite_db_relations,  "+
		  " prerequisiute_db_attributes,  "+
		  " prerequisite_view,  "+
		  " conclusion_db_attribute,  "+
		  " conclusion_db_relation,  "+
		  " confidence_view,  "+
		  " conclusion_view,  "+
		  " support_view,  "+
		  " approvedstatus_view,  "+
		  " validforpatient,  "+
		  " creationdate,  "+
		  " creationsource,  "+
		  " active  "+
		  " FROM "+ 
		  " dact_pattern " +
		  " order by pattern_id;";
		
		try {
			rs = ppmDataset.getStmt().executeQuery(sqlQuery);
			System.out.println("DACT Button Test - getSTmt");
			// Is the preReqValid for Patient?
			//curPattern.preReqFullFilled = rs.getBoolean("");
			//`validforpatient`,
			//curPattern.validForPat=rs.getBoolean("");
			
			while (rs.next())
				{
				System.out.println("DACT Button Test - resultset");
					curPattern.patternID=rs.getInt("pattern_id");
					curPattern.viewPreReq=rs.getString("prerequisite_view");
				//  `pattern_id`,
					curPattern.patternID = rs.getInt("pattern_id");
					//`prerequisite_db_relations`,
					curPattern.preReqRelations = rs.getString("prerequisite_db_relations");
					//`prerequisiute_db_attributes`,
					curPattern.preReqAttributes =rs.getString("prerequisiute_db_attributes");
					//`prerequisite_view`,
					curPattern.viewPreReq = rs.getString("prerequisite_view");
					// `conclusion_db_attribute`,
					curPattern.conCluAttribute =rs.getString("conclusion_db_attribute");
					// `conclusion_db_relation`,
					curPattern.concluRelation =rs.getString("conclusion_db_relation");
					// `confidence_view`,
					curPattern.viewConf =rs.getString("confidence_view");
					//`conclusion_view`,
					curPattern.viewConclu=rs.getString("conclusion_view");
					//`support_view`,
					curPattern.viewSupport = rs.getString("support_view");
					//`approvedstatus_view`,
					curPattern.viewApproved = rs.getString("approvedstatus_view");
					//`creationdate`,
					curPattern.creationDate =rs.getString("creationdate");
					//`creationsource`,
					curPattern.creationSource =rs.getString("creationsource");
					//`active`
					curPattern.active = rs.getBoolean("active");
				
					//Die Items in die Tabelle schreiben
					TableItem tableItem = new TableItem(table, SWT.NONE);
					tableItem.setText(0, curPattern.patternID.toString());
					tableItem.setText(1, curPattern.viewPreReq);
					tableItem.setText(2, curPattern.viewConclu);
					tableItem.setText(3, curPattern.viewConf);
					tableItem.setText(4, curPattern.viewSupport);
				
				}
			
			} 
		catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		finally{
				try {
					rs.close();
				} catch (SQLException e) {
					System.out.println("Major datatbase error. Restart"+e.getErrorCode());;
				}
			
		}
	
		
		
		/*if (allRows!=null){
			int nextItem=0;
			for (int j=0;j<allRows.length;j++){
				{   
//					System.out.println("Curr:"+currentdate +" Comp:"+allRows[j].getLowTime() +" REsult"+allRows[j].getLowTime().compareToIgnoreCase(currentdate));
					if (allRows[j].getLowTime().compareToIgnoreCase(currentdate)<=0   )
					{   TableItem tableItem;
						if (nextItem>=currentItems) {
							 tableItem = new TableItem(table, SWT.NONE);

						}else{
							 tableItem = table.getItem(nextItem);
							
							 nextItem++;
						}
//						System.out.println(allRows[j]);
						tableItem.setText(0,PPMDataset.convTimeToPoint(allRows[j].getLowTime()));
						
						if (allRows[j].getHighTime().length() <3 )
							{
							tableItem.setText(1,"");
//							System.out.println("Notime:"+allRows[j].getHighTime());
							}else{
								tableItem.setText(1,PPMDataset.convTimeToPoint(allRows[j].getHighTime()));
								noHightime=false;
								
							}
						//						tableItem.setText(2,allRows[i].getSubContentName());
						if (allRows[j].getText()==null){
							tableItem.setText(2,"");
						}else{
							tableItem.setText(2,allRows[j].getText());

						}
						
					}
				}
			}
			if (noHightime ) {
				System.out.println("Resize");
				tableViewer.getTable().getColumn(1).setWidth(1);
				//tableViewer.refresh();
			}
		}
*/	}
}