package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.WebDriverManager;
import helpers.Helper;

public class HomeSecurePage extends WebDriverManager{
	private WebDriver driver;
	
	//Selectors
	protected static By postalCodeHomeSecureBy = By.id("CP");
	protected static By locationHomeSecureBy = By.id("localidad");
	protected static By menuOfLocationHomeSecureBy = By.cssSelector("[id='localidad'] > option:nth-child(10)");
	protected static By typeOfHomeBy = By.cssSelector("span:nth-child(3) > label");
	protected static By nameHomeSecureFieldBy = By.id("nombre");
	protected static By lastNameHomeSecureFieldBy = By.id("apellido");
	protected static By emailHomeSecureFieldBy = By.id("email");
	protected static By telephonePrefixHomeSecureFielBy = By.id("prefijo");
	protected static By telephoneHomeSecureFielBy = By.id("telefono");
	protected static By quoteButtonHomeSecureBy = By.id("contratar-hogar");
	
	//Constants
	protected static int TIME_OUT = 5;
		
	public HomeSecurePage (WebDriver driver) {
		this.driver = driver;
	}	
	
	/**
	 * Ingresa codigo postal.
	 */
	public void enterpostalCodeHomeSecure(String postalCodeHomeSecure) {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		WebElement codigoPostal = wait.until(ExpectedConditions.presenceOfElementLocated(postalCodeHomeSecureBy));
		codigoPostal.sendKeys(postalCodeHomeSecure);
	}
	
	/**
	 * Selecciona localidad.
	 */
	public void selectLocationHomeSecure() {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
        WebElement localidad = wait.until(ExpectedConditions.elementToBeClickable(locationHomeSecureBy));
        localidad.click();
        WebElement options = wait.until(ExpectedConditions.elementToBeClickable(menuOfLocationHomeSecureBy));
        options.click();
	}
	
	/**
	 * Selecciona tipo de vivienda.
	 */
	public void selectTypeOfHomeBy() {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		WebElement typeOfHome = wait.until(ExpectedConditions.elementToBeClickable(typeOfHomeBy));
		typeOfHome.click();
	}
	
	/**
	 * Ingresa nombre.
	 */
	public void enterNameHomeSecure(String nameHomeSecure) {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		WebElement name = wait.until(ExpectedConditions.presenceOfElementLocated(nameHomeSecureFieldBy));
		name.sendKeys(nameHomeSecure);
	}	
	
	/**
	 * Ingresa apellido.
	 */
	public void enterLastNameHomeSecure(String lastNameHomeSecure) {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		WebElement lastName = wait.until(ExpectedConditions.presenceOfElementLocated(lastNameHomeSecureFieldBy));
		lastName.sendKeys(lastNameHomeSecure);
	}
	
	/**
	 * Ingresa E-mail.
	 */
	public void enterEmailHomeSecure(String emailHomeSecure) {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		WebElement email = wait.until(ExpectedConditions.presenceOfElementLocated(emailHomeSecureFieldBy));
		email.sendKeys(emailHomeSecure);
	}
	
	/**
	 * Ingresa codigo de area.
	 */
	public void enterTelephonePrefixHomeSecure(String telephonePrefixHomeSecure) {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		WebElement telephonePrefix = wait.until(ExpectedConditions.presenceOfElementLocated(telephonePrefixHomeSecureFielBy));
		telephonePrefix.sendKeys(telephonePrefixHomeSecure);
	}
	
	/**
	 * Ingresa numero de telefono.
	 */
	public void enterTelephoneHomeSecureFiel(String telephoneHomeSecure) {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		WebElement telephone = wait.until(ExpectedConditions.presenceOfElementLocated(telephoneHomeSecureFielBy));
		telephone.sendKeys(telephoneHomeSecure);
	}
	
	/**
	 * Clickea boton cotizar.
	 */
	public void QuoteButtonHomeSecure() {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		WebElement quoteButton = wait.until(ExpectedConditions.elementToBeClickable(quoteButtonHomeSecureBy));
		quoteButton.click();
		Helper helper=new Helper();
        helper.sleepSeconds(TIME_OUT);
	}
}
