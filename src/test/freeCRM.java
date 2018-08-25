package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.webdriven.commands.SelectFrame;
 

public class freeCRM {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\My Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	
	driver.get("https://www.freecrm.com/index.html");
	String url=driver.getCurrentUrl();
	System.out.println(url);
	
	Thread.sleep(5000);
	
	driver.findElement(By.linkText("Sign Up")).click();
	
	String title=driver.getTitle();
	System.out.println(title);
	
	Select edition=new Select(driver.findElement(By.xpath("//select[@id='payment_plan_id']")));
	edition.selectByVisibleText("Free Edition");
	
	driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Onkar");
	driver.findElement(By.xpath("//input[@name='surname']")).sendKeys("Gaikwad");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("//input[@name='email_confirm']")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("avi12345");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
	driver.findElement(By.xpath("//input[@name='passwordconfirm']")).sendKeys("12345678");
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	driver.findElement(By.xpath("//button[@id='submitButton']")).click();
	//driver.findElement(By.id("submitButton")).click();
	
	//Company info
	driver.findElement(By.xpath("//input[@name='company_name']")).sendKeys("ABC Pvt.ltd");
	driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9878456545254");
	driver.findElement(By.xpath("//input[@name='fax']")).sendKeys("hrghjrhghh");
	driver.findElement(By.xpath("//input[@name='website']")).sendKeys("www.hfhhg.com");
	driver.findElement(By.xpath("//input[@name='company_email']")).sendKeys("kiran@gmail.com");
	driver.findElement(By.xpath("//textarea[@name='service']")).sendKeys("jjrjhjhjhjjrhjghjhjjgj");
	driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("A.M.colony,Mahadevnagar,Hadapsar");
	driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Pune");
	driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Maharastra");
	driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("413132");
	Select country=new Select(driver.findElement(By.xpath("//select[@name='country']")));
	country.selectByVisibleText("India");
	driver.findElement(By.xpath("//input[@name='copy_address']")).click();
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	//3rd 
	driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Onkar");
	driver.findElement(By.xpath("//input[@name='surname']")).sendKeys("Gaikwad");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("//input[@name='email_confirm']")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("saurabh123");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
	driver.findElement(By.xpath("//input[@name='passwordconfirm']")).sendKeys("12345678");
	Select role=new Select(driver.findElement(By.xpath("//select[@name='role_id']")));
	role.selectByVisibleText("User");
	driver.findElement(By.xpath("//button[@name='finish']")).click();
	Thread.sleep(5000);
	
	//Login
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Nisha12345");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
	//driver.findElement(By.xpath("//input[@value='Login']")).click();
	driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
	//driver.findElement(By.xpath("//a[text()='Features']")).click();
	
	}

}
