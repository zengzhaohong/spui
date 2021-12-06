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
  
  //上传视频文件
  @Test
  public void UploadFile() throws Exception {
    driver.get("http://139.186.122.21/cpms-p/#/material-list");
    driver.findElement(By.id("global-uploader-btn")).click();
    driver.findElement(By.xpath("//input[@type='file']")).clear();
    driver.findElement(By.xpath("//input[@type='file']")).sendKeys("");
    driver.findElement(By.xpath("//main/form/div/div/div/input")).click();
    driver.findElement(By.xpath("//main/form/div/div/div/input")).clear();
    driver.findElement(By.xpath("//main/form/div/div/div/input")).sendKeys("小视频3");
    driver.findElement(By.xpath("//main/form/div[2]/div/div/input")).click();
    driver.findElement(By.xpath("//main/form/div[2]/div/div/input")).clear();
    driver.findElement(By.xpath("//main/form/div[2]/div/div/input")).sendKeys("作者");
    driver.findElement(By.xpath("//div[3]/div/div/input")).click();
    driver.findElement(By.xpath("//div[3]/div/div/input")).clear();
    driver.findElement(By.xpath("//div[3]/div/div/input")).sendKeys("13222222222");
    driver.findElement(By.xpath("//div[4]/div/div/input")).click();
    driver.findElement(By.xpath("//div[4]/div/div/input")).clear();
    driver.findElement(By.xpath("//div[4]/div/div/input")).sendKeys("上报单位");
    driver.findElement(By.xpath("//div[5]/div/div/div/input")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='上 传'])[1]/following::span[1]")).click();
    driver.findElement(By.xpath("//div[6]/div/div/input")).click();
    driver.findElement(By.xpath("//div[6]/div/div/input")).clear();
    driver.findElement(By.xpath("//div[6]/div/div/input")).sendKeys("主要人物");
    driver.findElement(By.xpath("//textarea")).click();
    driver.findElement(By.xpath("//textarea")).clear();
    driver.findElement(By.xpath("//textarea")).sendKeys("摘要");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='取 消'])[1]/following::span[1]")).click();
    driver.findElement(By.xpath("//div[@id='global-uploader']/div/div[3]/div/div/div/button/span/i")).click();
  }
  
  //编辑视频素材
  @Test
  public void editVideoMaterial() throws Exception {
    driver.get("http://139.186.122.21/cpms-p/#/material-list");
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div[2]/div[4]/div[2]/table/tbody/tr/td[8]/div/button")).click();
    driver.findElement(By.xpath("//main/form/div/div/div/input")).click();
    driver.findElement(By.xpath("//main/form/div/div/div/input")).clear();
    driver.findElement(By.xpath("//main/form/div/div/div/input")).sendKeys("小视频1");
    driver.findElement(By.xpath("//main/form/div[2]/div/div/input")).click();
    driver.findElement(By.xpath("//main/form/div[2]/div/div/input")).clear();
    driver.findElement(By.xpath("//main/form/div[2]/div/div/input")).sendKeys("作者1");
    driver.findElement(By.xpath("//div[3]/div/div/input")).click();
    driver.findElement(By.xpath("//div[3]/div/div/input")).clear();
    driver.findElement(By.xpath("//div[3]/div/div/input")).sendKeys("13222222223");
    driver.findElement(By.xpath("//div[4]/div/div/input")).click();
    driver.findElement(By.xpath("//div[4]/div/div/input")).clear();
    driver.findElement(By.xpath("//div[4]/div/div/input")).sendKeys("上报单位1");
    driver.findElement(By.xpath("//div[5]/div/div/div/input")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='返回'])[1]/following::span[1]")).click();
    driver.findElement(By.xpath("//div[6]/div/div/input")).click();
    driver.findElement(By.xpath("//div[6]/div/div/input")).clear();
    driver.findElement(By.xpath("//div[6]/div/div/input")).sendKeys("主要人物1");
    driver.findElement(By.xpath("//textarea")).click();
    driver.findElement(By.xpath("//textarea")).clear();
    driver.findElement(By.xpath("//textarea")).sendKeys("摘要1");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='预览:'])[1]/following::span[1]")).click();
  }
  
  //编辑文稿素材
  @Test
  public void editTextMaterial() throws Exception {
    driver.get("http://139.186.122.21/cpms-p/#/material-list");
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div[2]/div[4]/div[2]/table/tbody/tr[2]/td[8]/div/button/span")).click();
    driver.findElement(By.xpath("//div[@id='pane-0']/div/div/div/div/input")).click();
    driver.findElement(By.xpath("//div[@id='pane-0']/div/div/div/div/input")).clear();
    driver.findElement(By.xpath("//div[@id='pane-0']/div/div/div/div/input")).sendKeys("党员教育二处1");
    driver.findElement(By.xpath("//div[@id='pane-0']/div[2]/div/div/div/input")).click();
    driver.findElement(By.xpath("//div[@id='pane-0']/div[2]/div/div/div/input")).clear();
    driver.findElement(By.xpath("//div[@id='pane-0']/div[2]/div/div/div/input")).sendKeys("长度");
    driver.findElement(By.xpath("//div[@id='pane-0']/div[3]/div/div/div/input")).click();
    driver.findElement(By.xpath("//div[@id='pane-0']/div[3]/div/div/div/input")).clear();
    driver.findElement(By.xpath("//div[@id='pane-0']/div[3]/div/div/div/input")).sendKeys("123456");
    driver.findElement(By.xpath("//div[@id='pane-0']/div[4]/div/div/div/input")).click();
    driver.findElement(By.xpath("//div[@id='pane-0']/div[4]/div/div/div/input")).clear();
    driver.findElement(By.xpath("//div[@id='pane-0']/div[4]/div/div/div/input")).sendKeys("321");
    driver.findElement(By.xpath("//div[@id='pane-0']/div[5]/div/div/div/input")).click();
    driver.findElement(By.xpath("//div[@id='pane-0']/div[5]/div/div/div/input")).clear();
    driver.findElement(By.xpath("//div[@id='pane-0']/div[5]/div/div/div/input")).sendKeys("13222222224");
    driver.findElement(By.xpath("//div[@id='pane-0']/div[6]/div/div/div/input")).click();
    driver.findElement(By.xpath("//div[@id='pane-0']/div[6]/div/div/div/input")).clear();
    driver.findElement(By.xpath("//div[@id='pane-0']/div[6]/div/div/div/input")).sendKeys("12344");
    driver.findElement(By.xpath("//div[@id='pane-0']/div[7]/div/div/div/div/input")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='取 消'])[1]/following::span[1]")).click();
    driver.findElement(By.xpath("//div[@id='pane-0']/div[8]/div/div/div/textarea")).click();
    driver.findElement(By.xpath("//div[@id='pane-0']/div[8]/div/div/div/textarea")).clear();
    driver.findElement(By.xpath("//div[@id='pane-0']/div[8]/div/div/div/textarea")).sendKeys("123456666");
    driver.findElement(By.id("tab-1")).click();
    //保存按钮
//    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='字数统计'])[1]/following::span[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='当前已输入13个字符, 您还可以输入9987个字符。'])[1]/following::span[1]")).click();
  }

  //移动目录
  @Test
  public void moveMaterial() throws Exception {
    driver.get("http://139.186.122.21/cpms-p/#/material-list");
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div[2]/div[4]/div[2]/table/tbody/tr/td[8]/div/button[2]/span")).click();
    driver.findElement(By.xpath("//main/form/div/div/div/div/input")).click();
    driver.findElement(By.xpath("//div/div/label/span/span")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='文件目录:'])[1]/following::button[1]")).click();
  }
  
  //报送
  @Test
  public void submittedMaterial() throws Exception {
    driver.get("http://139.186.122.21/cpms-p/#/material-list");
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div[2]/div[4]/div[2]/table/tbody/tr/td[8]/div/button[3]/i")).click();
    driver.findElement(By.xpath("//div[2]/div/div/div/input")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='党员教育二处 - 黄启年'])[1]/following::li[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='预览:'])[1]/following::button[1]")).click();
  }
  
  //删除
  @Test
  public void deleteMaterial() throws Exception {
    driver.get("http://139.186.122.21/cpms-p/#/material-list");
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div[2]/div[4]/div[2]/table/tbody/tr/td[8]/div/button[3]/span")).click();
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

