import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.remote.DesiredCapabilities;
public class Test {


public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","C:\\Users\\webmobilez\\eclipse-workspace\\DemoTest\\geckodriver.exe");
DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
capabilities.setCapability("marionette",true); 
WebDriver driver = new FirefoxDriver();


driver.get("https://www.facebook.com");

     System.out.println("Successfully opened the website");
     driver.manage().window().maximize();
   
     driver.findElement(By.name("firstname")).sendKeys("pavan");
     driver.findElement(By.name("lastname")).sendKeys("podili");
     driver.findElement(By.name("reg_email__")).sendKeys("podili342@gmail.com");
     driver.findElement(By.name("reg_email_confirmation__")).sendKeys("podili342@gmail.com");     
     driver.findElement(By.name("reg_passwd__")).sendKeys("Tech$5367");
     Select bday = new Select(driver.findElement(By.name("birthday_day")));
     bday.selectByValue("11");
   
     List list = driver.findElements(By.name("sex"));
     ((WebElement) list.get(1)).click();
     driver.findElement(By.name("websubmit")).click();
     System.out.println("Successfully logged in");
     Thread.sleep(3000);
     driver.findElement(By.id("userNavigationLabel")).click();
     Thread.sleep(2000);
     driver.findElement(By.partialLinkText("Log Out")).click();
     System.out.println("Successfully logged out");

}
}
