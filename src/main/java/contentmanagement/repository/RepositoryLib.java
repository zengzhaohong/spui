package contentmanagement.repository;

//public class RepositoryLib {
//
//}
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
import java.io.File;

public class RepositoryLib {
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
  //进入资源库首页
  @Test
  public void resourceLibraryHome () throws Exception {
    driver.get("http://139.186.122.21/cpms-p/#/viewmore");
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/ul/div[3]/li/div/span")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/ul/div[3]/li/ul/div[3]/a/li/span")).click();
  }
  //素材名称查询
  @Test
  public void materialNameQuery() throws Exception {
    driver.get("http://139.186.122.21/cpms-p/#/resource-lib");
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/div/div/section/main/div/form/div[2]/div/div/input")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/div/div/section/main/div/form/div[2]/div/div/input")).clear();
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/div/div/section/main/div/form/div[2]/div/div/input")).sendKeys("2");
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/div/div/section/main/div/form/div[4]/div/button/span")).click();
  }
  //类型查询
  @Test
  public void typeQueries() throws Exception {
    driver.get("http://139.186.122.21/cpms-p/#/resource-lib");
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/div/div/section/main/div/form/div[3]/div/div/div/input")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='确定'])[2]/following::li[1]")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/div/div/section/main/div/form/div[4]/div/button/span")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/div/div/section/main/div/form/div[5]/div/button/span")).click();
  }
  //视频发布
  @Test
  public void videoReleased() throws Exception {
    driver.get("http://139.186.122.21/cpms-p/#/resource-lib");
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/div/div/section/main/div[2]/div[3]/table/tbody/tr/td[6]/div/button[2]")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/div/div[2]/button[2]/span")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/div[2]/div[3]/div/form/div[2]/div/div/div/input")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='王强'])[2]/following::span[1]")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/div[2]/div[3]/div/div[2]/div[2]/div/div/div/span")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/div[2]/div[3]/div/div[2]/div[2]/div/div/div[2]/div[4]/div/label/span/span")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/div/div[2]/button[3]/span")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='八桂先锋小程序:'])[1]/following::button[1]")).click();
  }
  //文稿发布
  @Test
  public void manuscriptsPublished() throws Exception {
	    driver.get("http://139.186.122.21/cpms-p/#/resource-lib");
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/div/div/section/main/div[2]/div[3]/table/tbody/tr[3]/td[6]/div/button[2]/i")).click();
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/div/div[2]/button[2]")).click();
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/div[2]/div[3]/div/form/div[2]/div/div/div/input")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='陈宇'])[2]/following::li[1]")).click();
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/div[2]/div[3]/div/div[2]/div[2]/div/div/div/span")).click();
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/div[2]/div[3]/div/div[2]/div[2]/div/div/div[2]/div[4]/div")).click();
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/div/div[2]/button[3]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='八桂先锋小程序:'])[1]/following::span[1]")).click();
	  }
  //视频删除
  @Test
  public void videoDel() throws Exception {
    driver.get("http://139.186.122.21/cpms-p/#/resource-lib");
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/div/div/section/main/div[2]/div[3]/table/tbody/tr[5]/td[6]/div/button[3]/span")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='取消'])[1]/following::span[1]")).click();
  }
  //文稿删除
  @Test
  public void manuscriptsDelete() throws Exception {
    driver.get("http://139.186.122.21/cpms-p/#/resource-lib");
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/div/div/section/main/div[2]/div[3]/table/tbody/tr[3]/td[6]/div/button[3]/span")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='取消'])[1]/following::button[1]")).click();
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
