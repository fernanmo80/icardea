package de.offis.health.icardea.ppm;

	import java.beans.PropertyChangeListener;
	import java.beans.PropertyChangeSupport;

public class Pattern {
		private Integer patternID;
	 	private String preRequisite;
		private String conClusion;
		private boolean approved;
		private String support;
		private Integer confidence;
		private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(
				this);

		public Pattern() {
		}

		public Pattern(Integer pPatternID, String pPreRequisite, String pConclusion, String pSupport,
				boolean pApporoved, Integer pConfidence) {
			super();
			this.patternID = pPatternID;
			this.preRequisite = pPreRequisite;
			this.conClusion = pConclusion;
			this.support = pSupport;
			this.approved = pApporoved;
			this.confidence = pConfidence;
			System.out.println("Debug: Pattern created " + this.preRequisite + " " + this.support);
		}

		public void addPropertyChangeListener(String propertyName,
				PropertyChangeListener listener) {
			propertyChangeSupport.addPropertyChangeListener(propertyName, listener);
		}

		public void removePropertyChangeListener(PropertyChangeListener listener) {
			propertyChangeSupport.removePropertyChangeListener(listener);
		}

		public Integer getPatternID() {
			return patternID;
		}

		public void setPatternID(Integer patternID) {
			this.patternID = patternID;
		}

		public String getPreRequisite() {
			return preRequisite;
		}

		public String getSupport() {
			return support;
		}
		

		public String getConClusion() {
			return conClusion;
		}

		public boolean isApproved() {
			return approved;
		}

		public void setPreRequisite(String preRequisite) {
			propertyChangeSupport.firePropertyChange("preRequisite", this.preRequisite,
					this.preRequisite = preRequisite);
		}

		public void setSupport(String pSupport) {
			propertyChangeSupport.firePropertyChange("support", this.support,
					this.support = pSupport);
		}

		public void setConClusion(String pConClusion) {
			propertyChangeSupport.firePropertyChange("conClusion", this.conClusion,
					this.conClusion = pConClusion);
		}

		public void setApproved(boolean pApproved) {			
			propertyChangeSupport.firePropertyChange("approved", this.approved,
					this.approved = pApproved);
		}

		public Integer getConfidence() {
			return confidence;
		}

		public void setConfidence(Integer pConfidence) {
			propertyChangeSupport.firePropertyChange("confidence", this.confidence,
					this.confidence = pConfidence);
		}

		@Override
		public String toString() {
			return preRequisite + " " + conClusion;
		}
	}
