package tr.com.srdc.icardea.util
{
	import deng.fzip.FZip;
	
	import flash.utils.ByteArray;
	
	public class Archiver implements ArchiveUtil
	{
		private static var CAREPLAN_FILENAME:String = "careplan";
		private static var DIAGRAM_FILENAME:String = "diagram";
		
		public function Archiver()
		{
		}
		
		public function createArchive(name:String, careplanContent:String, diagram:XML):DiagramContent
		{
			// Define local vars, one for zip archive, one for byte content and one for DiagramContent
			var zip:FZip = new FZip();
			var diagramContent:DiagramContent = new DiagramContent();
			var diagramSerialization:String = diagram.toXMLString();
			//add string contents to archive
			zip.addFileFromString(CAREPLAN_FILENAME, careplanContent);			
			zip.addFileFromString(DIAGRAM_FILENAME, diagramSerialization);
			//close arhive
			zip.close();
			
			//assign diagram content vars
			diagramContent.archive = zip;
			diagramContent.careplan = careplanContent;
			diagramContent.diagram = diagramSerialization;
			//set zip content
			diagramContent.content = new ByteArray();
			zip.serialize(diagramContent.content, false);
			
			return diagramContent;
			
		}
		
		
		
		public function readArchive(content:ByteArray):DiagramContent
		{
			var zip:FZip = new FZip();
			var diagramContent:DiagramContent = new DiagramContent();
			//set zip content
			diagramContent.content = content;
			//load zip file
			zip.loadBytes(content);
		
			//read careplan and diagram files
			var careplan:String = zip.getFileByName(CAREPLAN_FILENAME).content.readUTFBytes(zip.getFileByName(CAREPLAN_FILENAME).content.bytesAvailable);
			var diagram:String = zip.getFileByName(DIAGRAM_FILENAME).content.readUTFBytes(zip.getFileByName(DIAGRAM_FILENAME).content.bytesAvailable);
			//trace(careplan);
			//trace(diagram);
			
			
			diagramContent.archive = zip;
			diagramContent.careplan = careplan;
			diagramContent.diagram = diagram;
			return diagramContent;
		}
	}
}