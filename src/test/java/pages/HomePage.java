package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.WebDriverManager;
import enums.Seguros;
import helpers.Helper;


public class HomePage extends WebDriverManager {
	private WebDriver driver;

	//Selectors
	protected static By secureButton = By.cssSelector("[id='desktopMenu']>div:nth-of-type(1)");

	public HomePage (WebDriver driver) {
		this.driver = driver;
	}	
	
	/**
	 * Despliega menu seguros.
	 */
	private void secure() {  
	 Actions action = new Actions(driver); 
	 WebElement elem = driver.findElement(secureButton); 
	 action.moveToElement(elem); 
	 action.perform(); 
	 Helper sleep = new Helper();
	 sleep.sleepSeconds(2); 
	} 
	
	/**
	 * Selecciona opcion de menu seguros.
	 */
	public void selectSecure(Seguros seguros) {
		 secure();
		 WebDriverWait wait = new WebDriverWait(driver,30);
	        wait.until(ExpectedConditions.presenceOfElementLocated(seguros.getSelector()));
		driver.findElement(seguros.getSelector()).click();	
	}
}
