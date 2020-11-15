package enums;

import org.openqa.selenium.By;

public enum Company {
	 AMEX("American express", By.cssSelector("[id='form-tarjeta-select'] > option:nth-child(2)")),
	 CABAL("Cabal", By.cssSelector("[id='form-tarjeta-select'] > option:nth-child(3)")),
	 ELEBAR("Elebar", By.cssSelector("[id='form-tarjeta-select'] > option:nth-child(4)")),
	 MASTER("Master", By.cssSelector("[id='form-tarjeta-select'] > option:nth-child(5)")),
	 NARANJA("Naranja",By.cssSelector("[id='form-tarjeta-select'] > option:nth-child(6)")),
	 VISA("Visa", By.cssSelector("[id='form-tarjeta-select'] > option:nth-child(7)"));
	 
	  private final String value;
	  private final By dataState;

	  Company(String value, By dataState) {
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
