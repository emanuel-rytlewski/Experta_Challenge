package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.WebDriverManager;
import enums.Company;
import enums.PersonalDataStole;

public class StolePayPage extends WebDriverManager{
	private WebDriver driver;
	//Selectors	
	protected static By getDniBy = By.id("solicitante-dni");
	protected static By getNameBy = By.id("solicitante-nombre");
	protected static By getAdressBy = By.id("solicitante-domicilio");
	protected static By payMethodBy = By.id("Tarjeta");
	protected static By companyBy = By.id("form-tarjeta-select");
	protected static By cardNumberBy = By.id("tarjeta-input");
	protected static By expirationMonthBy = By.id("vencimiento-mes-input");
	protected static By expirationYearBy = By.id("vencimiento-anio-input");
	protected static By accountHolderBy = By.id("titular-input");
	protected static By payButtonBy = By.cssSelector("[class='col-md-12 text-center']>button");
	
    protected static int TIME_OUT = 5;
	
	public StolePayPage (WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * Obtiene Numero de DNI.
	 */
	public String getDniNumber() {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		WebElement dniNumber = wait.until(ExpectedConditions.presenceOfElementLocated(getDniBy));
	    String dni = dniNumber.getText();
	    return dni;
	}
	
	/**
	 * Obtiene nombre.
	 */
	public String getName() {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		WebElement name = wait.until(ExpectedConditions.presenceOfElementLocated(getNameBy));
	    String nombre = name.getText();
	    return nombre;
	}
	
	/**
	 * Obtiene direccion.
	 */
	public String getAdress() {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		WebElement adress = wait.until(ExpectedConditions.presenceOfElementLocated(getAdressBy));
	    String direccion = adress.getText();
	    return direccion;
	}
	
	/**
	 * Selecciona tarjeta como metodo de pago.
	 */
	public void clickPayMethod() {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
        WebElement payMethod = wait.until(ExpectedConditions.elementToBeClickable(payMethodBy));
        payMethod.click();
	}
	
	/**
	 * Selecciona empresa.
	 */
	public void selectCompanyBy(Company company) {
		 WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		 WebElement clickcompany = wait.until(ExpectedConditions.elementToBeClickable(companyBy));
		 clickcompany.click();
		 wait.until(ExpectedConditions.presenceOfElementLocated(company.getSelector()));
		 driver.findElement(company.getSelector()).click();	
	}
	
	/**
	 * Ingresa numero de tarjeta.
	 */
	public void entercardNumber(String cardNumber) {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
        WebElement number = wait.until(ExpectedConditions.presenceOfElementLocated(cardNumberBy));
        number.sendKeys(cardNumber);
	}
	
	/**
	 * Ingresa mes de vencimiento de tarjeta.
	 */
	public void enterExpirationMonth(String expirationMonth) {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
        WebElement month = wait.until(ExpectedConditions.presenceOfElementLocated(expirationMonthBy));
        month.sendKeys(expirationMonth);
	}
	
	/**
	 * Ingresa año de vencimiento de tarjeta.
	 */
	public void enterExpirationYear(String expirationYear) {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
        WebElement year = wait.until(ExpectedConditions.presenceOfElementLocated(expirationYearBy));
        year.sendKeys(expirationYear);
	}
	
	/**
	 * Ingresa titular de tarjeta.
	 */
	public void enterAccountHolder(String accountHolder) {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
        WebElement holder = wait.until(ExpectedConditions.presenceOfElementLocated(accountHolderBy));
        holder.sendKeys(accountHolder);
	}
	
	/**
	 * Click en boton de pago.
	 */
	public void clickPayButtonBy() {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
        WebElement payButton = wait.until(ExpectedConditions.elementToBeClickable(payButtonBy));
        payButton.click();
	}
}
