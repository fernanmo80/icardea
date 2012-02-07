package de.offis.health.icardea.ppm;

public class PPMSubItemsModel {
	private String lowTime;
	private String highTime;
	private String text;

	public PPMSubItemsModel(String text, String low, String high) {
		// TODO Auto-generated constructor stub
		this.setText(text);
		this.setLowTime(low);
		this.setHighTime(high);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PPMSubItemsModel [lowTime=" + lowTime + ", highTime="
				+ highTime + ", text=" + text + "]";
	}

	/**
	 * @return the lowTime
	 */
	public String getLowTime() {
		return lowTime;
	}
	/**
	 * @return the highTime
	 */
	public String getHighTime() {
		return highTime;
	}
	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}
	public void setLowTime(String lowTime) {
		//TODO:check the time
		this.lowTime=lowTime;
//		if (lowTime!=null) 
//			if (lowTime.length()>=8)
//				this.lowTime = PPMDataset.convTimeToPoint(lowTime);
	}
	public void setHighTime(String highTime) {
		//TODO:check the time
		this.highTime=highTime;
//		if (highTime!=null)
//			if (highTime.length()>=8)
//				this.highTime =  PPMDataset.convTimeToPoint(highTime);

	}
	public void setText(String text) {
		this.text = text;
	}


	
}
