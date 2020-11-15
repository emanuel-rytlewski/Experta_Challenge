package test;

import org.testng.annotations.Test;

import driver.WebDriverManager;
import pages.HomePage;
import pages.HomeSecurePage;
import enums.Seguros;

public class TestHome extends WebDriverManager{
	@Test(testName="Hogar", 
		  description= "crear un caso de seguro de hogar")
	public void test() {
		final String postalCodeHomeSecure = "1854";
		final String nameHomeSecure = "EMANUEL";
		final String lastNameHomeSecure = "RYTLEWSKI";
		final String emailHomeSecure = "emanuel.rytlewski@gmail.com";
		final String telephonePrefixHomeSecure = "011";
		final String telephoneHomeSecure = "1156911006";
		
		//Act
		HomePage home = new HomePage(driver);
		home.selectSecure(Seguros.HOGAR);
		HomeSecurePage homeSecurePage = new HomeSecurePage(driver);
		homeSecurePage.enterpostalCodeHomeSecure(postalCodeHomeSecure);
		homeSecurePage.selectLocationHomeSecure();
		homeSecurePage.selectTypeOfHomeBy();
		homeSecurePage.enterNameHomeSecure(nameHomeSecure);
		homeSecurePage.enterLastNameHomeSecure(lastNameHomeSecure);
		homeSecurePage.enterEmailHomeSecure(emailHomeSecure);
		homeSecurePage.enterTelephonePrefixHomeSecure(telephonePrefixHomeSecure);
		homeSecurePage.enterTelephoneHomeSecureFiel(telephoneHomeSecure);
		homeSecurePage.QuoteButtonHomeSecure();	
	}
}

