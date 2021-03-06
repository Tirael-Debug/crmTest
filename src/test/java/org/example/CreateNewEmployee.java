package org.example;// Generated by Selenium IDE
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
public class CreateNewEmployee {
  private WebDriver driver;
  private Map<String, Object> vars;
  private WebDriverWait wait;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    wait = new WebDriverWait(driver, 60);

  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void createNewEmployee() {
    driver.get("https://crm.geekbrains.space/");
    driver.manage().window().setSize(new Dimension(712, 680));
    driver.findElement(By.id("prependedInput")).sendKeys("Applanatest1");
    driver.findElement(By.id("prependedInput2")).click();
    driver.findElement(By.cssSelector(".container")).click();
    driver.findElement(By.id("prependedInput2")).sendKeys("Student2020!");
    driver.findElement(By.id("_submit")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".first > .unclickable > .title"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".first .last .title"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".first .last .title")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("?????????????? ???????????????????? ????????")));
    driver.findElement(By.linkText("?????????????? ???????????????????? ????????")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("crm_contact[lastName]")));
    driver.findElement(By.name("crm_contact[lastName]")).click();
    driver.findElement(By.name("crm_contact[lastName]")).sendKeys("??????" + "  " + Math.random()*1000);
    driver.findElement(By.name("crm_contact[firstName]")).click();
    driver.findElement(By.name("crm_contact[firstName]")).sendKeys("??????????????"+ "  " + Math.random()*1000);
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".select2-default > .select2-chosen"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("select2-drop-mask"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".row"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }

    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"select2-drop\"]/ul[2]/li[2]"))).click();
    driver.findElement(By.cssSelector(".lang-ru")).click();

    driver.findElement(By.name("crm_contact[jobTitle]")).click();
    driver.findElement(By.name("crm_contact[jobTitle]")).sendKeys("??");
    {
      WebElement element = driver.findElement(By.name("crm_contact[status]"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement dropdown = driver.findElement(By.name("crm_contact[status]"));
      dropdown.findElement(By.cssSelector("*[value='1']")).click();
    }
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("label:nth-child(2)"))).click();
    driver.findElement(By.cssSelector("label:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".btn-group:nth-child(4) > .btn")).click();
    {

    driver.close();
  }
}
}
