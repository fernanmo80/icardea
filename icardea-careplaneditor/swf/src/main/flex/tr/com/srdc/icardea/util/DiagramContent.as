package tr.com.srdc.icardea.util
{
	import deng.fzip.FZip;
	
	import flash.utils.ByteArray;

	
	
	public class DiagramContent
	{
		public function DiagramContent()
		{
		}
		
		/**
		 * XML object that represents medical careplan document 
		 */		
		public var careplan:String;
		/**
		 * XML object that contains diagram info (ie. sprites, links, nodes)
		 */		
		public var diagram:String;
		/**
		 * Zip file that contains zipped xml files
		 */		
		public var archive:FZip;
		/**
		 * Content of the zip file as byte array;  
		 */		
		public var content:ByteArray;
		
		
		
	}
}