package tr.com.srdc.icardea.gui.monitoringTool
{
	import mx.controls.Button;
	import mx.controls.Label;
	import mx.controls.RadioButton;
	import mx.controls.TextInput;
	
	public class ComponentGenerator
	{
		public function ComponentGenerator()
		{
		}
		
		public function generateButton(name:String, x_coor:int, y_coor:int, width:int, height:int):Button
		{
			var button:Button = new Button();
			button.setStyle("fontSize",14);
			button.label = name;
			button.x = x_coor;
			button.y = y_coor;
			button.width = width;
			button.height = height;
			return button;
		}

		public function generateTextInput(name:String, x_coor:int, y_coor:int, width:int, height:int):TextInput
		{
			var textInput:TextInput = new TextInput();
			textInput.setStyle("fontSize",14);
			textInput.width = width;
			textInput.height = height;
			textInput.x = x_coor;
			textInput.y = y_coor;
			textInput.text = name;
			return textInput;
		}

		public function generateRadioButton(name:String, x_coor:int, y_coor:int, width:int, height:int):RadioButton
		{
			var radioButton:RadioButton = new RadioButton();
			radioButton.setStyle("fontSize",14);
			radioButton.label = name;
			radioButton.width = width;
			radioButton.height = height;
			radioButton.x = x_coor;
			radioButton.y = y_coor;
			return radioButton;
		}
		
		public function generateLabel(name:String, x_coor:int, y_coor:int):Label
		{
			var label:Label = new Label();
			label.setStyle("fontSize",14);
			label.text = name;
			label.x = x_coor;
			label.y = y_coor;
			return label;
		}
		
	}
}