package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.webdriven.commands.SelectFrame;

public class GmailRegister {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\My Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&flowName=GlifWebSignIn&flowEntry=SignUp");
			 
	String url=driver.getCurrentUrl();
	System.out.println(url);
	String title=driver.getTitle();
	System.out.println(title);
	
	//driver.findElement(By.linkText("CREATE AN ACCOUNT")).click();
	//Thread.sleep(5000);
	
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Kiran");
	Thread.sleep(5000);
	
	driver.findElement(By.id("lastName")).sendKeys("Gaikwad");
	driver.findElement(By.id("username")).sendKeys("kbg796");
	driver.findElement(By.name("Passwd")).sendKeys("kiran796");
	driver.findElement(By.name("ConfirmPasswd")).sendKeys("kiran796");
	driver.findElement(By.xpath("//*[@id='accountDetailsNext']/content/span")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("phoneNumberId")).sendKeys("7709728398");
	driver.findElement(By.xpath("//*[@id='gradsIdvPhoneNext']/content/span")).click();
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='gradsIdvVerifyNext']/div[2]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='view_container']/form/div[2]/div/div[2]/div/div[1]/div/div[1]/input")).sendKeys("kiranbgaikwad1994@gmail.com");
	}

}
