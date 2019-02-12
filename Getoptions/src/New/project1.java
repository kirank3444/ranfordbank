package New;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class project1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver.exe");
		boolean found=false;
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		String month =driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[1]/span")).getText();
		if(month.contains("july"))	
		{
			WebElement table =driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]//table"));
		List<WebElement> row=table.findElements(By.tagName("tr"));
		for(WebElement r:row )
		{
		List <WebElement>	columns=r.findElements(By.tagName("td"));
		for(WebElement c:columns)
		{
			String date=c.getText();
			System.out.println(date);
			if(date.contains("26"))
			{
				c.click();
				found=true;
				break;
			}
		}
		if(found==true)
		{
			break;
		}
		}
		
		}
	
	}

}
