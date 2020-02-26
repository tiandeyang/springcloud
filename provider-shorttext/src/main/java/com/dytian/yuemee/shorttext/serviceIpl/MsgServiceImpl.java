package com.dytian.yuemee.shorttext.serviceIpl;



import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.dytian.yuemee.shorttext.service.MsgService;
import org.nutz.json.Json;
import org.springframework.stereotype.Service;

@Service
public class MsgServiceImpl implements MsgService {

	private String user = "xvsx@bjsxw";
	private String password = "00NApJgD";

	private String urlString = "http://211.147.239.62:9050/cgi-bin/sendsms?";


	@Override
	public String sendMsg(String phone, String content) throws Exception {

		//设置超时时间-可自行调整
		System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
		System.setProperty("sun.net.client.defaultReadTimeout", "10000");
//初始化ascClient需要的几个参数
		final String product = "Dysmsapi";//短信API产品名称（短信产品名固定，无需修改）
		final String domain = "dysmsapi.aliyuncs.com";//短信API产品域名（接口地址固定，无需修改）
//替换成你的AK
		final String accessKeyId = "bakLTAIbakQAiWQ9wbhGtZ";//你的accessKeyId,
		final String accessKeySecret = "bakeMbakbak7Fc3UbakbakIGpb9cbakgbakM0bakMkbakl2Ftpebak94qr0M";//你的accessKeySecret，参考本文档步骤2
//初始化ascClient,暂时不支持多region（请勿修改）
		IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId,
				accessKeySecret);
		DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
		IAcsClient acsClient = new DefaultAcsClient(profile);
		//组装请求对象
		SendSmsRequest request = new SendSmsRequest();
		//使用post提交
		request.setMethod(MethodType.POST);
		//必填:待发送手机号。支持以逗号分隔的形式进行批量调用，批量上限为1000个手机号码,批量调用相对于单条调用及时性稍有延迟,验证码类型的短信推荐使用单条调用的方式；发送国际/港澳台消息时，接收号码格式为00+国际区号+号码，如“0085200000000”
		request.setPhoneNumbers(phone);
		//必填:短信签名-可在短信控制台中找到
		request.setSignName("阅米");
		//必填:短信模板-可在短信控制台中找到
		request.setTemplateCode("SMS_126890097");
		//可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
		//友情提示:如果JSON中需要带换行符,请参照标准的JSON协议对换行符的要求,比如短信内容中包含\r\n的情况在JSON中需要表示成\\r\\n,否则会导致JSON在服务端解析失败
		  request.setTemplateParam("{\"code\":\""+content+"\"}");
		//可选-上行短信扩展码(扩展码字段控制在7位或以下，无特殊需求用户请忽略此字段)
		//request.setSmsUpExtendCode("90997");
		//可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者
		//  request.setOutId("yourOutId");
		//请求失败这里会抛ClientException异常
		SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);
		System.out.println(Json.toJson(sendSmsResponse));
		if(sendSmsResponse.getCode() != null && sendSmsResponse.getCode().equals("OK")) {
			return "OK";
		}
		return null;
	}
	/**
	 * 上传发票短信提醒
	 */
	public String sendInvoiceMsg(String phone, String content) throws Exception{
		//设置超时时间-可自行调整
		System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
		System.setProperty("sun.net.client.defaultReadTimeout", "10000");
//初始化ascClient需要的几个参数
		final String product = "Dysmsapi";//短信API产品名称（短信产品名固定，无需修改）
		final String domain = "dysmsapi.aliyuncs.com";//短信API产品域名（接口地址固定，无需修改）
//替换成你的AK
		final String accessKeyId = "LTAIQAiWQ9wbhGtZ";//你的accessKeyId,
		final String accessKeySecret = "eM7Fc3UIGpb9cgM0Mkl2Ftpe94qr0M";//你的accessKeySecret，参考本文档步骤2
//初始化ascClient,暂时不支持多region（请勿修改）
		IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId,
				accessKeySecret);
		DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
		IAcsClient acsClient = new DefaultAcsClient(profile);
		//组装请求对象
		SendSmsRequest request = new SendSmsRequest();

		//使用post提交
		request.setMethod(MethodType.POST);
		//必填:待发送手机号。支持以逗号分隔的形式进行批量调用，批量上限为1000个手机号码,批量调用相对于单条调用及时性稍有延迟,验证码类型的短信推荐使用单条调用的方式；发送国际/港澳台消息时，接收号码格式为00+国际区号+号码，如“0085200000000”
		request.setPhoneNumbers(phone);
		//必填:短信签名-可在短信控制台中找到
		request.setSignName("阅米");
		//必填:短信模板-可在短信控制台中找到
		request.setTemplateCode("SMS_152208163");
		//可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
		//友情提示:如果JSON中需要带换行符,请参照标准的JSON协议对换行符的要求,比如短信内容中包含\r\n的情况在JSON中需要表示成\\r\\n,否则会导致JSON在服务端解析失败
		  request.setTemplateParam("{\"code\":\""+content+"\"}");
		//可选-上行短信扩展码(扩展码字段控制在7位或以下，无特殊需求用户请忽略此字段)
		//request.setSmsUpExtendCode("90997");
		//可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者
		//  request.setOutId("yourOutId");
//请求失败这里会抛ClientException异常
		SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);
		if(sendSmsResponse.getCode() != null && sendSmsResponse.getCode().equals("OK")) {
			return "OK";
		}
		return null;
	
	}
	/**
	 * 上传发票短信提醒（锁定体现）
	 */
	public String sendInvoiceMsg2(String phone, String content) throws Exception{


		//设置超时时间-可自行调整
		System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
		System.setProperty("sun.net.client.defaultReadTimeout", "10000");
//初始化ascClient需要的几个参数
		final String product = "Dysmsapi";//短信API产品名称（短信产品名固定，无需修改）
		final String domain = "dysmsapi.aliyuncs.com";//短信API产品域名（接口地址固定，无需修改）
//替换成你的AK
		final String accessKeyId = "LTAIQAiWQ9wbhGtZ";//你的accessKeyId,
		final String accessKeySecret = "eM7Fc3UIGpb9cgM0Mkl2Ftpe94qr0M";//你的accessKeySecret，参考本文档步骤2
//初始化ascClient,暂时不支持多region（请勿修改）
		IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId,
				accessKeySecret);
		DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
		IAcsClient acsClient = new DefaultAcsClient(profile);
		//组装请求对象
		SendSmsRequest request = new SendSmsRequest();

		//使用post提交
		request.setMethod(MethodType.POST);
		//必填:待发送手机号。支持以逗号分隔的形式进行批量调用，批量上限为1000个手机号码,批量调用相对于单条调用及时性稍有延迟,验证码类型的短信推荐使用单条调用的方式；发送国际/港澳台消息时，接收号码格式为00+国际区号+号码，如“0085200000000”
		request.setPhoneNumbers(phone);
		//必填:短信签名-可在短信控制台中找到
		request.setSignName("阅米");
		//必填:短信模板-可在短信控制台中找到
		request.setTemplateCode("SMS_152212977");
		//可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
		//友情提示:如果JSON中需要带换行符,请参照标准的JSON协议对换行符的要求,比如短信内容中包含\r\n的情况在JSON中需要表示成\\r\\n,否则会导致JSON在服务端解析失败
		  request.setTemplateParam("{\"code\":\""+content+"\"}");
		//可选-上行短信扩展码(扩展码字段控制在7位或以下，无特殊需求用户请忽略此字段)
		//request.setSmsUpExtendCode("90997");
		//可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者
		//  request.setOutId("yourOutId");
//请求失败这里会抛ClientException异常
		SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);
		if(sendSmsResponse.getCode() != null && sendSmsResponse.getCode().equals("OK")) {
			return "OK";
		}
		return null;
	
	}
	@Override
	public String getResultMsg(int result) {
		switch (result) {
		case 0:
			return "成功";
		case -1:
			return "账号无效";
		case -2:
			return "参数：无效";
		case -3:
			return "连接不上服务器";
		case -5:
			return "无效的短信数据，号码格式不对";
		case -6:
			return "用户名密码错误";
		case -7:
			return "旧密码不正确";
		case -9:
			return "资金账户不存在";
		case -11:
			return "包号码数量超过最大限制";
		case -12:
			return "余额不足";
		case -99:
			return "系统内部错误";
		case -100:
			return "其它错误";
		}
		return "发送失败";
	}
}
