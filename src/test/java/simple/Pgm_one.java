package simple;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pgm_one {
	
	
@Test
public void actlearning() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Technical\\Software\\Selenium\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement gg= driver.findElement(By.className("pHiOh"));
//		Actions at = new Actions(driver);
//		at.sendKeys("aruna").build().perform();
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click()",gg);
    	
		
        driver.quit();	

}
}
