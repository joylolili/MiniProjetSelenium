package fr.autom2.miniprojet.MiniProjetSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class CasDeTestPage extends SquashPage{

	public CasDeTestPage(WebDriver driver) {
		super(driver);
	}
	
	private WebElement btnPlus = driver.findElement(By.xpath("//a[@id=\"tree-create-button\"]"));
	private WebElement nouveauCasTet = driver.findElement(By.xpath("//*[@id=\"new-test-case-tree-button\"]/a"));

	
	Wait wait = new FluentWait(driver)
			.withTimeout(30, TimeUnit.SECONDS)
			.pollingEvery(5, TimeUnit.SECONDS)
			.ignoring(NoSuchElementException.class);
	
	public void clicProjet() {
		// Cliquer sur Projet 1
		WebElement projetUn = driver.findElement(By.xpath("//div[@id=\"tree\"]//a[contains(.,\"Test Project-1\")]"));
		projetUn.click();
		System.out.println("cliqué sur projet 1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	public WebElement wait(WebElement element, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
				return wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	
	public PopUpCreationCas clicBtnPlus() {
		Actions actions = new Actions(driver);
		actions.moveToElement(wait(btnPlus, 5)).click().build().perform();
		actions.moveToElement(wait(nouveauCasTet, 1)).click().build().perform();
		return PageFactory.initElements(driver, PopUpCreationCas.class);
	}

}
