package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class techbuzzregistration {

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\My Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://techbuzzbusinessgroup.com/office/");

	String url=driver.getCurrentUrl();
	System.out.println(url);
	String title=driver.getTitle();
	System.out.println(title);
	
	driver.findElement(By.linkText("New Employee")).click();
	driver.findElement(By.xpath("//input[@name='emp_name']")).sendKeys("Kiran");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Kiran@gmail.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
	driver.findElement(By.xpath("//input[@name='cpassword']")).sendKeys("12345678");
	driver.findElement(By.xpath("//input[@name='num']")).sendKeys("7875303081");
	
	driver.findElement(By.xpath("//input[@value='Female']")).click();
	
	driver.findElement(By.xpath("//input[@name='platform']")).sendKeys("TESTING");
	driver.findElement(By.xpath("//input[@name='passout_year']")).sendKeys("2017");
    driver.findElement(By.xpath("//input[@name='emp_time']")).sendKeys("secondshift");
    driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("10/05/2018");
    driver.findElement(By.xpath("//input[@id='graduate']")).click();
    driver.findElement(By.xpath("//input[@name='birth_date']")).sendKeys("19/5/1994");
    driver.findElement(By.xpath("//input[@value='Unmarried']")).click();
    driver.findElement(By.xpath("//textarea[@name='localaddress']")).sendKeys("Hadapsar");
    driver.findElement(By.xpath("//textarea[@name='peraddress']")).sendKeys("Solapur");
    
	}

}
