/**
 * 
 */
package de.offis.health.icardea.ppm;

import org.eclipse.swt.SWT;

/**
 * @author thiel
 *
 */
public class PPMRowModel {

	
	private String name;
	private String content;
	private String type;
	private String explanation;
	private boolean hasSubcontent;
	private String subContentName;
	/**
	 * @return the rowColor
	 */
	public org.eclipse.swt.SWT getRowColor() {
		return rowColor;
	}

	/**
	 * @param rowColor the rowColor to set
	 */
	public void setRowColor(org.eclipse.swt.SWT rowColor) {
		this.rowColor = rowColor;
	}

	private  org.eclipse.swt.SWT rowColor;

	
	
	/**
	 * 
	 */
	public PPMRowModel() {
		// TODO Auto-generated constructor stub
	}

	public PPMRowModel(String name,String content, String type) {
		setName(name);
		setContent(content);
		setType(type);
		setExplanation("no further information");
		
		
	}
	public PPMRowModel(String name,String content, String type ,boolean hasSubcontent, String subContent) {
		setName(name);
		setContent(content);
		setType(type);
		setExplanation("no further information");
		setHasSubcontent(hasSubcontent);
		setSubContentName(subContent);
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PPMRowModel [name=" + name + ", content=" + content + ", type="
				+ type + ", explanation=" + explanation + ", hasSubcontent="
				+ hasSubcontent + ", subContentName=" + subContentName + "]";
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
		if (type.equalsIgnoreCase("List")){
			setHasSubcontent(true);
		}
				
	}

	/**
	 * @return the explanation
	 */
	public String getExplanation() {
		return explanation;
	}

	/**
	 * @param explanation the explanation to set
	 */
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	/**
	 * @return the hasSubcontent
	 */
	public boolean isHasSubcontent() {
		return hasSubcontent;
	}

	/**
	 * @param hasSubcontent the hasSubcontent to set
	 */
	public void setHasSubcontent(boolean hasSubcontent) {
		this.hasSubcontent = hasSubcontent;
	}

	/**
	 * @return the subContentName
	 */
	public String getSubContentName() {
		return subContentName;
	}

	/**
	 * @param subContentName the subContentName to set
	 */
	public void setSubContentName(String subContentName) {
		this.subContentName = subContentName;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
