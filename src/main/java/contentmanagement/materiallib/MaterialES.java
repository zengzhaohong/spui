package contentmanagement.materiallib;

import common.ElementStore;

public class MaterialES extends ElementStore{
	
	public static final String KEYWORD_TEXT = "//div[@id='app']/div/div[2]/section/section/main/div/form/div[2]/div/div/input";
	
	public static final String TYPEQUERY_BOX = "//div[@id='app']/div/div[2]/section/section/main/div/form/div[3]/div/div/div/input";
	public static final String TYPEQUERY_VIDEO = "(.//*[normalize-space(text()) and normalize-space(.)='音频'])[3]/following::span[1]";

	public static final String SOURCEQUERY_BOX = "//div[@id='app']/div/div[2]/section/section/main/div/form/div[3]/div/div/div/input";
	public static final String SOURCEQUERY_KUAIBIAN = "(.//*[normalize-space(text()) and normalize-space(.)='原始'])[25]/following::li[1]";

	public static final String QUERY_BTN = "//div[@id='app']/div/div[2]/section/section/main/div/form/div[5]/div/button";
	public static final String RESET_BTN = "//div[@id='app']/div/div[2]/section/section/main/div/form/div[6]/div/button";





}
