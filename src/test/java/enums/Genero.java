package enums;

import org.openqa.selenium.By;

public enum Genero {
	 MASCULINO("Masculino", By.id("option-genero-masculino")),
	 FEMENINO("Femenino", By.id("option-genero-feminino"));
	 
	  private final String value;
	  private final By dataState;

	  Genero(String value, By dataState) {
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
