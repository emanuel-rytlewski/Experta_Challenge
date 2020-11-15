package enums;

import org.openqa.selenium.By;

public enum TaxStatus {
	 MONOTRIBUTISTA("Monotributista", By.id("option-monotributista")),
	 CONSUMIDOR_FINAL("Consumidor final", By.id("option-consumidor-final")),
	 EXENTO("Exento", By.id("option-exento")),
	 RESPONSABLE_INSCRIPTO("Responsable inscripto", By.cssSelector("[id='condicion-select'] > option:nth-child(4)"));
	 
	  private final String value;
	  private final By dataState;
	  
	  TaxStatus(String value, By dataState) {
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
