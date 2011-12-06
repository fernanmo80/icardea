
package tr.com.srdc.icardea.model.htmlEditor{

	import tr.com.srdc.icardea.model.htmlEditor.HTML;
	
	[Bindable]
	[XmlClass(alias="Display")]
	public class Display{
		public function Display(){
			
		}

		[XmlElement(alias="HTML")]
		public var html:HTML = new HTML;
		}
}

