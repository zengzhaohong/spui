package contentmanagement.materiallib;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import common.BussinessLib;
import common.RobotKeyboard;

public class MaterialBussiness {
	
	
	private BussinessLib bslib = new BussinessLib();
	private static WebDriver driver;
	

	@SuppressWarnings("static-access")
	public void keyWordQuery(WebDriver p_driver,String keyWord) {
		driver = p_driver;
		driver.findElement(bslib.parseObject(MaterialES.MAT_KEYWORD_TEXT)).clear();
		driver.findElement(bslib.parseObject(MaterialES.MAT_KEYWORD_TEXT)).click();
		driver.findElement(bslib.parseObject(MaterialES.MAT_KEYWORD_TEXT)).sendKeys(keyWord);
	}

	@SuppressWarnings("static-access")
	public void uploadFile(WebDriver p_driver,String videoUrl,String p_name,String p_author,String p_phone,String unit,String p_figure,String p_abstract) {
		driver = p_driver;
		driver.findElement(bslib.parseObject(MaterialES.MAT_UPLOAD_BTN)).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		try {
			RobotKeyboard.getInstance().typeString(videoUrl);
			RobotKeyboard.getInstance().typeKey("Tab", 2);
			RobotKeyboard.getInstance().typeKey("Enter", 1);
		} catch (AWTException e) {
			e.printStackTrace();
		}
		
		driver.findElement(bslib.parseObject(MaterialES.MAT_VIDEO_NAME)).click();
		driver.findElement(bslib.parseObject(MaterialES.MAT_VIDEO_NAME)).clear();
		
		
		
		driver.findElement(bslib.parseObject(MaterialES.MAT_VIDEO_AUTHOR)).click();
		
		
		driver.findElement(bslib.parseObject(MaterialES.MAT_VIDEO_PHONE)).click();
		
		
		driver.findElement(bslib.parseObject(MaterialES.MAT_VIDEO_UNIT)).click();
		
		
		driver.findElement(bslib.parseObject(MaterialES.MAT_VIDEO_ACTIVITIES)).click();
		
		driver.findElement(bslib.parseObject(MaterialES.MAT_VIDEO_ACTIVITIES_VALUE)).click();
		
		
		driver.findElement(bslib.parseObject(MaterialES.MAT_VIDEO_FIGURE)).click();
		
		
		driver.findElement(bslib.parseObject(MaterialES.MAT_VIDEO_ABSTRACT)).clear();
		
		driver.findElement(bslib.parseObject(MaterialES.MAT_VIDEO_SUBMIT)).click();
	}
}
