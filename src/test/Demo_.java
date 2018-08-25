package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.webdriven.commands.SelectFrame;

public class Demo_ {

	public static void main(String[] args)
	{
		// to launch browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\My Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// to max the window
		driver.manage().window().maximize();
		
		// to launch the url
		driver.get("https://www.facebook.com/");
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Facebook – log in or sign up"))
		{
			System.out.println("Web page is displayed");
		}
		else
		{
			System.out.println("Web page not is displayed");
		}
		
		if(title.equalsIgnoreCase("facebook – Log in or sign up"))
		{
			System.out.println("It is display");
		}
		else
		{
			System.out.println("It is not displayed");
		}
       
		if(title.contains("book"))
		{
			System.out.println("displayed");
		}
		else
		{
			System.out.println("Not displayed");
		}
		
		
		
		//driver.findElement(By.id("u_0_j")).sendKeys("Kiran");
		//driver.findElement(By.name("firstname")).sendKeys("Kiran");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kiran");
	
		//driver.findElement(By.id("u_0_l")).sendKeys("PQR");
		driver.findElement(By.name("lastname")).sendKeys("Gaikwad");
		
	    driver.findElement(By.id("u_0_o")).sendKeys("7875313181");	
	 
	    driver.findElement(By.id("u_0_v")).sendKeys("12345e");
	 
	    Select day =new Select(driver.findElement(By.xpath("//select[@id='day']")));
	    day.selectByVisibleText("2");
	   
	   Select month=new Select(driver.findElement(By.xpath("//select[@id='month']")));
	   month.selectByVisibleText("May");
	   
	   Select year=new Select(driver.findElement(By.xpath("//select[@id='year']")));
	   year.selectByVisibleText("1994");
	   //select.driver.findElement(By.id("u_0_11")).click();
	   
	   driver.findElement(By.id("u_0_9")).click();
	   driver.findElement(By.id("u_0_11")).click();
	  // driver.findElement(By.xpath("//button[@type='submit' and @name='websubmit']")).click();
	 //Navigation
	     driver.navigate().to("https://www.freecrm.com/register");
	     
	     driver.navigate().back();
	     
	     driver.navigate().forward();
	     
	     driver.navigate().refresh();
	    
	     //Set Size
	     Dimension dm = new Dimension(1000,2000);
	     driver.manage().window().setSize(dm);
	    
	     //Position
	    Point p = new Point(90,180);
	    driver.manage().window().setPosition(p);
	    
	   // driver.quit();
	     
	  //  driver.close();
	}
}
