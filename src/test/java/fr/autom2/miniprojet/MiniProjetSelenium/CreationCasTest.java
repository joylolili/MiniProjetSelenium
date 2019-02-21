package fr.autom2.miniprojet.MiniProjetSelenium;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreationCasTest extends MereTest {

	@Test
	public void creationCasDeTest() throws Exception{
		login();
		
		waiting(driver);
		
		HomePage homePage = new HomePage(driver);
		homePage.clickBtnCasDeTest();
		
		waiting(driver);
		// rentrer dans le page de Cas de Test
		CasDeTestPage casDeTestPage = new CasDeTestPage(driver);
		
		waitingPage(driver);
		
		casDeTestPage.clicProjet();
		Thread.sleep(2000);
		waiting(driver);
		
		casDeTestPage.clicBtnPlus();
		Thread.sleep(2000);
		waiting(driver);
		
		PopUpCreationCas popUp = new PopUpCreationCas(driver);
		
		// Vérifier la présence des éléments de pop-up
		assertEquals("Nom", popUp.getNom().getText());
		assertEquals("Référence", popUp.getReference().getText());
		assertEquals("Description", popUp.getDescription().getText());
		assertEquals("Ajouter un autre", popUp.getBtnAjouterAutre().getAttribute("value"));
		assertEquals("Ajouter", popUp.getBtnAjouter().getAttribute("value"));
		assertEquals("Annuler", popUp.getBtnAnnuler().getAttribute("value"));
		
		
		
	}
	
}
