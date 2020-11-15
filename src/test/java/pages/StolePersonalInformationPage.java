package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.WebDriverManager;
import enums.Genero;
import enums.PersonalDataStole;
import enums.Seguros;
import enums.TaxStatus;
import helpers.Helper;

public class StolePersonalInformationPage extends WebDriverManager{
	private WebDriver driver;
	
	//Selectors
	protected static By typeOfPersonBy = By.id("persona-select");
	protected static By firstNameFieldBy = By.id("nombre-input");
	protected static By lastNameFieldBy = By.id("apellido-input");
	protected static By taxStatusBy = By.id("condicion-select");
	protected static By dniFieldBy = By.id("dni-input");
	protected static By genderBy = By.id("genero-select");
	protected static By emailFieldBy = By.id("email-input");
	protected static By telephoneFieldBy = By.id("telefono-input");
	protected static By postalCodeFieldBy = By.id("cp-input");
	protected static By locationBy = By.id("localidad-select");
	protected static By seletcLocationBy = By.cssSelector("[id=localidad-select] > option");
	protected static By neighborhoodFieldBy = By.id("barrio-input");
	protected static By streetFieldBy = By.id("calle-input");
	protected static By adressNumberFieldBy = By.id("altura-input");
	protected static By floorFieldBy = By.id("piso-input");
	protected static By departmentFieldBy = By.id("departamento-input");
	protected static By continueButtonBy = By.cssSelector("div:nth-child(8) > div > button");
	 
	protected static int TIME_OUT = 5;
	
	public StolePersonalInformationPage (WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * Selecciona tipo de persona.
	 */
	public void selectTypeOfPerson(PersonalDataStole typeOfPerson) {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		WebElement clickTypeOfPerson = wait.until(ExpectedConditions.elementToBeClickable(typeOfPersonBy));
		clickTypeOfPerson.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(typeOfPerson.getSelector()));
		driver.findElement(typeOfPerson.getSelector()).click();	
	}
	
	/**
	 * Ingresa nombre.
	 */
	public void enterFirstName(String firstName) {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
        WebElement name = wait.until(ExpectedConditions.presenceOfElementLocated(firstNameFieldBy));
        name.clear();
        name.sendKeys(firstName);
	}
	
	/**
	 * Ingresa apellido.
	 */
	public void enterLastName(String surname) {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
        WebElement lastName = wait.until(ExpectedConditions.presenceOfElementLocated(lastNameFieldBy));
        lastName.clear();
        lastName.sendKeys(surname);
	}
	
	/**
	 * Selecciona condicion impositiva.
	 */
	public void selectTaxStatus(TaxStatus taxStatus) {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		WebElement condicionImpositiva = wait.until(ExpectedConditions.elementToBeClickable(taxStatusBy));
		condicionImpositiva.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(taxStatus.getSelector()));
		driver.findElement(taxStatus.getSelector()).click();
	}
	
	/**
	 * Ingresa DNI.
	 */
	public void enterDni(String dni) {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
        WebElement documento = wait.until(ExpectedConditions.presenceOfElementLocated(dniFieldBy));
        documento.sendKeys(dni);
	}
	
	/**
	 * Selecciona genero.
	 */
	public void selectGenero(Genero genero) {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		WebElement gender = wait.until(ExpectedConditions.elementToBeClickable(genderBy));
		gender.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(genero.getSelector()));
	    driver.findElement(genero.getSelector()).click();
	}
	
	/**
	 * Ingresa E-mail.
	 */
	public void enterEmail(String mail) {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
        WebElement email = wait.until(ExpectedConditions.presenceOfElementLocated(emailFieldBy));
        email.clear();
        email.sendKeys(mail);
	}
	
	/**
	 * Ingresa Telefono.
	 */
	public void enterTelephone(String phone) {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
        WebElement telephone = wait.until(ExpectedConditions.presenceOfElementLocated(telephoneFieldBy));
        telephone.clear();
        telephone.sendKeys(phone);
	}
	
	/**
	 * Ingresa codigo postal.
	 */
	public void enterPostalCode(String postalCode) {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
        WebElement codigoPostal = wait.until(ExpectedConditions.presenceOfElementLocated(postalCodeFieldBy));
        codigoPostal.sendKeys(postalCode);
	}
	
	/**
	 * Selecciona localizacion.
	 */
	public void selectLocation(int index) {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
        WebElement localidad = wait.until(ExpectedConditions.elementToBeClickable(locationBy));
        localidad.click();
        List<WebElement> options = driver.findElements(seletcLocationBy);
        options.get(index).click();
	}
	
	/**
	 * Ingresa Barrio.
	 */
	public void enterNeighborhood(String neighborhood) {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
        WebElement barrio = wait.until(ExpectedConditions.presenceOfElementLocated(neighborhoodFieldBy));
        barrio.sendKeys(neighborhood);
	}
	
	/**
	 * Ingresa calle.
	 */
	public void enterStreet(String street) {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
        WebElement calle = wait.until(ExpectedConditions.presenceOfElementLocated(streetFieldBy));
        calle.sendKeys(street);
	}
	
	/**
	 * Ingresa Numero de vivienda.
	 */
	public void enterAdressNumber(String adressNumber) {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
        WebElement altura = wait.until(ExpectedConditions.presenceOfElementLocated(adressNumberFieldBy));
        altura.sendKeys(adressNumber);
	}
	
	/**
	 * Ingresa piso.
	 */
	public void enterFloor(String floor) {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
        WebElement piso = wait.until(ExpectedConditions.presenceOfElementLocated(floorFieldBy));
        piso.sendKeys(floor);
	}
	
	/**
	 * Ingresa departamento.
	 */
	public void enterDepartment(String department) {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
        WebElement departamento = wait.until(ExpectedConditions.presenceOfElementLocated(departmentFieldBy));
        departamento.sendKeys(department);
    
	}

	/**
	 * Clickea boton continuar.
	 */
	public void clickContinueButton() {
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(continueButtonBy));
        continueButton.click();
	}
}	