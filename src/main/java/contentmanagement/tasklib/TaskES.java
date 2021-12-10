package contentmanagement.tasklib;

import common.ElementStore;

public class TaskES extends ElementStore {
	//任务库内容管理入口
	public static final String TAS_TASK = "//div[@id='app']/div/div/div/div/div/ul/div[3]/li/div/span";
	//任务库菜单
	public static final String TAS_TASK_HOME = "//div[@id='app']/div/div/div/div/div/ul/div[3]/li/ul/div[2]/a/li";
	//名称查询输入框
	public static final String TAS_NAME_QUERY_INPUT = "//div[@id='app']/div/div[2]/section/section/main/div/form/div/div/div/input";
	//查询按钮
	public static final String TAS_QUERY_BUTTON = "//div[@id='app']/div/div[2]/section/section/main/div/form/div[4]/div/button/span";
	//类型选择框
	public static final String TAS_TYPE_SELECTION = "//div[@id='app']/div/div[2]/section/section/main/div/form/div[2]/div/div/div/input";
	//选择视频类型
	public static final String TAS_VIDEO_TYPE = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='音频'])[1]/following::li[1]";
	//图文类型选择
	public static final String TAS_GRAPHIC_TYPE = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='视频'])[1]/following::li[1]";
	//任务主题选择框
	public static final String TAS_TASK_TOPIC = "//div[@id='app']/div/div[2]/section/section/main/div/form/div[3]/div/div/div/input";
	//选择任务主题查询
	public static final String TAS_SELECT_TASK = "xpath=(.//*[normalize-space(text()) and normalize-space(.)=concat('vjhgf', \\\"'\\\", '')])[1]/following::li[1]";
	//重置按钮
	public static final String TAS_RESET_BUTTON = "//div[@id='app']/div/div[2]/section/section/main/div/form/div[4]/div/button[2]";
	//文稿创作按钮
	public static final String TAS_LITERARY_CREATION = "//div[@id='app']/div/div[2]/section/section/main/div/div/button/span";
	//文稿标题
	public static final String TAS_DOCUMENT_TITLE = "//div[@id='pane-0']/div[2]/div/div/div/input";
	//相关人物
	public static final String TAS_RELEVANT = "//div[@id='pane-0']/div[3]/div/div/div/input";
	//作者
	public static final String TAS_AUTHOR = "//div[@id='pane-0']/div[4]/div/div/div/input";
	//联系电话
	public static final String TAS_PHONE = "//div[@id='pane-0']/div[5]/div/div/div/input";
	//上报单位
	public static final String TAS_REPORT_UNIT = "//div[@id='pane-0']/div[6]/div/div/div/input";
	//任务主题选择框
	public static final String TAS_TASK_THEME_BOX = "//div[@id='pane-0']/div[7]/div/div/div/div/input";
	//选择任务主题
	public static final String TAS_CHOOSE_THEME = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='取 消'])[1]/following::span[1]";
	//摘要
	public static final String TAS_ABSTRACT = "//div[@id='pane-0']/div[8]/div/div/div/textarea";
	//主体内容
	public static final String TAS_CONTENT = "id=tab-1";
	//输入内容和保存
	public static final String TAS_THE_CONTENTS = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='当前已输入6个字符, 您还可以输入9994个字符。'])[1]/following::button[1]";
	//报送
	public static final String TAS_SUBMISSION = "//div[@id='app']/div/div[2]/section/section/main/div[2]/div[4]/div[2]/table/tbody/tr/td[6]/div/button[3]";
	//提交审核
	public static final String TAS_SUBMIT_AUDIT = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='摘要:'])[1]/following::span[2]";
	//上传文件
	public static final String TAS_UPLOAD_FILE = "id=global-uploader-btn";
	//视频作者
	public static final String TAS_VIDEO_AUTHOR = "//div[2]/div/div/input";
	//文件路径
	public static final String TAS_FILE_PATH = "//input[@type='file']";
	//视频作者手机号
	public static final String TAS_VIDEO_PHONE = "//div[3]/div/div/input";
	//视频上报单位
	public static final String TAS_VIDEO_REPORT = "//div[4]/div/div/input";
	//视频任务主题选择框
	public static final String TAS_CORE_TASKS = "//div[5]/div/div/div/input";
	//选择任务主题
	public static final String TAS_SELECT_TASK_TOPIC = "(.//*[normalize-space(text()) and normalize-space(.)='取 消'])[1]/following::span[1]";
	//视频主要人物
	public static final String TAS_CHARACTES = "//div[6]/div/div/input";
	//视频摘要
	public static final String TAS_VIDEO_ADSTRACT = "//textarea";
	//上传按钮
	public static final String TAS_UPLOAD_VUDEO = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='摘要:'])[1]/following::button[1]";
	//视频报送按钮
	public static final String TAS_VIDEO_FILE = "//div[@id='app']/div/div[2]/section/section/main/div[2]/div[4]/div[2]/table/tbody/tr/td[6]/div/button[3]";
	//视频初审人选择框
	public static final String TAS_CHOOSE_LOUD = "//main/form/div[2]/div/div/div/input";
	//选择审核人
	public static final String TAS_VERIFIER = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='党员教育二处 - 江廷认'])[1]/following::li[1]";
	//审核确认
	public static final String TAS_NOTARIZE = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='预览:'])[1]/following::span[1]";
	//删除按钮
	public static final String TAS_DEL = "//div[@id='app']/div/div[2]/section/section/main/div[2]/div[4]/div[2]/table/tbody/tr[5]/td[6]/div/button[2]/i";
	//确认删除
	public static final String TAS_CONFIRM_DELETE = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='取消'])[1]/following::span[1]";
//	//
//	public static final String TAS_
//	//
//	public static final String TAS_
//	//
//	public static final String TAS_

}
