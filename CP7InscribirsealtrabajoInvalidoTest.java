// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class CP7InscribirsealtrabajoInvalidoTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void cP7InscribirsealtrabajoInvalido() {
    driver.get("https://www.choucairtesting.com/");
    driver.manage().window().setSize(new Dimension(1366, 728));
    {
      WebElement element = driver.findElement(By.linkText("Comunidad"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.linkText("Empleos"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.linkText("Empleos")).click();
    {
      WebElement element = driver.findElement(By.linkText("Empleos"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".post-7547 h3")).click();
    js.executeScript("window.scrollTo(0,452)");
    js.executeScript("window.scrollTo(0,748)");
    js.executeScript("window.scrollTo(0,1053)");
    driver.findElement(By.cssSelector(".application_button")).click();
    driver.findElement(By.name("your-name")).click();
    driver.findElement(By.cssSelector(".wpcf7-form > p:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".wpcf7-form > p:nth-child(11)")).click();
    driver.findElement(By.name("file-736")).click();
    driver.findElement(By.name("file-736")).sendKeys("C:\\Users\\USER\\Documents\\HV.txt");
    driver.findElement(By.cssSelector(".wpcf7-submit")).click();
    js.executeScript("window.scrollTo(0,2563)");
  }
}