package tr.com.srdc.icardea.careplan
{
	import flash.events.EventDispatcher;
	
	import mx.collections.ArrayCollection;
	
	public class CareplanModelImp extends EventDispatcher implements CareplanModel
	{
		private var _careplans:ArrayCollection = new ArrayCollection();
		
		public function CareplanModelImp()
		{
			
		}
		
		public function set careplans(careplans:ArrayCollection):void{
			if(careplans != null){
				_careplans.removeAll();
				_careplans.addAll(careplans);
			}
		}
		
		public function get careplans():ArrayCollection{
			return _careplans;
		}

	}
}