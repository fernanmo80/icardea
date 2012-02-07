package de.offis.health.icardea.ppm;

	import java.util.ArrayList;
	import java.util.List;

	public enum ModelProvider {
		
		INSTANCE;

		private List<Person> persons;
		private List<Pattern> patterns;
		

		private ModelProvider() {
			persons = new ArrayList<Person>();
			// Image here some fancy database access to read the persons and to
			// put them into the model
			persons.add(new Person("Rainer", "Zufall", "male", true));
			persons.add(new Person("Reiner", "Babbel", "male", true));
			persons.add(new Person("Marie", "Dortmund", "female", false));
			persons.add(new Person("Holger", "Adams", "male", true));
			persons.add(new Person("Juliane", "Adams", "female", true));
			
			patterns = new ArrayList<Pattern>();
			//patterns.add(new Pattern(PreRequisite, Conclusion, Support, Approved, Confidence));
			patterns.add(new Pattern(1,"ICD10= E78 and ICD10= I10", "ICD10 = I25", "26 of 31", true, 84));
			patterns.add(new Pattern(2,"ICD10= I10 and ICD10= I47", "ICD10= I25", "28 of 34", true, 82));
			patterns.add(new Pattern(3,"ICD10= E11", "ICD10= I10", "20 if 25", true, 80));
			patterns.add(new Pattern(4,"ICD10= E78", "ICD10= I25", "34  of 44", true, 77));
			patterns.add(new Pattern(5,"ICD10= I10 and ICD10= I50", "ICD10= II25", "23 of 30", true, 77));
			patterns.add(new Pattern(6,"ICD10= E78 and ICD10= I25", "ICD10= I10", "26 of 34", true, 76));
			patterns.add(new Pattern(7,"ICD10= E78", "ICD10= I10", "31 of 44", true, 70));
			patterns.add(new Pattern(8,"ICD10= I10 ", "ICD10= I25", "45 of 64", true, 70));
			patterns.add(new Pattern(9,"ICD10= I25 and ICD10= I50", "ICD10= I10", " 23 of 35", true, 66));
			patterns.add(new Pattern(10,"ICD10= I10 and ICD10= I25", "ICD10= I47", " 28 of 45", true, 62));
			patterns.add(new Pattern(16,"AGE= 62.500 - 67.500", "ICD10= I10", "21 of 38", false, 55));
		}

		public List<Person> getPersons() {
			return persons;
		}
		public List<Pattern> getPatterns() {
			return patterns;
		}

	}

