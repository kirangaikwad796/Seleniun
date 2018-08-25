package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class monster 
{

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\My Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://my.monsterindia.com/create_account.html");
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@id='firstName_id']")).sendKeys("Onkar");
	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Gaikwad");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kbgaikwad796@gmail.com");
	driver.findElement(By.xpath("//input[@id='passwd_id']")).sendKeys("Kiran796");
	driver.findElement(By.xpath("//span[@id='select2-chosen-1']")).sendKeys("bangaluru");
	
	}

}
