/*
* ////////////////////////////////////////////////////////////////////////////////
* //
* //  Kap IT  -  Copyright 2009 Kap IT  -  All Rights Reserved.  
* //   
* //  TERMS OF USE  
* //  Developers who wish to access source code must agree to the License that accompanies the code
* //  (see file “License.txt” contained in the archive, or http://lab.kapit.fr/display/Store/Licenses)
* //  If you use the source code, you accept to be bound by the License.  If you do not accept the License, do not use the source code.  
* //  Licensees may use the source code to assist with the development of related software. Licensees may not modify or redistribute the source code.  
* //
* ////////////////////////////////////////////////////////////////////////////////
*/
package fr.kapit.demo.data
{
import com.kapit.diagram.IDiagramElement;
import com.kapit.diagram.layers.DiagramColumn;
import com.kapit.diagram.layers.DiagramLane;
import com.kapit.diagram.model.ISpriteProxy;
import com.kapit.diagram.view.DiagramSprite;
import com.kapit.diagram.view.DiagramView;

import flash.utils.Dictionary;

import mx.collections.ArrayCollection;
import mx.core.Application;
import mx.utils.UIDUtil;

import tr.com.srdc.icardea.model.steps.ConsultStep;
import tr.com.srdc.icardea.model.steps.DecisionStep;
import tr.com.srdc.icardea.model.steps.EligibilityCriteria;
import tr.com.srdc.icardea.model.steps.FinalStep;
import tr.com.srdc.icardea.model.steps.RecommendationStep;
import tr.com.srdc.icardea.model.steps.StartStep;
import tr.com.srdc.icardea.model.steps.WaitStep;
import tr.com.srdc.icardea.model.steps.recordAction.RecordActionStep;

public class MyObjectProxy implements ISpriteProxy
{
    /**
     * List of object in the diagram 
     */
    public static var _objects:ArrayCollection = null;

    /**
     * The diagramview linked 
     */
    protected var _view:DiagramView;

    /**
     * Create a proxy for a diagram view
     * @param view
     * 
     */
    public function MyObjectProxy(view:DiagramView)
    {
        _view = view;
        
    }
    
    /**
     * Given an diagram object, find it on the object list 
     * @param el Diagram elements
     * @return Object index, or -1 if not found
     * 
     */
    protected function getElementIndex(el:IDiagramElement):int
    {
        if (el.dataobjectid && _objects)
        {
            for (var i:int = 0; i < _objects.length; i++)
            {
                var obj:Object = _objects.getItemAt(i);
                if (obj.uid == el.dataobjectid)
                {
                	trace("index: "+i);
                    return i;
                }
            }
        }
        return -1;
    }    

    /**
     * Given a diagram object, find its sprite id. 
     * @param el Diagram element
     * @return Sprite id of the element, null if its not a sprite
     * 
     */
    protected function getElementSpriteId(el:IDiagramElement):String
    {
        if (el is DiagramSprite)
        {
            var s:DiagramSprite = el as DiagramSprite;
            return s.spriteid;
        }
        return null;
    }
    
    /**
     *  Not used, kept for interface compliance
     */
    public function columnChanged(el:IDiagramElement, column:DiagramColumn):void
    {

    }

    /**
     * When a diagram object is created, a local object is created and stored in the list 
     * @param el New diagram object
     * @return Dataid of the local object (used as key)
     * 
     */
    public function createDataObject(el:IDiagramElement):String
    {
        var type:String = el.getTagName();
        var dict:Dictionary=Application.application.careplanDT.object_dic;
        var spriteid:String = DiagramSprite(el).spriteid;
        var name:String = el.did;
        var uid:String = "S"+UIDUtil.createUID();
        var obj:MyObject = new MyObject();
        obj.type = type;
        obj.spriteid = spriteid;
        trace("spriteid: "+spriteid)
        obj.did = el.did;
        obj.uid = uid;
     
        if (_objects)
        {
        	if(obj.spriteid=="startStep")
        	{
        		dict[obj.uid]=new StartStep();
        		dict[obj.uid].id=obj.uid;
        		dict[obj.uid].name=obj.name;
        	}
        	if(obj.spriteid=="finalStep")
        	{
        		dict[obj.uid]=new FinalStep();
        		dict[obj.uid].id=obj.uid;
        		dict[obj.uid].name=obj.name;
        	}
        	if(obj.spriteid=="recommendationStep")
        	{
        		dict[obj.uid]=new RecommendationStep();
        		dict[obj.uid].id=obj.uid;
        		dict[obj.uid].name=obj.name;
        	}
        	if(obj.spriteid=="waitStep")
        	{
        		dict[obj.uid]=new WaitStep();
        		dict[obj.uid].id=obj.uid;
        		dict[obj.uid].name=obj.name;
        	}
        	if(obj.spriteid=="recordActionStep")
        	{
        		dict[obj.uid]=new RecordActionStep();
        		dict[obj.uid].id=obj.uid;
        		dict[obj.uid].name=obj.name;
        	}
        	if(obj.spriteid=="decisionStep")
        	{
        		dict[obj.uid]=new DecisionStep();
        		dict[obj.uid].id=obj.uid;
        		dict[obj.uid].name=obj.name;
        	}
        	if(obj.spriteid=="consultStep")
        	{
        		trace("name: "+obj.name);
        		dict[obj.uid]=new ConsultStep();
        		dict[obj.uid].id=obj.uid;
        		dict[obj.uid].name=obj.name;
        	}
        	if(obj.spriteid=="eligibilityCriteria")
        	{
        		dict[obj.uid]=new EligibilityCriteria();
           	}
            _objects.addItem(obj);
        }
        return uid;
    }

    /**
     * When a diagram object is delected, the linked local object is remove from the list 
     * @param el Diagram object deleted
     * 
     */
    public function removeDataObject(el:IDiagramElement):void
    {
    	var type:String = el.getTagName();
        var dict:Dictionary=Application.application.careplanDT.object_dic;
        var spriteid:String = DiagramSprite(el).spriteid;
        
        var name:String = el.did;
       // var uid:String = UIDUtil.createUID();
        
        var index:int = getElementIndex(el);
        if (index != -1)
        {
        	delete dict[_objects.getItemAt(index).uid];
            _objects.removeItemAt(index);
         
           
        }
    }

    /**
     * When an annotation is added or changed on an object, the linked object name is set
     */
    public function propertyModified(el:IDiagramElement, propname:String, propvalue:Object, shapeid:String):void
    {
    	var dict:Dictionary=Application.application.careplanDT.object_dic;
    	
	    
    	var uid:String = "S"+UIDUtil.createUID();
        var index:int = getElementIndex(el);
        var spriteid:String = DiagramSprite(el).spriteid;
        var obj:MyObject = null;
        if (index != -1)
        {
            obj = _objects.getItemAt(index) as MyObject;
        }
        var s:DiagramSprite = null;
        if (el is DiagramSprite)
            s = el as DiagramSprite;

        if ("text" == propname)
        {
            if (obj)
            {
                obj.name = String(propvalue);
                if(obj.spriteid=="consultStep" || obj.spriteid=="recommendationStep" || obj.spriteid=="decisionStep" || obj.spriteid=="waitStep" || obj.spriteid=="recordActionStep" || obj.spriteid=="startStep" || obj.spriteid=="finalStep")
                	dict[obj.uid].name=obj.name;
                
            }
        }
    }
    

    /**
     * When a diagram object is loaded from xml, we create the linked object in the list 
     * @param el Loaded object
     */
    public function dataObjectLoaded(el:IDiagramElement):void
    {
        var type:String = el.getTagName();
        var sprite:DiagramSprite = el as DiagramSprite;
        var spriteid:String = sprite.spriteid;
        var name:String = el.did;
        var uid:String = el.dataobjectid;
        var obj:MyObject = new MyObject();
        obj.type = type;
        obj.spriteid = spriteid;
        obj.did = el.did;
        obj.uid = uid;
        trace("obj uid"+uid)
       
        obj.name = sprite.annotation ? sprite.annotation.text : "";
        if (_objects) 
            _objects.addItem(obj);
    }    

    /**
     * Accept all links creation
     */
    public function allowLinkAction(el:IDiagramElement):Boolean
    {
        return true;
    }
        
    /**
     * Accept all links creation
     */
    public function preAcceptLinkSource(spriteid:String, sourcespriteid:String, el:IDiagramElement):Boolean
    {
    	
        return true;
    }
    
    /**
     * Accept all links creation
     */
    public function preAcceptLinkTarget(spriteid:String, targetspriteid:String, el:IDiagramElement):Boolean
    {

        return true;
    }
    
    /**
     *  Not used, kept for interface compliance
     */
    public function dataObjectPropertyModified(uid:String, propname:String, propvalue:Object):void
    {
    }

    /**
     * Accept all links creation
     */
    public function acceptLinkTarget(el:IDiagramElement, target:IDiagramElement):Boolean
    {
    	
         return true;
    }
    
    /**
     *  Not used, kept for interface compliance
     */
    public function dataObjectRemoved(uid:String):void
    {
    }

    /**
     * Accept all links creation
     */
    public function acceptLinkSource(el:IDiagramElement, source:IDiagramElement):Boolean
    {
    	
    	return true;
    }

    /**
     *  Not used, kept for interface compliance
     */
    public function laneChanged(el:IDiagramElement, lane:DiagramLane):void
    {
    }

    /**
     * Accept all property modification 
     */
    public function acceptPropertyModification(el:IDiagramElement, propname:String, propvalue:Object, shapeid:String):Boolean
    {
        return true;
    }

    /**
     * Accept all object removal 
     */
    public function acceptRemoveObject(el:IDiagramElement):Boolean
    {
        return true;
    }

}
}