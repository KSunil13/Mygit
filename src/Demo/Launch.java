package Demo;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class Launch {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\IT Tester\\eclipse-workspace\\NanoHealth\\Mozilla\\driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.navigate().to("https://www.google.com");
	driver.manage().window().maximize();
	driver.get("https://customer.nanohealthplan.com/users/sign_in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.id("user_login")).sendKeys("clinic123@gmail.com");
	driver.findElement(By.id("user_password")).sendKeys("Clinic@1234");
	driver.findElement(By.name("commit")).click();
	Thread.sleep(1000);
	//selecting Role clicking on Clinic manager Role
	driver.findElement(By.xpath("//*[@id=\"account-selection\"]/div/div[2]/a[2]/div/div/div/div[2]")).click();
	Thread.sleep(2000);	
	//hover the mouse on Reports
	Actions action = new Actions(driver); 
	Thread.sleep(1000);
	action.moveToElement(driver.findElement(By.id("admin-reports"))).build().perform();
	Thread.sleep(1000);
	action.moveToElement(driver.findElement(By.id("admin-list-patients"))).click().build().perform(); 
	Thread.sleep(1000);	
}
}