package fr.autom2.miniprojet.MiniProjetSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class CasDeTestPage extends SquashPage{

	public CasDeTestPage(WebDriver driver) {
		super(driver);
	}
	
	
	Wait wait = new FluentWait(driver)
			.withTimeout(30, TimeUnit.SECONDS)
			.pollingEvery(5, TimeUnit.SECONDS)
			.ignoring(NoSuchElementException.class);
	
	public void clicBtnPlus() 
	{
		// Cliquer sur Projet 1
		WebElement projetUn = driver.findElement(By.xpath("//div[@id=\"tree\"]//a[contains(.,\"Test Project-1\")]"));
		projetUn.click();
		System.out.println("cliqué sur projet 1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Cliquer sur bouton +
		WebElement btnPlus = driver.findElement(By.xpath("//a[@id=\"tree-create-button\"]"));
		btnPlus.click();
		System.out.println("cliqué sur buton +");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// cliquer sur Nouveau Cas Test
		WebElement nouveauCasTet = (WebElement) wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"new-test-case-tree-button\"]/a")));
		nouveauCasTet.click();
		System.out.println("cliqué sur nouveau cas de test");
						
				
	}

}
