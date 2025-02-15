package com.wipro.java.designpattern.factories;

import com.wipro.java.designpattern.button.Button;
import com.wipro.java.designpattern.checkboxes.Checkbox;

public interface GUIFactory {
	Button createButton();

	Checkbox createCheckbox();
}