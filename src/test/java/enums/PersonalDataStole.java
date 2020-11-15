package enums;

import org.openqa.selenium.By;

public enum PersonalDataStole {
	PERSONA_FISICA("Persona Fisica", By.cssSelector("[id='persona-select'] > option:nth-child(1) ")),
	PERSONA_JURIDICA("Persona Juridica", By.cssSelector("[id='persona-select'] > option:nth-child(2)"));
		 
	private final String value;
	private final By dataState;
		  
	PersonalDataStole(String value, By dataState) {
		this.value = value;
		this.dataState = dataState;
	}

	public By getSelector() {
		return dataState;
	}

	@Override
	public String toString() {
		return this.value;
	}

}
