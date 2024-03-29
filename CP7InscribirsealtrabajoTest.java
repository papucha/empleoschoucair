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
public class CP7InscribirsealtrabajoTest {
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
  public void cP7Inscribirsealtrabajo() {
    driver.get("https://www.choucairtesting.com/");
    driver.manage().window().setSize(new Dimension(1357, 728));
    {
      WebElement element = driver.findElement(By.linkText("Empleos"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.linkText("Empleos")).click();
    driver.findElement(By.id("search_keywords")).click();
    driver.findElement(By.id("search_keywords")).sendKeys("Analista");
    driver.findElement(By.cssSelector(".search_submit > input")).click();
    driver.findElement(By.cssSelector(".post-7547 h3")).click();
    js.executeScript("window.scrollTo(0,97)");
    driver.findElement(By.cssSelector(".application_button")).click();
    driver.findElement(By.name("your-name")).click();
    driver.findElement(By.name("your-name")).sendKeys("Paila Andrea Vargas");
    driver.findElement(By.name("tel")).sendKeys("3144574934");
    driver.findElement(By.name("your-name")).click();
    driver.findElement(By.name("your-name")).sendKeys("Paila Andrea ");
    driver.findElement(By.cssSelector(".wpcf7-form > p:nth-child(3)")).click();
    driver.findElement(By.name("your-email")).click();
    driver.findElement(By.name("your-email")).sendKeys("paula@gmail.com");
    driver.findElement(By.name("tel")).click();
    driver.findElement(By.name("tel")).sendKeys("3144574930");
    driver.findElement(By.name("estudios")).click();
    driver.findElement(By.name("estudios")).sendKeys("Ingeniera de Sistemas");
    driver.findElement(By.name("exp")).click();
    driver.findElement(By.name("exp")).sendKeys("1 año");
    driver.findElement(By.name("auto")).click();
    driver.findElement(By.name("auto")).sendKeys("Me gustaria");
    driver.findElement(By.name("salario")).click();
    driver.findElement(By.name("salario")).sendKeys("11111111");
    driver.findElement(By.name("curso")).click();
    {
      WebElement dropdown = driver.findElement(By.name("curso"));
      dropdown.findElement(By.xpath("//option[. = '1 semana']")).click();
    }
    driver.findElement(By.name("curso")).click();
    driver.findElement(By.name("your-message")).click();
    driver.findElement(By.name("your-message")).sendKeys("Ninguno");
    driver.findElement(By.name("file-736")).click();
    driver.findElement(By.name("file-736")).sendKeys("C:\\fakepath\\HOJA DE VIDA.pdf");
    driver.switchTo().frame(1);
    driver.findElement(By.cssSelector(".recaptcha-checkbox-border")).click();
    driver.switchTo().defaultContent();
    {
      WebElement element = driver.findElement(By.cssSelector(".wpcf7-submit"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".wpcf7-submit")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.id("content")).click();
  }
}
