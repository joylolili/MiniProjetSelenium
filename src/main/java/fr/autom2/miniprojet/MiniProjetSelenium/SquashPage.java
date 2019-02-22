package fr.autom2.miniprojet.MiniProjetSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.PageFactory;

public abstract class SquashPage {

	WebDriver driver ;
	
	public SquashPage() {
		super();
	}

	public SquashPage(WebDriver driver) {
		super();
		this.driver = driver;
	}


	public void moveToClick(WebElement...elements) {
		Actions actions = new Actions(driver);
		for (WebElement webElement : elements) {
			actions.moveToElement(webElement);
		}
		actions.click().perform();
	}
	
	public <T> T click(WebElement element, Class<T> page) {
		element.click();
		return PageFactory.initElements(driver, page);
	}
	
}
