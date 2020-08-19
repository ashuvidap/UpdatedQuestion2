import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa. selenium. chrome. ChromeDriver;

public class FlightSearch{
public static void main (String[] args) throws InterruptedException{

	System.setProperty("webdriver, chrome,driver"," usr/bin/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize ();
	//open PhpTravels URL
	driver.get("https://www.phptravels.net/home");
	driver. findElement (By.cssSelector("[class*='flights']")).click();
	//selecting Round trip radio button
	driver.find.Element (By.xpath ("//div@id='flights']/div/div/form/div/div/div[1]/div[1]/div/div[2]/label")).click();
	//selecting Business from drop-down
	driver.find.Element (By.xpath ("//div@id='flights']/div/div/form/div/div/div[1]/div[2]/div/div")).click();
	driver.find.Element (By.xpath ("//div@id='flights']/div/div/form/div/div/div[1]/div[2]/div/div/div/ul/li[2]")).click();
	//selecting and entering From field
	driver.findElement(By.xpath("//*[@id="s2id_location_from"]/a")).click();
	driver.findElement(By.xpath("//*[@id="select2-drop"]/div/input")).sendKeys("Pune");
	List<WebElement> autoSuggest1 = driver.findElements(By.xpath("//div[@id='select2-drop']/ul"));
        	Thread.sleep(3000);
      
       	 // print the auto suggest
       	 for (WebElement a : autoSuggest1)
        	{
        		System.out.println("Values are = " + a.getText());
        		if (a.getText().equalsIgnoreCase("Pune(PNQ)"));
        		a.click();
        		Thread.sleep(3000);
        		break;
        	}
	
	//selecting and entering To field
	driver.findElement(By.xpath("//*[@id="s2id_location_to"]/a")).click();
	driver.findElement(By.xpath("//*[@id="select2-drop"]/div/input")).sendKeys("Mumbai");
	List<WebElement> autoSuggest2 = driver.findElements(By.xpath("//div[@id='select2-drop']/ul"));
        	Thread.sleep(3000);
      
       	 // print the auto suggest
       	 for (WebElement a : autoSuggest2)
        	{
        		System.out.println("Values are = " + a.getText());
        		if (a.getText().equalsIgnoreCase("Mumbai(BOM)"));
        		a.click();
        		Thread.sleep(3000);
        		break;
        	}
	JavascriptExecutor js = (JavascriptExecutor) driver;
	//Selecting Departure date
	driver.findElement (By.id("FlightsDateStart")).click();
	js.executeScript("window.scrollBy(0,100)"); 
	driver.findElement (By.xpath("//*[@id="datepickers-container"]/div[9]/div/div/div[2]/div[26]")).click();
	//selecting Return date
	driver.findElement (By.id("FlightsDateEnd")).click();
	//to scroll down by 100 pixel to select value from calendar
	js.executeScript("window.scrollBy(0,100)"); 
	drnver.findElement (By.xpath("//*[@id="datepickers-container"]/div[10]/div/div/div[2]/div[30]")).click();
	//adding Adult
	driver.findElement (By.xpath("//*[@id="flights"]/div/div/form/div/div/div[3]/div[3]/div/div/div[1]/div/div[2]/div/span/button[1]")).click();
	//adding Child
	driver.findElement(By.xpath("//*[@id="flights"]/div/div/form/div/div/div[3]/div[3]/div/div/div[2]/div/div[2]/div/span/button[1]")).click();
	//adding Infant
	driver.findElement(By.xpath("//*[@id="flights"]/div/div/form/div/div/div[3]/div[3]/div/div/div[3]/div/div[2]/div/span/button[1]")).click();
	Thread.sleep (2000)
	driver. findElement (By.xpath("//*[@id="flights"]/div/div/form/div/div/div[3]/div[4]/button")).click();
	Thread.sleep(3000)
	//validating fiight 1ist

	if(driver. findElement (By. cssSelector("[class*='post-heading']")).isDisplayed())
		{
			System.out.println("Total 0 listings found for given route");
		}
	else	{
			System.out.println("Available Flight list is displaying for given route");
		}
	driver.close();
	}
}