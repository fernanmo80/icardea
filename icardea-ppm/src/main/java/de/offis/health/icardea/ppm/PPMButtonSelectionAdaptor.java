package de.offis.health.icardea.ppm;

import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;



public class PPMButtonSelectionAdaptor extends SelectionAdapter {
	String viewname="empty";
	int position=0;
	PPMDataset ppmDataset;
	TabFolder tabFolder=PPMMain.mainTabFolder;
	Table table;
	TableViewer tableViewer;

	public PPMButtonSelectionAdaptor() {
		System.out.println(viewname + "EMPTY created");

	}


	//	public PPMButtonSelectionAdaptor(String viewname){
	//		super();
	//		ppmDataset= PPMDataset.getInstance();
	//		this.viewname=viewname;
	//		tabFolder=PPMMain.mainTabFolder;
	//		//		System.out.println(viewname + "created");
	//		//Crete an fill the tab
	//	}
	public PPMButtonSelectionAdaptor(String viewname,TabFolder myTabfolder){
		super();
		ppmDataset= PPMDataset.getInstance();
		this.viewname=viewname;
		this.tabFolder=myTabfolder;

		//				System.out.println(viewname + " created inkl Tabfolder:"+myTabfolder);

	}

	public void widgetSelected(SelectionEvent e){
		//	super.widgetSelected(e);
		//		System.out.println(viewname + " selected");
		if (tabFolder==null){
			tabFolder=PPMMain.mainTabFolder;
		}
		position=tabFolder.getSelectionIndex();
		Composite composite;

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
		{
			TableColumn column ;
			//			column = new TableColumn(table, SWT.LEFT);
			TableViewerColumn vcolumn =new TableViewerColumn(tableViewer, SWT.LEFT);
			column = vcolumn.getColumn();
			column.setWidth(150);
			//			column.setResizable(false);
			layout.setColumnData(column, new ColumnWeightData( 20,50,false ));

			column.setText("From       ");
		}
		{
			TableColumn column ;
			//			column = new TableColumn(table, SWT.LEFT);
			TableViewerColumn vcolumn =new TableViewerColumn(tableViewer, SWT.LEFT);
			column = vcolumn.getColumn();
			//			column.setWidth(50);
			//			column.setResizable(false);
			layout.setColumnData(column, new ColumnWeightData( 20,50,false  ));
			//layout.setColumnData(column,  )
			column.setText("Until      ");
			//			column.pack();
		}
		{	
			TableColumn column ;
			//			column = new TableColumn(table, SWT.LEFT);
			TableViewerColumn vcolumn =new TableViewerColumn(tableViewer, SWT.LEFT);
			column = vcolumn.getColumn();

			column.setWidth(200);
			column.setResizable(true);
			layout.setColumnData(column, new ColumnWeightData( 200 ));
			column.setText("Description");
		}
		fillTable();

		tabFolder.setSelection(i);


//		composite.addFocusListener(new FocusListener(){
//
//			public void focusGained(FocusEvent event) {
//				// TODO Auto-generated method stub
//				System.out.println("Got Focus."+event);
//			}
//
//			public void focusLost(FocusEvent event) {
//				// TODO Auto-generated method stub
//
//
//			}});
	}
	void fillTable(){

		PPMSubItemsModel[] allRows= ppmDataset.getSubItems(this.viewname);
		String currentdate=ppmDataset.getCurrentDate();
		int currentItems=table.getItemCount();
		boolean noHightime=true;
		if (allRows!=null){
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
//				System.out.println("Resize");
				tableViewer.getTable().getColumn(1).setWidth(1);
				//tableViewer.refresh();
			}
		}
	}
}