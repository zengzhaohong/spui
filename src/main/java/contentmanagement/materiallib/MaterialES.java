package contentmanagement.materiallib;

import common.ElementStore;

public class MaterialES extends ElementStore{
	
	public static final String MAT_KEYWORD_TEXT = "//div[@id='app']/div/div[2]/section/section/main/div/form/div[2]/div/div/input";
	
	public static final String MAT_TYPEQUERY_BOX = "//div[@id='app']/div/div[2]/section/section/main/div/form/div[3]/div/div/div/input";
	public static final String TYPEQUERY_VIDEO = "(.//*[normalize-space(text()) and normalize-space(.)='音频'])[3]/following::span[1]";

	public static final String MAT_SOURCEQUERY_BOX = "//div[@id='app']/div/div[2]/section/section/main/div/form/div[3]/div/div/div/input";
	public static final String MAT_SOURCEQUERY_KUAIBIAN = "(.//*[normalize-space(text()) and normalize-space(.)='原始'])[25]/following::li[1]";

	public static final String MAT_QUERY_BTN = "//div[@id='app']/div/div[2]/section/section/main/div/form/div[5]/div/button";
	public static final String MAT_RESET_BTN = "//div[@id='app']/div/div[2]/section/section/main/div/form/div[6]/div/button";

	//上传文件按钮
	public static final String MAT_UPLOAD_BTN = "id=global-uploader-btn";
	
	//上传视频信息弹窗（编辑的与新增的为同样路径）
	public static final String MAT_VIDEO_NAME = "//main/form/div/div/div/input";
	public static final String MAT_VIDEO_AUTHOR = "//main/form/div[2]/div/div/input";
	public static final String MAT_VIDEO_PHONE = "//div[3]/div/div/input";
	public static final String MAT_VIDEO_UNIT = "//div[4]/div/div/input";
	public static final String MAT_VIDEO_ACTIVITIES = "//div[5]/div/div/div/input";
	public static final String MAT_VIDEO_ACTIVITIES_VALUE = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='上 传'])[1]/following::span[1]"; 
	//相关人物
	public static final String MAT_VIDEO_FIGURE = "//div[6]/div/div/input";
	public static final String MAT_VIDEO_ABSTRACT = "//textarea";
	public static final String MAT_VIDEO_SUBMIT = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='取 消'])[1]/following::span[1]";
	//上传列表
	public static final String MAT_CLOSE_LIST = "//div[@id='global-uploader']/div/div[3]/div/div/div/button/span/i";
	
	
	
	//编辑(编辑是不是要先判断类型，在找到对应的操作按钮xpath)
	public static final String MAT_EDIT_BTN = "//div[@id='app']/div/div[2]/section/section/main/div[2]/div[4]/div[2]/table/tbody/tr/td[8]/div/button";
	
	//编辑文稿素材信息窗口
	public static final String MAT_CONTENT_SOURCESTEXT_NAME = "//div[@id='pane-0']/div/div/div/div/input";
	public static final String MAT_TEXT_NAME = "//div[@id='pane-0']/div[2]/div/div/div/input";
	public static final String MAT_TEXT_FIGURE = "//div[@id='pane-0']/div[3]/div/div/div/input";
	public static final String MAT_TEXT_AUTHOR = "//div[@id='pane-0']/div[4]/div/div/div/input";
	public static final String MAT_TEXT_PHONE = "//div[@id='pane-0']/div[5]/div/div/div/input";
	public static final String MAT_TEXT_UNIT = "//div[@id='pane-0']/div[6]/div/div/div/input";
	public static final String MAT_TEXT_ACTIVITIES = "//div[@id='pane-0']/div[7]/div/div/div/div/input";
	public static final String MAT_TEXT_ACTIVITIES_VALUE = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='取 消'])[1]/following::span[1]";
	public static final String MAT_TEXT_ABSTRACT = "//div[@id='pane-0']/div[8]/div/div/div/textarea";
	public static final String MAT_TEXT_SUBMIT = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='字数统计'])[1]/following::span[1]";
	
	//移动
	public static final String MAT_MV_BTN = "//div[@id='app']/div/div[2]/section/section/main/div[2]/div[4]/div[2]/table/tbody/tr/td[8]/div/button[2]/span";
	public static final String MAT_MV_SELECT_BOX = "//main/form/div/div/div/div/input";
	public static final String MAT_MV_SELECT_VALUE = "//div/div/label/span/span";
	public static final String MAT_MV_SUBMIT = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='文件目录:'])[1]/following::button[1]";
	
	//报送
	public static final String MAT_SUBMISSION_BTN = "//div[@id='app']/div/div[2]/section/section/main/div[2]/div[4]/div[2]/table/tbody/tr/td[8]/div/button[3]/i";
	public static final String MAT_AUDITOR_BOX = "//div[2]/div/div/div/input";
	public static final String MAT_AUDITOR_VALUE = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='党员教育二处 - 黄启年'])[1]/following::li[1]";
	public static final String MAT_SUBMISSION_SUBMIT = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='预览:'])[1]/following::button[1]";

	//删除
	public static final String MAT_DEL_BTN = "//div[@id='app']/div/div[2]/section/section/main/div[2]/div[4]/div[2]/table/tbody/tr/td[8]/div/button[3]/span";
	public static final String MAT_DEL_SUBMIT = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='取消'])[1]/following::span[1]";
//	public static final String MAT_
//	public static final String MAT_
//	public static final String MAT_
//	public static final String MAT_
//	public static final String MAT_
//	public static final String MAT_
//	public static final String MAT_
//	public static final String MAT_
//	public static final String MAT_
//	public static final String MAT_



}
