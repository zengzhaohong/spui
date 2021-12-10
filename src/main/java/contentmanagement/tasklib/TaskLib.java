package contentmanagement.tasklib;

//public class TaskLib {
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

public class TaskLib {
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
  public void libraryHome () throws Exception {
    driver.get("http://139.186.122.21/cpms-p/#/viewmore");
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/ul/div[3]/li/div")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/ul/div[3]/li/ul/div[2]/a/li")).click();
  
  }
  //名称查询
  @Test
  public void nameQuery() throws Exception {
    driver.get("http://139.186.122.21/cpms-p/#/assign-material");
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/form/div/div/div/input")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/form/div/div/div/input")).clear();
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/form/div/div/div/input")).sendKeys("2");
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/form/div[4]/div/button/span")).click();
  }
  //类型查询
  @Test
  public void typesQueries() throws Exception {
    driver.get("http://139.186.122.21/cpms-p/#/assign-material");
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/form/div[2]/div/div/div/input")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='音频'])[1]/following::li[1]")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/form/div[4]/div/button/span")).click();
    
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/form/div[2]/div/div/div/span/span/i")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='视频'])[1]/following::li[1]")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/form/div[4]/div/button")).click();
  }
  //任务主题查询
  @Test
  public void taskType() throws Exception {
    driver.get("http://139.186.122.21/cpms-p/#/assign-material");
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/form/div[3]/div/div/div/input")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=concat('vjhgf', \"'\", '')])[1]/following::li[1]")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/form/div[4]/div/button/span")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/form/div[4]/div/button[2]")).click();
  }
  //图文创作及报送
  @Test
  public void graphicCreation() throws Exception {
    driver.get("http://139.186.122.21/cpms-p/#/assign-material");
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/div/button/span")).click();
    driver.findElement(By.xpath("//div[@id='pane-0']/div[2]/div/div/div/input")).click();
    driver.findElement(By.xpath("//div[@id='pane-0']/div[2]/div/div/div/input")).clear();
    driver.findElement(By.xpath("//div[@id='pane-0']/div[2]/div/div/div/input")).sendKeys("11");
    driver.findElement(By.xpath("//div[@id='pane-0']/div[3]/div/div/div/input")).click();
    driver.findElement(By.xpath("//div[@id='pane-0']/div[3]/div/div/div/input")).clear();
    driver.findElement(By.xpath("//div[@id='pane-0']/div[3]/div/div/div/input")).sendKeys("22");
    driver.findElement(By.xpath("//div[@id='pane-0']/div[4]/div/div/div/input")).click();
    driver.findElement(By.xpath("//div[@id='pane-0']/div[4]/div/div/div/input")).clear();
    driver.findElement(By.xpath("//div[@id='pane-0']/div[4]/div/div/div/input")).sendKeys("33");
    driver.findElement(By.xpath("//div[@id='pane-0']/div[5]/div/div/div/input")).click();
    driver.findElement(By.xpath("//div[@id='pane-0']/div[5]/div/div/div/input")).clear();
    driver.findElement(By.xpath("//div[@id='pane-0']/div[5]/div/div/div/input")).sendKeys("13234535555");
    driver.findElement(By.xpath("//div[@id='pane-0']/div[6]/div/div/div/input")).click();
    driver.findElement(By.xpath("//div[@id='pane-0']/div[6]/div/div/div/input")).clear();
    driver.findElement(By.xpath("//div[@id='pane-0']/div[6]/div/div/div/input")).sendKeys("44");
    driver.findElement(By.xpath("//div[@id='pane-0']/div[7]/div/div/div/div/input")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='取 消'])[1]/following::span[1]")).click();
    driver.findElement(By.xpath("//div[@id='pane-0']/div[8]/div/div/div/textarea")).click();
    driver.findElement(By.xpath("//div[@id='pane-0']/div[8]/div/div/div/textarea")).clear();
    driver.findElement(By.xpath("//div[@id='pane-0']/div[8]/div/div/div/textarea")).sendKeys("55");
    driver.findElement(By.id("tab-1")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='当前已输入6个字符, 您还可以输入9994个字符。'])[1]/following::button[1]")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div[2]/div[4]/div[2]/table/tbody/tr/td[6]/div/button[3]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='摘要:'])[1]/following::span[2]")).click();
  }
  //视频创作
  @Test
  public void videoCreation() throws Exception {
    driver.get("http://139.186.122.21/cpms-p/#/assign-material");
    driver.findElement(By.id("global-uploader-btn")).click();
    driver.findElement(By.xpath("//input[@type='file']")).clear();
    driver.findElement(By.xpath("//input[@type='file']")).sendKeys("");
    driver.findElement(By.xpath("//div[2]/div/div/input")).click();
    driver.findElement(By.xpath("//div[2]/div/div/input")).clear();
    driver.findElement(By.xpath("//div[2]/div/div/input")).sendKeys("11");
    driver.findElement(By.xpath("//div[3]/div/div/input")).click();
    driver.findElement(By.xpath("//div[3]/div/div/input")).clear();
    driver.findElement(By.xpath("//div[3]/div/div/input")).sendKeys("14343656789");
    driver.findElement(By.xpath("//div[4]/div/div/input")).click();
    driver.findElement(By.xpath("//div[4]/div/div/input")).clear();
    driver.findElement(By.xpath("//div[4]/div/div/input")).sendKeys("22");
    driver.findElement(By.xpath("//div[5]/div/div/div/input")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='取 消'])[1]/following::span[1]")).click();
    driver.findElement(By.xpath("//div[6]/div/div/input")).click();
    driver.findElement(By.xpath("//div[6]/div/div/input")).clear();
    driver.findElement(By.xpath("//div[6]/div/div/input")).sendKeys("33");
    driver.findElement(By.xpath("//textarea")).click();
    driver.findElement(By.xpath("//textarea")).clear();
    driver.findElement(By.xpath("//textarea")).sendKeys("44");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='摘要:'])[1]/following::button[1]")).click();
  }
  //视频报送
  @Test
  public void videoFile() throws Exception {
    driver.get("http://139.186.122.21/cpms-p/#/assign-material");
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div[2]/div[4]/div[2]/table/tbody/tr/td[6]/div/button[3]")).click();
    driver.findElement(By.xpath("//main/form/div[2]/div/div/div/input")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='党员教育二处 - 江廷认'])[1]/following::li[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='预览:'])[1]/following::span[1]")).click();
  }
  //删除
  @Test
  public void del() throws Exception {
    driver.get("http://139.186.122.21/cpms-p/#/assign-material");
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div[2]/div[4]/div[2]/table/tbody/tr[5]/td[6]/div/button[2]/i")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='取消'])[1]/following::span[1]")).click();
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
