package contentmanagement.materiallib;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class MaterialLib {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  JavascriptExecutor js;
  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    js = (JavascriptExecutor) driver;
  }

  //进入素材库页面
  @Test
  public void materialPage() throws Exception {
    driver.get("http://139.186.122.21/cpms-p/#/material-list");
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/ul/div[3]/li/div/span")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/ul/div[3]/li/div/span")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/ul/div[3]/li/ul/div/a/li")).click();
  }

  //关键字查询
  @Test
  public void keyWordQuery() throws Exception{
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/form/div[2]/div/div/input")).click();
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/form/div[2]/div/div/input")).clear();
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/form/div[2]/div/div/input")).sendKeys("关键字");
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/form/div[5]/div/button/span")).click();
  }
  
  //类型查询
  @Test
  public void typeQuery() throws Exception {
	//视频查询
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/form/div[3]/div/div/div/input")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='音频'])[3]/following::span[1]")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/form/div[5]/div/button")).click();
  }
  
  //来源查询
  @Test
  public void sourceQuery() throws Exception {
    //来源（快编）
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/form/div[4]/div/div/div/input")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='原始'])[25]/following::li[1]")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/form/div[5]/div/button")).click();
    //重置
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/form/div[6]/div/button")).click();
    //查询
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/form/div[5]/div/button/span")).click();
  }
  
  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

