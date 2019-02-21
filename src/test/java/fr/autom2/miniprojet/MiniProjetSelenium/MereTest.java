package fr.autom2.miniprojet.MiniProjetSelenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

public class MereTest {

	public WebDriver driver;
	private String browser = System.getProperty("browser");
	private String CHROME = "chrome";
	private String OPERA = "opera";
	private String FIREFOX = "firefox";
	
	@Before
	public void init() {
		
		if (browser.equalsIgnoreCase(CHROME)) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\formation\\Desktop\\SUT\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase(OPERA)){
			System.setProperty("webdriver.opera.driver", "C:\\Users\\formation\\Desktop\\SUT\\operadriver_win64\\operadriver.exe");
			DesiredCapabilities cap = new DesiredCapabilities();
			OperaOptions operaOptions = new OperaOptions();
			operaOptions.setBinary("C:\\Users\\formation\\AppData\\Local\\Programs\\Opera\\launcher.exe");
			cap.setCapability(OperaOptions.CAPABILITY, operaOptions);
			driver = new OperaDriver();	
		}else if (browser.equalsIgnoreCase(FIREFOX)) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\formation\\Desktop\\SUT\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
		driver.manage().window().maximize();
		driver.get("http://192.168.102.117:9876/squash/login");
//		driver.get("http://localhost:8080/squash/login");
				
	}
	
	@After
	public void fin() {
		driver.close();	
		try {
			driver.quit();
		} catch (WebDriverException e) {
			e.printStackTrace();
		}
	}
	
	public void waiting(WebDriver driver) {		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void waitingPage(WebDriver driver) {
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	}
	
	public HomePage login() {
		waiting(driver);
		
		WebElement user = driver.findElement(By.id("username"));
		WebElement pwd = driver.findElement(By.id("password"));
		WebElement btn = driver.findElement(By.xpath("//*[@id=\"login-form-button-set\"]/input"));
		
		user.clear();
		pwd.clear();
		user.sendKeys("admin");
		pwd.sendKeys("admin");
		btn.click();
		
		return PageFactory.initElements(driver, HomePage.class);
		
	}
}
