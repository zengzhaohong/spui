package common;

public class ElementStore {
	//登录
	public static final String LOGIN_USERNAME = "//input[@type='text']";
	public static final String LOGIN_PWD = "//*[@id=\"app\"]/div/div[2]/div/div/div/form/div[2]/div/div/input";
	public static final String LOGIN_BTN = "//div[@id='app']/div/div[2]/div/div/div/form/div[4]/div/div";
	
	public static final String GLSC_TAB = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='发布系统'])[1]/following::div[4]";
	public static final String GLSH_TAB = "//div[@id='app']/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div";
	public static final String GLFB_TAB = "//div[@id='app']/div/div[2]/div/div/div/form/div[4]/div/div";
	
	//内容管理
	public static final String CONTENT_MANAGEMENT_TAB = "//div[@id='app']/div/div/div/div/div/ul/div[3]/li/div";
	//素材库菜单
	public static final String MATERIAL_LIB_TAB = "//div[@id='app']/div/div/div/div/div/ul/div[3]/li/ul/div/a/li";
	
	
}
