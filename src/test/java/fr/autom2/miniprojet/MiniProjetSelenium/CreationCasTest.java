package fr.autom2.miniprojet.MiniProjetSelenium;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreationCasTest extends MereTest {

	@Test
	public void creationCasDeTest() {
		login();
		
		waiting(driver);
		
		HomePage homePage = new HomePage(driver);
		homePage.clickBtnCasDeTest();
		
		waiting(driver);
		// rentrer dans le page de Cas de Test
		CasDeTestPage casDeTestPage = new CasDeTestPage(driver);
		casDeTestPage.clicBtnPlus();
		
		waiting(driver);
		// Vérifier la présence des éléments de pop-up
		WebElement nom = driver.findElement(By.xpath("//*[@id=\"add-test-case-dialog\"]/div//label[contains(text(),\"Nom\")]"));
		WebElement reference = driver.findElement(By.xpath("//*[@id=\"add-test-case-dialog\"]/div//label[contains(text(),\"Référence\")]"));
		WebElement description = driver.findElement(By.xpath("//*[@id=\"add-test-case-dialog\"]/div//label[contains(text(),\"Description\")]"));
		WebElement btnAjouterAutre = driver.findElement(By.xpath("//div[@class=\"ui-dialog-buttonset\"]//input[@value=\"Ajouter un autre\"]"));
		WebElement btnAjouter = driver.findElement(By.xpath("//div[@class=\"ui-dialog-buttonset\"]//input[@value=\"Ajouter\"]"));
		WebElement btnAnnuler = driver.findElement(By.xpath("//div[@class=\"ui-dialog-buttonset\"]//input[@value=\"Annuler\"]"));
		
		assertEquals("Nom", nom.getText());
		
		
		
		
	}
	
}
