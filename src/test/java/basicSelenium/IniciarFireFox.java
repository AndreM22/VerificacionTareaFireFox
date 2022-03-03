package basicSelenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IniciarFireFox {
	FirefoxDriver driver;

	@BeforeEach
	public void openBrowser() {
		System.setProperty("webdriver.gecko.driver", "src/test/resources/driver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
	}

	@Test
	public void esperar() throws InterruptedException {
		Thread.sleep(5000);
	}

	@AfterEach
	public void closeBrowser() {
		driver.quit();
	}
}
