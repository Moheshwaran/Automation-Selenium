
package Ptojects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class projBaseclass {
	public static WebDriver driver;
@BeforeClass
public void open() {
	driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://demowebshop.tricentis.com/");
}
@BeforeMethod
public void login() {
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("mohesh123@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("mohesh123");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
}
@AfterMethod
public void logout() {
	driver.findElement(By.linkText("Log out")).click();
}
@AfterClass
public void close() {
	driver.quit();
}
}



//Base class this is open close login and logout
