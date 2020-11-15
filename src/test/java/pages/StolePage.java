package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.WebDriverManager;

public class StolePage extends WebDriverManager{
	private WebDriver driver;
	
	//Selectors
	protected static By checkBagBy = By.id("robo-1");
	protected static By checkBikeBy = By.id("robo-2");	
	protected static By checkPetBy = By.id("robo-3");
	protected static By sinceFieldBy = By.id("fecha-inicio-hogar");
	protected static By nameFieldBy = By.id("robo-nombre");
	protected static By surnameFieldBy = By.id("robo-apellido");
	protected static By mailFieldBy = By.id("robo-email");
	protected static By telephoneFieldBy = By.id("robo-telefono");
	protected static By telephonePrefixFieldBy = By.id("robo-prefijo");
	protected static By quoteButtonBy = By.id("paso1-btn-contratar");
	protected static By selectButtonBy = By.name("20");
	
	//Constants
	protected static int TIME_OUT = 5;
	
	public StolePage (WebDriver driver) {
		this.driver = driver;
	}	
	
	/**
	 * Tildar Bolso.
	 */
	public void checkBag() {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
        WebElement checkBoxBag = wait.until(ExpectedConditions.elementToBeClickable(checkBagBy));
        checkBoxBag.click();	
	}
	
	/**
	 * Destildar Bolso.
	 */
	public void unCheckBag() {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		WebElement unCheckBoxBag = wait.until(ExpectedConditions.elementToBeClickable(checkBagBy));
		unCheckBoxBag.click();	
	}
	
	/**
	 * Tildar Bicicleta.
	 */
	public void checkBike() {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		WebElement checkBoxBike = wait.until(ExpectedConditions.elementToBeClickable(checkBikeBy));
		checkBoxBike.click();	
	}
	
	/**
	 * Destildar Bicicleta.
	 */
	public void uncheckBike() {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		WebElement unCheckBoxBike = wait.until(ExpectedConditions.elementToBeClickable(checkBikeBy));
		unCheckBoxBike.click();	
	}
	
	/**
	 * Tildar Mascota.
	 */
	public void checkPet() {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		WebElement checkBoxPet = wait.until(ExpectedConditions.elementToBeClickable(checkPetBy));
		checkBoxPet.click();	
	}
	
	/**
	 * Destildar Mascota.
	 */
	public void uncheckPet() {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		WebElement unCheckBoxPet = wait.until(ExpectedConditions.elementToBeClickable(checkPetBy));
		unCheckBoxPet.click();	
	}
	
	/**
	 * Ingresa Fecha.
	 */
	public void enterSince(String date) {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		WebElement since = wait.until(ExpectedConditions.presenceOfElementLocated(sinceFieldBy));
		since.sendKeys(date);
	}
	
	/**
	 * Ingresa nombre.
	 */
	public void enterName(String name) {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		WebElement nombre = wait.until(ExpectedConditions.presenceOfElementLocated(nameFieldBy));
        nombre.sendKeys(name);	
	}
	
	/**
	 * Ingresa apellido.
	 */
	public void enterSurname(String lastName) {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		WebElement surname = wait.until(ExpectedConditions.presenceOfElementLocated(surnameFieldBy));
        surname.sendKeys(lastName);	
	}
	
	/**
	 * Ingresa E-mail.
	 */
	public void enterEmail(String mail) {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		WebElement email = wait.until(ExpectedConditions.presenceOfElementLocated(mailFieldBy));
        email.sendKeys(mail);
		
	}
	
	/**
	 * Ingresa numero de telefono.
	 */
	public void enterTelephoneNumber(String number) {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		WebElement telephone= wait.until(ExpectedConditions.presenceOfElementLocated(telephoneFieldBy));
        telephone.sendKeys(number);
		
	}
	
	/**
	 * Ingresa codigo de area.
	 */
	public void enterTelephonePrefix(String preFix) {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		WebElement phonePreFix = wait.until(ExpectedConditions.presenceOfElementLocated(telephonePrefixFieldBy));
        phonePreFix.sendKeys(preFix);	
	}
	
	/**
	 * Clickea boton cotizar.
	 */
	public void quote() {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		WebElement cotiza = wait.until(ExpectedConditions.elementToBeClickable(quoteButtonBy));
        cotiza.click();
        wait.until(ExpectedConditions.elementToBeClickable(selectButtonBy));
	}
	
	/**
	 * Clickea boton de opcion recomendada.
	 */
	public void selectRecomended() {
        driver.findElement(selectButtonBy).click();	    
	}	
}
