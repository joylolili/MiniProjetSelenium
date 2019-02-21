package fr.autom2.miniprojet.MiniProjetSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopUpCreationCas extends SquashPage {

	public PopUpCreationCas(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private WebElement nom = driver.findElement(By.xpath("//*[@id=\"add-test-case-dialog\"]/div//label[contains(text(),\"Nom\")]"));
	private WebElement reference = driver.findElement(By.xpath("//*[@id=\"add-test-case-dialog\"]/div//label[contains(text(),\"Référence\")]"));
	private WebElement description = driver.findElement(By.xpath("//*[@id=\"add-test-case-dialog\"]/div//label[contains(text(),\"Description\")]"));
	private WebElement btnAjouterAutre = driver.findElement(By.xpath("//div[@class=\"ui-dialog-buttonset\"]//input[@value=\"Ajouter un autre\"]"));
	private WebElement btnAjouter = driver.findElement(By.xpath("//div[@class=\"ui-dialog-buttonset\"]//input[@value=\"Ajouter\"]"));
	private WebElement btnAnnuler = driver.findElement(By.xpath("//div[@class=\"ui-dialog-buttonset\"]//input[@value=\"Annuler\"]"));
	public WebElement getNom() {
		return nom;
	}
	public void setNom(WebElement nom) {
		this.nom = nom;
	}
	public WebElement getReference() {
		return reference;
	}
	public void setReference(WebElement reference) {
		this.reference = reference;
	}
	public WebElement getDescription() {
		return description;
	}
	public void setDescription(WebElement description) {
		this.description = description;
	}
	public WebElement getBtnAjouterAutre() {
		return btnAjouterAutre;
	}
	public void setBtnAjouterAutre(WebElement btnAjouterAutre) {
		this.btnAjouterAutre = btnAjouterAutre;
	}
	public WebElement getBtnAjouter() {
		return btnAjouter;
	}
	public void setBtnAjouter(WebElement btnAjouter) {
		this.btnAjouter = btnAjouter;
	}
	public WebElement getBtnAnnuler() {
		return btnAnnuler;
	}
	public void setBtnAnnuler(WebElement btnAnnuler) {
		this.btnAnnuler = btnAnnuler;
	}
	
	
	
}
