
package icardea.model {

	import mx.controls.Alert;

	[Bindable]
	public class ProfileLanguage {

		private static var instance:ProfileLanguage;
		
		public var Doctors:String = "";
		public var Nurses:String = "";
		public var Psychiatrist:String = "";
		public var Pharmacist:String = "";
		public var Dentist:String = "";
		public var FamilyMember:String = "";
		public var Alergies:String = "";
		public var Conditions:String = "";
		public var Procedures:String = "";
		public var Medications:String = "";
		public var TestResults:String = "";
		public var Immunizations:String = "";
		public var HospitalVistis:String = "";
		public var BasicHealthInformation:String = "";
		
		public var Username__:String = "";
		public var Password__:String = "";

		public function ProfileLanguage() {
			if(instance != null){
				Alert.show('can not construct model twice!', 'Error');
			}
		}

		public static function getInstance():ProfileLanguage {
			if(instance == null){
				instance = new ProfileLanguage();
			}
			return instance;
		}
	}
}

