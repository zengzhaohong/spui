package contentmanagement.collect;


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

	  public class CollectLib {
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
	  //进入社会征集页面
	  @Test
	  public void collectPage() throws Exception {
	    driver.get("http://139.186.122.21/cpms-p/#/viewmore");
	    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/ul/div[3]/li/div/span")).click();
	    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/ul/div[3]/li/ul/div[4]/a/li/span")).click();
	  }
	  //名称查询
	  @Test
	  public void nameQuery() throws Exception {
	    driver.get("http://139.186.122.21/cpms-p/#/essay-material");
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/form/div/div/div/input")).click();
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/form/div/div/div/input")).clear();
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/form/div/div/div/input")).sendKeys("新");
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/form/div[3]/div/button/span")).click();
	  }
	  //类型查询
	  @Test
	  public void typeQuery() throws Exception {
		  //视频查询
	    driver.get("http://139.186.122.21/cpms-p/#/essay-material");
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/form/div[2]/div/div/div/span/span/i")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='音频'])[1]/following::span[1]")).click();
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/form/div[3]/div/button/span")).click();
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/form/div[3]/div/button[2]/span")).click();	 
	    //其他查询
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/form/div[2]/div/div/div/input")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='前往页'])[1]/following::li[1]")).click();
	    //图文查询
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/form/div[2]/div/div/div/input")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='视频'])[1]/following::li[1]")).click();
	  }
	  //文稿创作
	  @Test
	  public void iteraryCreation() throws Exception {
	    driver.get("http://139.186.122.21/cpms-p/#/essay-material");
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div/div/button/span")).click();
	    driver.findElement(By.xpath("//div[@id='pane-0']/div[2]/div/div/div/input")).click();
	    driver.findElement(By.xpath("//div[@id='pane-0']/div[2]/div/div/div/input")).clear();
	    driver.findElement(By.xpath("//div[@id='pane-0']/div[2]/div/div/div/input")).sendKeys("测试");
	    driver.findElement(By.xpath("//div[@id='pane-0']/div[3]/div/div/div/input")).click();
	    driver.findElement(By.xpath("//div[@id='pane-0']/div[3]/div/div/div/input")).clear();
	    driver.findElement(By.xpath("//div[@id='pane-0']/div[3]/div/div/div/input")).sendKeys("11");
	    driver.findElement(By.xpath("//div[@id='pane-0']/div[4]/div/div/div/input")).click();
	    driver.findElement(By.xpath("//div[@id='pane-0']/div[4]/div/div/div/input")).clear();
	    driver.findElement(By.xpath("//div[@id='pane-0']/div[4]/div/div/div/input")).sendKeys("22");
	    driver.findElement(By.xpath("//div[@id='pane-0']/div[5]/div/div/div/input")).click();
	    driver.findElement(By.xpath("//div[@id='pane-0']/div[5]/div/div/div/input")).clear();
	    driver.findElement(By.xpath("//div[@id='pane-0']/div[5]/div/div/div/input")).sendKeys("14343535636");
	    driver.findElement(By.xpath("//div[@id='pane-0']/div[6]/div/div/div/input")).click();
	    driver.findElement(By.xpath("//div[@id='pane-0']/div[6]/div/div/div/input")).clear();
	    driver.findElement(By.xpath("//div[@id='pane-0']/div[6]/div/div/div/input")).sendKeys("33");
	    driver.findElement(By.xpath("//div[@id='pane-0']/div[7]/div/div/div/div/input")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='取 消'])[1]/following::span[1]")).click();
	    driver.findElement(By.xpath("//div[@id='pane-0']/div[8]/div/div/div/textarea")).click();
	    driver.findElement(By.xpath("//div[@id='pane-0']/div[8]/div/div/div/textarea")).clear();
	    driver.findElement(By.xpath("//div[@id='pane-0']/div[8]/div/div/div/textarea")).sendKeys("33");
	    driver.findElement(By.id("tab-1")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='当前已输入5个字符, 您还可以输入9995个字符。'])[1]/following::button[1]")).click();
	  }
	  //上传视频
	  @Test
	  public void uploadVideo() throws Exception {
	    driver.get("http://139.186.122.21/cpms-p/#/essay-material");
	    driver.findElement(By.id("global-uploader-btn")).click();
	    driver.findElement(By.xpath("//input[@type='file']")).clear();
	    driver.findElement(By.xpath("//input[@type='file']")).sendKeys("");
	    driver.findElement(By.xpath("//div[2]/div/div/input")).click();
	    driver.findElement(By.xpath("//div[2]/div/div/input")).clear();
	    driver.findElement(By.xpath("//div[2]/div/div/input")).sendKeys("测试");
	    driver.findElement(By.xpath("//div[3]/div/div/input")).click();
	    driver.findElement(By.xpath("//div[3]/div/div/input")).clear();
	    driver.findElement(By.xpath("//div[3]/div/div/input")).sendKeys("13342424525");
	    driver.findElement(By.xpath("//div[4]/div/div/input")).click();
	    driver.findElement(By.xpath("//div[4]/div/div/input")).clear();
	    driver.findElement(By.xpath("//div[4]/div/div/input")).sendKeys("22");
	    driver.findElement(By.xpath("//div[5]/div/div/div/input")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='取 消'])[1]/following::span[1]")).click();
	    driver.findElement(By.xpath("//div[6]/div/div/input")).click();
	    driver.findElement(By.xpath("//div[6]/div/div/input")).clear();
	    driver.findElement(By.xpath("//div[6]/div/div/input")).sendKeys("22");
	    driver.findElement(By.xpath("//textarea")).click();
	    driver.findElement(By.xpath("//textarea")).clear();
	    driver.findElement(By.xpath("//textarea")).sendKeys("22");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='摘要:'])[1]/following::span[1]")).click();
	  }
	  //视频编辑
	  @Test
	  public void videoEditing() throws Exception {
	    driver.get("http://139.186.122.21/cpms-p/#/essay-material");
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div[2]/div[4]/div[2]/table/tbody/tr/td[5]/div/button/i")).click();
	    driver.findElement(By.xpath("//main/form/div/div/div/input")).click();
	    driver.findElement(By.xpath("//main/form/div/div/div/input")).clear();
	    driver.findElement(By.xpath("//main/form/div/div/div/input")).sendKeys("校园安全-乘船有危险吗1");
	    driver.findElement(By.xpath("//div[2]/div/div/input")).click();
	    driver.findElement(By.xpath("//div[2]/div/div/input")).clear();
	    driver.findElement(By.xpath("//div[2]/div/div/input")).sendKeys("测试2");
	    driver.findElement(By.xpath("//div[3]/div/div/input")).click();
	    driver.findElement(By.xpath("//div[3]/div/div/input")).click();
	    driver.findElement(By.xpath("//div[3]/div/div/input")).clear();
	    driver.findElement(By.xpath("//div[3]/div/div/input")).sendKeys("13342424533");
	    driver.findElement(By.xpath("//div[4]/div/div/input")).click();
	    driver.findElement(By.xpath("//div[4]/div/div/input")).clear();
	    driver.findElement(By.xpath("//div[4]/div/div/input")).sendKeys("2233");
	    driver.findElement(By.xpath("//div[5]/div/div/div/input")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='返回'])[1]/following::li[1]")).click();
	    driver.findElement(By.xpath("//div[6]/div/div/input")).click();
	    driver.findElement(By.xpath("//div[6]/div/div/input")).clear();
	    driver.findElement(By.xpath("//div[6]/div/div/input")).sendKeys("2244");
	    driver.findElement(By.xpath("//textarea")).click();
	    driver.findElement(By.xpath("//textarea")).clear();
	    driver.findElement(By.xpath("//textarea")).sendKeys("2255");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='预览:'])[1]/following::span[1]")).click();
	  }
	  //文稿编辑
	  @Test
	  public void editing() throws Exception {
	    driver.get("http://139.186.122.21/cpms-p/#/essay-material");
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div[2]/div[4]/div[2]/table/tbody/tr[4]/td[5]/div/button/span")).click();
	    driver.findElement(By.xpath("//div[@id='pane-0']/div[2]/div/div/div/input")).click();
	    driver.findElement(By.xpath("//div[@id='pane-0']/div[2]/div/div/div/input")).clear();
	    driver.findElement(By.xpath("//div[@id='pane-0']/div[2]/div/div/div/input")).sendKeys("b73e11");
	    driver.findElement(By.xpath("//div[@id='pane-0']/div[3]/div/div/div/input")).click();
	    driver.findElement(By.xpath("//div[@id='pane-0']/div[3]/div/div/div/input")).clear();
	    driver.findElement(By.xpath("//div[@id='pane-0']/div[3]/div/div/div/input")).sendKeys("相关人物1");
	    driver.findElement(By.xpath("//div[@id='pane-0']/div[4]/div/div/div/input")).click();
	    driver.findElement(By.xpath("//div[@id='pane-0']/div[4]/div/div/div/input")).clear();
	    driver.findElement(By.xpath("//div[@id='pane-0']/div[4]/div/div/div/input")).sendKeys("作者1");
	    driver.findElement(By.xpath("//div[@id='pane-0']/div[8]/div/div/div/textarea")).click();
	    driver.findElement(By.xpath("//div[@id='pane-0']/div[8]/div/div/div/textarea")).clear();
	    driver.findElement(By.xpath("//div[@id='pane-0']/div[8]/div/div/div/textarea")).sendKeys("摘要1");
	    driver.findElement(By.id("tab-1")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='当前已输入6个字符, 您还可以输入9994个字符。'])[1]/following::button[1]")).click();
	  }
	  //视频删除
	  @Test
	  public void videoDelete() throws Exception {
	    driver.get("http://139.186.122.21/cpms-p/#/essay-material");
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div[2]/div[4]/div[2]/table/tbody/tr[2]/td[5]/div/button[3]/span")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='取消'])[1]/following::span[1]")).click();
	  }
	  //删除文稿
	  @Test
	  public void manuscriptsDelete() throws Exception {
	    driver.get("http://139.186.122.21/cpms-p/#/essay-material");
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div[2]/div[4]/div[2]/table/tbody/tr[3]/td[5]/div/button[3]/span")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='取消'])[1]/following::span[1]")).click();
	  }
	  //视频报送
	  @Test
	  public void vdeoFile() throws Exception {
	    driver.get("http://139.186.122.21/cpms-p/#/essay-material");
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div[2]/div[4]/div[2]/table/tbody/tr/td[5]/div/button[2]/span")).click();
	    driver.findElement(By.xpath("//main/form/div[2]/div/div/div/span/span/i")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='党员教育二处 - 黄启年'])[1]/following::li[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='预览:'])[1]/following::span[1]")).click();
	  }
	  //文稿报送
	  @Test
	  public void manuscriptsSubmittede() throws Exception {
	    driver.get("http://139.186.122.21/cpms-p/#/essay-material");
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/section/section/main/div[2]/div[4]/div[2]/table/tbody/tr[4]/td[5]/div/button[2]/i")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='摘要:'])[1]/following::span[2]")).click();
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

