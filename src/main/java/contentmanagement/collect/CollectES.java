package contentmanagement.collect;

import common.ElementStore;

public class CollectES extends ElementStore {
	//名称输入框
	public static final String COL_NAME_TEXT = "//div[@id='app']/div/div[2]/section/section/main/div/form/div/div/div/input";
	//查询按钮
	public static final String COL_QUERY_BUTTON = "//div[@id='app']/div/div[2]/section/section/main/div/form/div[3]/div/button/span";
	//类型选择框
	public static final String COL_TYPE_SELWCTION_BOX = "//div[@id='app']/div/div[2]/section/section/main/div/form/div[2]/div/div/div/span/span/i";
	//视频类型
	public static final String COL_VIDEO_TYPE = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='音频'])[1]/following::span[1]";
	//重置按钮
	public static final String COL_RESET_BUTTON = "//div[@id='app']/div/div[2]/section/section/main/div/form/div[3]/div/button[2]/span";
	//其他类型
	public static final String COL_OTHER_TYPE = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='前往页'])[1]/following::li[1]";
	//图文类型
	public static final String COL_IMAGE_TEXT = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='视频'])[1]/following::li[1]";
	//文稿创作按钮
	public static final String COL_MANUSCRIPT = "//div[@id='app']/div/div[2]/section/section/main/div/div/button/span";
	//文稿标题
	public static final String COL_DOCUMENT = "//div[@id='pane-0']/div[2]/div/div/div/input";
	//相关人物
	public static final String COL_RELEVANT = "//div[@id='pane-0']/div[3]/div/div/div/input";
	//作者
	public static final String COL_WRITER = "//div[@id='pane-0']/div[4]/div/div/div/input"
	;//联系电话
	public static final String COL_PHONE= "//div[@id='pane-0']/div[5]/div/div/div/input";
	//上报单位
	public static final String COL_REPORT = "//div[@id='pane-0']/div[6]/div/div/div/input";
	//征稿活动
	public static final String COL_CONTRIBUTIONS = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='取 消'])[1]/following::span[1]";
	//征稿摘要
	public static final String COL_ADSTRACT = "//div[@id='pane-0']/div[8]/div/div/div/textarea";
	//主体内容
	public static final String COL_SUDJECT = "id=tab-1";
	//主体内容填写后确认
	public static final String COL_FILLOUT = "(.//*[normalize-space(text()) and normalize-space(.)='当前已输入5个字符, 您还可以输入9995个字符。'])[1]/following::button[1]";
	//上传文件
	public static final String COL_UPLOAD = "id=global-uploader-btn";
	//选择文件
	public static final String COL_VIDEO = "//input[@type='file";
	//视频摘要
	public static final String COL_VIDEO_ABSTRACTION = "//textarea";
	//上传
	public static final String COL_UPLOADING = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='摘要:'])[1]/following::span[1]";
	//视频编辑按钮
	public static final String COL_EDITING = "//div[@id='app']/div/div[2]/section/section/main/div[2]/div[4]/div[2]/table/tbody/tr/td[5]/div/button/i";
	//编辑保存
	public static final String COL_EDITORS_SAVE = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='预览:'])[1]/following::span[1]";
	//文稿编辑按钮
	public static final String COL_EDIT_BUTTON = "//div[@id='app']/div/div[2]/section/section/main/div[2]/div[4]/div[2]/table/tbody/tr[4]/td[5]/div/button/span";
	//编辑保存
	public static final String COL_DOCUMENT_SAVE = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='当前已输入6个字符, 您还可以输入9994个字符。'])[1]/following::button[1]";
	//删除按钮
	public static final String COL_DELETE_BUTTON = "//div[@id='app']/div/div[2]/section/section/main/div[2]/div[4]/div[2]/table/tbody/tr[2]/td[5]/div/button[3]/span";
	//确认删除按钮
	public static final String COL_CONFIRM_DELETE = "(.//*[normalize-space(text()) and normalize-space(.)='取消'])[1]/following::span[1]";
	//视频报送按钮
	public static final String COL_SUBMISSION = "//div[@id='app']/div/div[2]/section/section/main/div[2]/div[4]/div[2]/table/tbody/tr/td[5]/div/button[2]/span";
	//初审人
	public static final String COL_FIRST_TRIAL = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='党员教育二处 - 黄启年'])[1]/following::li[1]";
	//视频确认报送
	public static final String COL_AFFIRM = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='预览:'])[1]/following::span[1]";
	//文稿报送按钮
	public static final String COL_MANUSCRIPTS = "//div[@id='app']/div/div[2]/section/section/main/div[2]/div[4]/div[2]/table/tbody/tr[4]/td[5]/div/button[2]/";
	//文稿确认报送
	public static final String COL_NOTARIZE = "(.//*[normalize-space(text()) and normalize-space(.)='摘要:'])[1]/following::span[2]";
	//
	//public static final String COL_
}
