package de.offis.health.icardea.ppm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.PlatformUI;



public class DACTButtonSelectionAdaptor extends SelectionAdapter {
	String viewname="empty";
	int position=0;
	PPMDataset ppmDataset;
	TabFolder tabFolder=PPMMain.mainTabFolder;
	Table table;
	TableViewer tableViewer;

	public DACTButtonSelectionAdaptor() {
		//System.out.println("EMPTY DACT Tab created");
	}


	public DACTButtonSelectionAdaptor(String viewname,TabFolder myTabfolder){
		super();
		ppmDataset= PPMDataset.getInstance();
		this.viewname=viewname;
		this.tabFolder=myTabfolder;
		//System.out.println(viewname + " created inkl Tabfolder:"+myTabfolder);

	}

	public void widgetSelected(SelectionEvent e){

		new Thread() {
			public void run() {
				Runnable r = new Runnable(){
					public void run(){
						//code insert
						// 		Invalid thread access Error problem:
						//position= tabFolder.getSelectionIndex();
						// @AT: This could fix it
//						if (tabFolder==null){
							tabFolder=PPMMain.mainTabFolder;
//						}

						position = PPMMain.mainTabFolder.getSelectionIndex();	
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
						//0. Spalte PatternID
						{
							TableColumn column ;
							//			column = new TableColumn(table, SWT.LEFT);
							TableViewerColumn vcolumn =new TableViewerColumn(tableViewer, SWT.LEFT);
							column = vcolumn.getColumn();
							column.setWidth(30);
							//			column.setResizable(false);
							layout.setColumnData(column, new ColumnWeightData( 30,20,true ));

							column.setText("PatternID");
						}


						//1. spalte Vorbedingung
						{
							TableColumn column ;
							//			column = new TableColumn(table, SWT.LEFT);
							TableViewerColumn vcolumn =new TableViewerColumn(tableViewer, SWT.LEFT);
							column = vcolumn.getColumn();
							column.setWidth(150);
							//			column.setResizable(false);
							layout.setColumnData(column, new ColumnWeightData( 150,100,true ));

							column.setText("Prerequisuite");
						}
						//2. spalte SChlussfolgerungen
						{
							TableColumn column ;
							//			column = new TableColumn(table, SWT.LEFT);
							TableViewerColumn vcolumn =new TableViewerColumn(tableViewer, SWT.LEFT);
							column = vcolumn.getColumn();
							column.setWidth(100);
							//			column.setResizable(false);
							layout.setColumnData(column, new ColumnWeightData( 100,80,false  ));
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

							column.setWidth(35);
							column.setResizable(true);
							layout.setColumnData(column, new ColumnWeightData( 35,10,false ));
							column.setText("Confidence");
						}
						//4. spalte 
						{	
							TableColumn column ;
							//			column = new TableColumn(table, SWT.LEFT);
							TableViewerColumn vcolumn =new TableViewerColumn(tableViewer, SWT.LEFT);
							column = vcolumn.getColumn();

							column.setWidth(45);
							column.setResizable(true);
							layout.setColumnData(column, new ColumnWeightData(50 ));
							column.setText("Support");
						}
						//5. spalte 
						{	
							TableColumn column ;
							//			column = new TableColumn(table, SWT.LEFT);
							TableViewerColumn vcolumn =new TableViewerColumn(tableViewer, SWT.LEFT);
							column = vcolumn.getColumn();

							column.setWidth(200);
							column.setResizable(true);
							layout.setColumnData(column, new ColumnWeightData( 200 ));
							column.setText("Comments");
						}

						fillTable();

						tabFolder.setSelection(i);

					}
				};
				//-> Exception in thread "Thread-0" org.eclipse.swt.SWTException: Invalid thread access
				Display d=PPMMain.ppmMainDisplay;
				d.asyncExec(r);
			}
		}.start();

		//	super.widgetSelected(e);
		//		System.out.println(viewname + " selected");



	}
	/*
	 * At this method the Tab-Excel is filled propabbly using hidden SQL statemens	
	 */
	void fillTable(){
		//Nur fuer lokales faerben
		Display d=PPMMain.ppmMainDisplay;
		//System.out.println("DACT Button Test - filltable");
		ppmDataset.dactCalled();
		int patientID= 2;
		patientID=Integer.parseInt(ppmDataset.getiCardeaID());
		// The database access is done via the ppmDataset. I use the DactPatternDataSEt for convince semi-automatic storag
		// removes the items of the tAble. AT stated, there could be a problem
		table.removeAll();
		//int currentItems=table.getItemCount();

		boolean noHightime=true;
		ArrayList<DactPatternDataSet> allPatterns = ppmDataset.getDactItems();
		allPatterns = ppmDataset.checkDactItems(allPatterns, patientID );
		//ArrayList<DactPatternDataSet> allPatterns = ppmDataset.getPatternStatus(patientID);
		// now run through the patterns
		for (int i=0; i < allPatterns.size(); i++  ) 
		{
			DactPatternDataSet selected = allPatterns.get(i);

			//Coloring, see PPMMAin Line 212
			//	tableItem.setForeground(display.getSystemColor(SWT.COLOR_INFO_BACKGROUND));
			// tableItem.setBackground(display.getSystemColor(SWT.COLOR_DARK_RED));
			
			
			//Write the items into the table
			TableItem tableItem = new TableItem(table, SWT.NONE);
			tableItem.setText(0, selected.patternID.toString());
			tableItem.setText(1, selected.viewPreReq);
			tableItem.setText(2, selected.viewConclu);
			tableItem.setText(3, selected.viewConf);
			tableItem.setText(4, selected.viewSupport);
			
			if (selected.validForPat){
				tableItem.setText(5, "Totally Fullfilled by patient");
				tableItem.setForeground(d.getSystemColor(SWT.COLOR_DARK_GREEN));
			}
			else if (selected.preReqFullFilled) {
				tableItem.setText(5, "PreReq Fullfilled by patient");
				tableItem.setForeground(d.getSystemColor(SWT.COLOR_DARK_MAGENTA));
			}

			;

		}



	}
}