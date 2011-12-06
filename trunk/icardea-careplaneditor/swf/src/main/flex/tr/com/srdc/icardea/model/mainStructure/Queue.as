package tr.com.srdc.icardea.model.mainStructure{
	public class Queue {
		
		private var first:Node;
		private var last:Node;
		public function isEmpty():Boolean{
			return (first == null);
		}
		public function push(data:Object):void{
			var node:Node = new Node();
			node.data = data;
			node.next = null;
			if (isEmpty()) {
				first = node;
				last = node;
			} else {
				last.next = node;
				last = node;
			}
		}
		public function pop():Object{
			if (isEmpty()) {
				return null; //if stack has no data inside that, you can handle it here
			}
			var data = first.data;
			first = first.next;
			return data;
		}
	}
}
	