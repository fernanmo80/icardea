package tr.com.srdc.icardea.patient
{
	import flash.events.EventDispatcher;
	
	import mx.collections.ArrayCollection;
	
	public class PatientModelImp extends EventDispatcher implements PatientModel
	{
		private var _patients:ArrayCollection = new ArrayCollection();
		
		public function PatientModelImp()
		{
			
		}
		
		public function set patients(patients:ArrayCollection):void{
			if(patients != null){
				_patients.removeAll();
				_patients.addAll(patients);
			}
		}
		
		public function get patients():ArrayCollection{
			return _patients;
		}

	}
}
