package webdriver.webdriver2;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	WebDriver driver;
public void launchBrowser() 
{
	System.setProperty("webdriver.chrome.driver", 
	"E:\\CDAC\\Software-Devlopment\\selinium\\chromedriver.exe");
	 driver = new ChromeDriver();
  driver.get("https://www.google.com/");
  //driver.get("https://www.amazon.in/ref=nav_logo");
}

public void searchProduct() throws InterruptedException
{
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	Thread.sleep(1000);
	driver.findElement(By.id("nav-search-submit-button")).click();
}
public void navigate()
{
	driver.navigate().to("https://www.gmail.com/");
	System.out.println("This is the title of the website"+driver.getTitle());
	//driver.navigate().back();
}

public void opengmail() throws InterruptedException
{
	driver.findElement(By.id("identifierId")).sendKeys("pradipmaane@gmail.com");
	//driver.close();
	Thread.sleep(3000);
	driver.findElement(By.id("identifierNext")).click();
	driver.findElement(By.id("pass")).sendKeys("1234556");
}

public void navigateToSelinium()
{
	driver.navigate().to("https://en.wikipedia.org/wiki/Selenium_(software)");
	driver.navigate().to("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium+%28software%29");
	System.out.println(driver.getCurrentUrl());
	driver.navigate().back();
	driver.navigate().to("http://www.seleniumhq.org");
	System.out.println(driver.getCurrentUrl());
	driver.close();
}




public void gmailStatus() {
		driver.get("https://www.google.com");
		try{
		boolean linkExistence=driver.findElement(By.linkText("Gmail")).isDisplayed();

		if (linkExistence == true){
		System.out.println("Gmail Link Exists – Passed");
		}
		}
		catch(NoSuchElementException e){
		System.out.println("Gmail Link Not Exists – Failed");
		}
		driver.close();

}

public static void main(String[] args) throws InterruptedException 
{
	App ob = new App();
	ob.launchBrowser();
	//ob.searchProduct();
	//ob.navigate();
    ob.opengmail();
	//ob.navigateToSelinium();
	//ob.gmailStatus();
}
}
