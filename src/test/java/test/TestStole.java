package test;

import org.testng.annotations.Test;

import driver.WebDriverManager;
import enums.Company;
import enums.Genero;
import enums.PersonalDataStole;
import enums.Seguros;
import enums.TaxStatus;
import org.testng.Assert;
import pages.HomePage;
import pages.StolePage;
import pages.StolePayPage;
import pages.StolePersonalInformationPage;

public class TestStole extends WebDriverManager{
@Test(testName="Robo", 
	  description= "crear un caso de seguro de robo")
	public void test() {
		//Arrange 
		final String date = "15/12/2020";
		final String name = "EMANUEL";
		final String lastName = "RYTLEWSKI";
		final String mail = "emanuel.rytlewski@gmail.com";
		final String number = "1156911006";
		final String preFix = "011";
		final String dni = "36739619";
		final String codigoPostal = "1854";
		final int location = 0;	
		final String barrio = "Los Alamos";
		final String calle = "Florencio Sanchez";
		final String altura = "118";
		final String piso = "1";
		final String departamento = "A";
		final String numeroTarjeta = "1111 2222 3333 4444";
		final String vencimientoMes = "09";
		final String vencimientoAnio = "23";
		final String titularTarjeta = "Emanuel Rytlewski";
		final String domicilioCompleto = "FLORENCIO SANCHEZ 118 1 A LOS ALAMOS LONGCHAMPS - (BUENOS AIRES)";
		
		//Act
		HomePage homePage = new HomePage(driver);
		homePage.selectSecure(Seguros.ROBO);
		StolePage stolePage = new StolePage(driver);
		stolePage.enterSince(date);
		stolePage.enterName(name);
		stolePage.enterSurname(lastName);
		stolePage.enterEmail(mail);
		stolePage.enterTelephoneNumber(number);
		stolePage.enterTelephonePrefix(preFix);
		stolePage.quote();
		stolePage.selectRecomended();		
		
		//Act 2
		StolePersonalInformationPage personalInformation = new StolePersonalInformationPage(driver);
		personalInformation.selectTypeOfPerson(PersonalDataStole.PERSONA_FISICA);
		personalInformation.enterFirstName(name);
		personalInformation.enterLastName(lastName);
		personalInformation.selectTaxStatus(TaxStatus.CONSUMIDOR_FINAL);
		personalInformation.enterDni(dni);
		personalInformation.selectGenero(Genero.MASCULINO);
		personalInformation.enterEmail(mail);
		personalInformation.enterTelephone(number);
		personalInformation.enterPostalCode(codigoPostal);
		personalInformation.selectLocation(location);
		personalInformation.enterNeighborhood(barrio);
		personalInformation.enterStreet(calle);
		personalInformation.enterAdressNumber(altura);
		personalInformation.enterFloor(piso);
		personalInformation.enterDepartment(departamento);
		personalInformation.clickContinueButton();
		
		//Act 3
		StolePayPage stolePay = new StolePayPage(driver);
		stolePay.clickPayMethod();
		stolePay.selectCompanyBy(Company.VISA);
		stolePay.entercardNumber(numeroTarjeta);
		stolePay.enterExpirationMonth(vencimientoMes);
		stolePay.enterExpirationYear(vencimientoAnio);
		stolePay.enterAccountHolder(titularTarjeta);
		stolePay.clickPayButtonBy();
		
		//Asserts
		Assert.assertEquals(dni, stolePay.getDniNumber(), "DNIs are not equals");
		Assert.assertEquals(name+" "+lastName, stolePay.getName(), "Full names are not equals");
		Assert.assertEquals(domicilioCompleto, stolePay.getAdress(), "Full adress are not equals");
	}
}