package fr.autom2.miniprojet.MiniProjetSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class SquashPage {

	WebDriver driver ;
	
	public SquashPage() {
		super();
	}

	public SquashPage(WebDriver driver) {
		super();
		this.driver = driver;
	}


	
}
