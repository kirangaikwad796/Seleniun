package test;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;



public class NaukriRegistration {

	public static void main(String[] args) throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\My Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     
     driver.manage().deleteAllCookies();
     
     driver.get("https://www.naukri.com/");
     
     
     Thread.sleep(5000);
     driver.findElement(By.xpath("//input[@value='Register with us']")).click();
    // driver.findElement(By.linkText("Register Now")).click();
     
     Thread.sleep(6000);
     driver.findElement(By.xpath("//button[@value='fresher']")).click();
     driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Kiran Gaikwad");
     driver.findElement(By.xpath("//input[@name='email']")).sendKeys("f974@gmail.com");
     driver.findElement(By.name("password")).sendKeys("123456");
     driver.findElement(By.name("number")).sendKeys("7709727896");
     driver.findElement(By.name("city")).sendKeys("Pune");
     driver.findElement(By.xpath("//button[@name='basicDetailSubmit']")).click();
     
     
     Thread.sleep(6000);
     //driver.findElement(By.xpath("//*[@id='educationDetailForm']/edu-section/section/edu-qualification/div/div[1]/div/div/div[1]/ul/li/div/label/span")).click();
     
   /*List <WebElement> qe=driver.findElements(By.xpath("//div[@class='dd_dwn ng-hide']/ul/li"));
   System.out.println(qe.size());
   for(int i=0;i<qe.size();i++)
   {
	   System.out.println("Hello");
	   System.out.println(qe.get(i).getText());
	   System.out.println("worldsssss");
	   */
     Thread.sleep(5000);
     driver.findElement(By.xpath("//input[@name='course_0']")).sendKeys("Diploma");
     driver.findElement(By.xpath("//input[@name='spec_0']")).sendKeys("B J Medical Coolege");
   }
   
 }
