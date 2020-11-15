package enums;

import org.openqa.selenium.By;

public enum Seguros {
	 HOGAR("Hogar", By.id("menu-item-4677")),
	 ROBO("Robo", By.id("menu-item-3933"));
	 
	  private final String value;
	  private final By dataState;
	  
	  Seguros(String value, By dataState) {
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