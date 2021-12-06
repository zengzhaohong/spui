package contentmanagement.materiallib;

import org.openqa.selenium.WebDriver;

import common.BussinessLib;

public class MaterialBussiness {
	
//	public BussinessLib bslib;
	
	public BussinessLib bslib = new BussinessLib();
	public WebDriver driver = bslib.driver;
	
	@SuppressWarnings("static-access")
	public void keyWordQuery(String keyWord) {
		driver.findElement(bslib.parseObject(MaterialES.MAT_KEYWORD_TEXT)).clear();
		driver.findElement(bslib.parseObject(MaterialES.MAT_KEYWORD_TEXT)).click();
		driver.findElement(bslib.parseObject(MaterialES.MAT_KEYWORD_TEXT)).sendKeys(keyWord);
	}

}
