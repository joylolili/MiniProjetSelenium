package fr.autom2.miniprojet.MiniProjetSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends SquashPage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	private WebElement btnCasDeTest = driver.findElement(By.id("test-case-link")); // //*[@id="test-case-link"]
	
	public CasDeTestPage clickBtnCasDeTest () {
		btnCasDeTest.click();
		return PageFactory.initElements(driver, CasDeTestPage.class);
	}

	public WebElement getBtnCasDeTest() {
		return btnCasDeTest;
	}

	public void setBtnCasDeTest(WebElement btnCasDeTest) {
		this.btnCasDeTest = btnCasDeTest;
	}
 
	
}
