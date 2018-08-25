package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\My Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://techbuzzbusinessgroup.com/office/");
	String url=driver.getCurrentUrl();
	System.out.println(url);
	String title=driver.getTitle();
	System.out.println(title);
	
	driver.findElement(By.name("username")).sendKeys("Kbgaikwad796@gmail.com");
	driver.findElement(By.name("password")).sendKeys("Kiran796");
	driver.findElement(By.xpath("/html/body/div[2]/div/form/div[3]/button")).click();
	
	Alert alertOK = driver.switchTo().alert();
	alertOK.accept();
	
	Thread.sleep(5000);
    driver.findElement(By.xpath("//img[@src='images/colle.jpg']")).click();
    driver.findElement(By.xpath("//button[@name='submit']")).click();
    
    Alert alertOK1=driver.switchTo().alert();
    alertOK1.accept();
    
    driver.findElement(By.xpath("//*[@id='page-top']/nav/div/ul[2]/li[2]/a")).click();

    Alert alertOK2=driver.switchTo().alert();
    alertOK2.accept();
	}

}
