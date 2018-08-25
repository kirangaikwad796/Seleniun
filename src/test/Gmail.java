package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.webdriven.commands.SelectFrame;

public class Gmail 
{

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\My Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.youtube.com/");
	Thread.sleep(5000);
	
	driver.findElement(By.partialLinkText("ending")).click();
	/*String url=driver.getCurrentUrl();
	System.out.println(url);
	
	String title=driver.getTitle();
	System.out.println(title);
	
	if(title.equals("Gmail"))
	{
		System.out.println("WebPage is display");
	}
	else
	{
		System.out.println("WebPage not display");
	}
	driver.findElement(By.id("identifierId")).sendKeys("kbgaikwad796@gmail.com");
	
	driver.findElement(By.id("identifierNext")).click();
	Thread.sleep(5000);
	
	//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("kiran796");
	driver.findElement(By.name("password")).sendKeys("Kiran796");
	
	driver.findElement(By.id("passwordNext")).click();
*/	}
	
}
