package New;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cricbuzz {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver.exe");
ChromeDriver driver =new ChromeDriver();

driver.get("https://www.seleniumhq.org/");
driver.manage().window().maximize();
driver.findElement(By.id("menu_download")).click();
WebElement e =driver.findElement(By.linkText("3.141.59"));
	Actions a =new Actions(driver);
	a.contextClick(e).perform();
	Thread.sleep(3000);
	a.sendKeys(Keys.DOWN).perform();
	Thread.sleep(3000);
	a.sendKeys(Keys.DOWN).perform();
	Thread.sleep(3000);
	a.sendKeys(Keys.ENTER).perform();
	driver.quit(); 
	}
	}
