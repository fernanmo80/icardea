package tr.com.srdc.icardea.util
{
	import flash.utils.ByteArray;

	public interface ArchiveUtil
	{
		
		/**
		 * Creates a DiagramContent object which includes archived data from a careplan and a diagram file.
		 * @param name name of the archive file
		 * @param careplanContent XML document containing XML serialization of a careplan 
		 * @param diagramContent XML document containing XML serialization of a diagram
		 * @return DiagramContent object with archived careplan and diagram
		 * 
		 */		 
		function createArchive(name:String, careplanContent:String, diagramContent:XML):DiagramContent;
		/**
		 * Reads a previously saved archive. 
		 * @param content content of archive as ByteArray
		 * @return extracted archive as DiagramContent
		 * 
		 */		
		function readArchive(content:ByteArray):DiagramContent;
		
	}
}