package fr.kapit.demo.data
{
    import com.kapit.diagram.IDiagramElement;
    import com.kapit.diagram.model.ILinkProxy;
    import com.kapit.diagram.view.DiagramLink;
    import com.kapit.diagram.view.DiagramSprite;
    import com.kapit.diagram.view.DiagramView;
    
    import flash.utils.Dictionary;
    
    import mx.collections.ArrayCollection;
    import mx.core.Application;
    import mx.utils.UIDUtil;
    
    import tr.com.srdc.icardea.model.steps.NextStep;

	public class MyLinkProxy implements ILinkProxy
	{
		public static var _links:ArrayCollection = null;

		protected var _view:DiagramView;

		public function MyLinkProxy(view:DiagramView)
		{
			_view = view;
		}

		public function createDataObject(el:IDiagramElement):String
		{
			var type:String = el.getTagName();
			var sourceid:String = DiagramLink(el).sourceobject.dataobjectid;
			var dict:Dictionary=Application.application.careplanDT.object_dic;
			var flag:Boolean=false;
		
			var targetid:String = DiagramLink(el).targetobject.dataobjectid;
			var uid:String = UIDUtil.createUID();
			var obj:MyLink = new MyLink();
			trace("source: "+sourceid)
			trace("target: "+targetid)
			
					
			obj.start = sourceid;
			obj.end = targetid;
			obj.uid = uid;
			obj.name = "";
			var index:int = getElementIndex(el);
			
		
			
			var nstep:NextStep = new NextStep;
		
			if (_links)
			{
				if(dict[sourceid].ownName=="decisionStep" || dict[sourceid].ownName=="consultStep" || dict[sourceid].ownName=="recommendationStep")
				{
					nstep.ref=dict[targetid].id;
        			dict[sourceid].nextStep.addItem(nstep);
	        	}
	        	if(dict[sourceid].ownName=="startStep" || dict[sourceid].ownName=="finalStep"  || dict[sourceid].ownName=="waitStep" || dict[sourceid].ownName=="recordActionStep")
	        	{
	        		dict[sourceid].nextStep.ref = dict[targetid].id;
	        	}
	        	/* if(dict[sourceid].ownName=="finalStep")
				{
					var htpop:Alert=new Alert;
        			htpop.text="You can not continue from Final Step!";
        			
        			PopUpManager.addPopUp(htpop,Application.application.careplanDT as DisplayObject);
		           	PopUpManager.centerPopUp(htpop);
		           ///delete the created link !!!
		           flag=true;
        			
	        	} */
	        	
	        	//no default for eligibility criteria !!!!
			}
			_links.addItem(obj);
		
			
			return uid;
		}

		public function scopeChanged(link:DiagramLink, oldscope:String):void
		{
		}

		public function removeDataObject(el:IDiagramElement):void
		{
			var type:String = el.getTagName();
			if(DiagramLink(el).sourceobject)
			{
			var sourceid:String = DiagramLink(el).sourceobject.dataobjectid;
			var dict:Dictionary=Application.application.careplanDT.object_dic;
			
			//var targetid:String = DiagramLink(el).target.dataobjectid;
			var uid:String = UIDUtil.createUID();
			var index:int = getElementIndex(el);
	        var obj:MyLink = null;
	        
	        
	        if (index != -1)
	        {
	            obj = _links.getItemAt(index) as MyLink;
	        }
			
			var nstep:NextStep = new NextStep;
			
			if (el.dataobjectid && _links)
			{
				for(var i:int=0; i < _links.length; i++)
					if (_links.getItemAt(i).uid == el.dataobjectid)
					{
						
						
						if(dict[sourceid].ownName=="consultStep" ||  dict[sourceid].ownName=="decisionStep" || dict[sourceid].ownName=="recommendationStep")
						{
							
							for(var j:int=0;j<dict[sourceid].nextStep.length;j++ )
		                	{
		                		if(obj.end == dict[sourceid].nextStep.getItemAt(j).ref)
		                			dict[sourceid].nextStep.removeItemAt(j);
		                	}
							
		        		}
		        		if(dict[sourceid].ownName=="startStep" || dict[sourceid].ownName=="finalStep"  || dict[sourceid].ownName=="waitStep" || dict[sourceid].ownName=="recordActionStep")
		        		{
		        			dict[sourceid].nextStep.ref = null;
		        		}
						_links.removeItemAt(i);
						break;
					}
			}
			}
		}

		protected function getElementIndex(el:IDiagramElement):int
	    {
	        if (el.dataobjectid && _links)
	        {
	            for (var i:int = 0; i < _links.length; i++)
	            {
	                var obj:MyLink = _links.getItemAt(i) as MyLink;
	                if (obj.uid == el.dataobjectid)
	                {
	                    return i;
	                }
	            }
	        }
	        return -1;
	    } 
	    
	
	    
		public function propertyModified(el:IDiagramElement, propname:String, propvalue:Object, shapeid:String):void
		{
			var dict:Dictionary=Application.application.careplanDT.object_dic;
	    	var uid:String = UIDUtil.createUID();
	        var index:int = getElementIndex(el);
	 
	        var sourceid:String = DiagramLink(el).sourceobject.dataobjectid;
	        var targetid:String = DiagramLink(el).targetobject.dataobjectid;
			
	        var obj:MyLink = null;
	        if (index != -1)
	        {
	            obj = _links.getItemAt(index) as MyLink;
	        }
	        var s:DiagramSprite = null;
	        if (el is DiagramSprite)
	            s = el as DiagramSprite;
	
			
	        
	        if ("text" == propname)
	        {
	            if (obj)
	            {
	            	
	                obj.name = String(propvalue);
	                
	                if(dict[sourceid].ownName=="consultStep"  || dict[sourceid].ownName=="decisionStep" || dict[sourceid].ownName=="recommendationStep")
	                {
	                	
	                	
	                	for(var i:int=0;i<dict[sourceid].nextStep.length;i++ )
	                	{
	                		trace("uid: "+obj.uid);
	                		trace("did: "+obj.did);
	                		trace("end: "+obj.end);
	                		trace("start: "+obj.start);
	                		trace("name: "+obj.name)
	                	    trace(dict[sourceid].nextStep.getItemAt(i).ref);
	                		if(obj.end == dict[sourceid].nextStep.getItemAt(i).ref)
	                			dict[sourceid].nextStep.getItemAt(i).name=obj.name;
	                			dict[sourceid].nextStep.getItemAt(i).evaluationScript = "function check("+dict[sourceid].id+"Choice) { if("+dict[sourceid].id+"Choice.getValue().getText() == \""+dict[sourceid].nextStep.getItemAt(i).name+"\") return true; else return false; }";
	                	}
	                	
	                }
	               
	                	                	
	                if(dict[sourceid].ownName=="startStep" || dict[sourceid].ownName=="waitStep"  || dict[sourceid].ownName=="recordActionStep" )
	                {
	                	dict[sourceid].nextStep.name=obj.name;
	                }
	               
	                	
	            }
        	}
		}

		public function dataObjectPropertyModified(uid:String, propname:String, propvalue:Object):void
		{
		}

		public function dataObjectRemoved(uid:String):void
		{
		}

		public function dataObjectLoaded(el:IDiagramElement):void
		{
			var type:String = el.getTagName();
	        var sprite:DiagramSprite = el as DiagramSprite;
	        //var spriteid:String = sprite.spriteid;
	       // var name:String = el.did;
	       
	     
	        var uid:String = el.dataobjectid;
	        var obj:MyLink = new MyLink();
	        
	        var sourceid:String = DiagramLink(el).sourceobject.dataobjectid;
   			var targetid:String = DiagramLink(el).targetobject.dataobjectid;
			var name:String ="ee";
			
				
			obj.start = sourceid;
			obj.end = targetid;
			obj.uid = uid;
			
			
	        
	        var dict:Dictionary=Application.application.careplanDT.object_dic;
	        var index:int = getElementIndex(el);
	        
	      	
	       // obj.spriteid = spriteid;
	        obj.did = el.did;
	    	//obj.name = name;
	       
	       // obj.name = sprite.annotation ? sprite.annotation.text : "";
	        if (_links)
	            _links.addItem(obj); 
			
		}

		public function acceptPropertyModification(el:IDiagramElement, propname:String, propvalue:Object, shapeid:String):Boolean
		{
			return true;
		}

		public function acceptRemoveObject(el:IDiagramElement):Boolean
		{
			return true;
		}

	}

}